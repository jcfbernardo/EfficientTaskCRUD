package com.example.efficienttaskcrud.mappers;

import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.model.Tarefa;
import org.springframework.stereotype.Component;

@Component
public class TarefaMapperImpl implements TarefaMapper {

    @Override
    public TarefaDTO toDTO(Tarefa tarefa) {
        return new TarefaDTO(
            tarefa.getId(),
            tarefa.getTitle(),
            tarefa.getDescription(),
            tarefa.getStatus());
    }
}
