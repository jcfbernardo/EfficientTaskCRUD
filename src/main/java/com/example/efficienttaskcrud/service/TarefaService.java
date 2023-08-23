package com.example.efficienttaskcrud.service;

import com.example.efficienttaskcrud.model.Tarefa;

import java.util.List;

public interface TarefaService {

    List<Tarefa> getAllTarefas();
    Tarefa getTarefa(Long tarefaId);
    Tarefa createTarefa(Tarefa tarefa);
    Tarefa updateTarefa(Tarefa tarefa);
    void deleteTarefa(Long tarefaId);

}
