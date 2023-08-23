package com.example.efficienttaskcrud.mappers;

import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.model.Tarefa;
import org.springframework.stereotype.Component;

@Component
public interface TarefaMapper {

    TarefaDTO toDTO(Tarefa tarefa);

}
