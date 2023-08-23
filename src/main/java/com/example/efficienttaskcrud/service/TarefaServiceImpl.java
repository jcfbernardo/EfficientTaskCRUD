package com.example.efficienttaskcrud.service;

import com.example.efficienttaskcrud.model.Tarefa;
import com.example.efficienttaskcrud.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;


    @Override
    public List<Tarefa> getAllTarefas() {
        return tarefaRepository.findAll();
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
    public Tarefa updateTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void deleteTarefa(Long tarefaId) {
        tarefaRepository.deleteById(tarefaId);
    }
}
