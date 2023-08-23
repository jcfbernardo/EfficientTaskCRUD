package com.example.efficienttaskcrud.controller;


import com.example.efficienttaskcrud.model.Tarefa;
import com.example.efficienttaskcrud.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tarefas/")
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @GetMapping("all")
    public List<Tarefa> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }

    @GetMapping
    public Tarefa getTarefa(@Param("tarefaId") String tarefaId) {
        return tarefaService.getTarefa(Long.parseLong(tarefaId));
    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.createTarefa(tarefa);
    }

    @PutMapping
    public Tarefa updateTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.updateTarefa(tarefa);
    }

    @DeleteMapping
    public void deleteTarefa(@Param("tarefaId") String tarefaId) {
        tarefaService.deleteTarefa(Long.parseLong(tarefaId));
    }

}
