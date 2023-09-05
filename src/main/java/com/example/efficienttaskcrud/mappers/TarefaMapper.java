package com.example.efficienttaskcrud.mappers;

import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.model.Tarefa;

public interface TarefaMapper {

    TarefaDTO toDTO(Tarefa tarefa);

}
