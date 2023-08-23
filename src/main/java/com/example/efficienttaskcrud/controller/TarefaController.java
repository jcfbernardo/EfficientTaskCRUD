package com.example.efficienttaskcrud.controller;


import com.example.efficienttaskcrud.dto.TarefaDTO;
import com.example.efficienttaskcrud.model.Tarefa;
import com.example.efficienttaskcrud.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tarefas/")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;


    @GetMapping("all")
    public List<TarefaDTO> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }

    @GetMapping
    public Tarefa getTarefa(@Param("tarefaId") String tarefaId) {
        return tarefaService.getTarefa(Long.parseLong(tarefaId));
    }

    @PostMapping
    public ResponseEntity<Object> createTarefa(@RequestBody TarefaDTO tarefaDTO) {
        Tarefa tarefa = tarefaDTO.toEntity();
        try {
            tarefaService.createTarefa(tarefa);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Object> updateTarefa(@RequestBody TarefaDTO tarefaDTO) {
        try {
            tarefaService.updateTarefa(tarefaDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @DeleteMapping
    public void deleteTarefa(@Param("tarefaId") String tarefaId) {
        tarefaService.deleteTarefa(Long.parseLong(tarefaId));
    }

}
