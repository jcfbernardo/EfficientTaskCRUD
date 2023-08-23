package com.example.efficienttaskcrud.service;

import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.model.Tarefa;

import java.util.List;

public interface TarefaService {

    List<TarefaDTO> getAllTarefas();
    Tarefa getTarefa(Long tarefaId);
    Tarefa createTarefa(Tarefa tarefa);
    void updateTarefa(TarefaDTO tarefaDTO);
    void deleteTarefa(Long tarefaId);

}
