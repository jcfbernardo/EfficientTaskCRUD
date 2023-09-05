package com.example.efficienttaskcrud.service;

import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.mappers.TarefaMapperImpl;
import com.example.efficienttaskcrud.model.Tarefa;
import com.example.efficienttaskcrud.repository.TarefaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    @Autowired
    private TarefaMapperImpl tarefaMapper;


    @Override
    public List<TarefaDTO> getAllTarefas() {
        List<Tarefa> tarefas = tarefaRepository.findAll();

        return tarefas.stream()
                .map(tarefaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Tarefa getTarefa(Long tarefaId) {
        return tarefaRepository.findById(tarefaId).get();
    }

    @Override
    public Tarefa createTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void updateTarefa(Long id, TarefaDTO tarefaDTO) {
        Optional<Tarefa> tarefaExistente = tarefaRepository.findById(id);
        if (tarefaExistente.isPresent()) {
            Tarefa tarefaAtualizada = tarefaDTO.toEntity();
            tarefaAtualizada.setId(tarefaExistente.get().getId());
            tarefaRepository.save(tarefaAtualizada);
        } else {
            throw new EntityNotFoundException("Tarefa não encontrada");
        }
    }

    @Override
    public void deleteTarefa(Long tarefaId) {
        tarefaRepository.deleteById(tarefaId);
    }
}
