package com.example.efficienttaskcrud.dto;

import com.example.efficienttaskcrud.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TarefaDTO {
        @NonNull
        private Long id;
        @NonNull
        private String title;
        @NonNull
        private String description;
        @NonNull
        private String status;

        public Tarefa toEntity() {
                return new Tarefa(
                        this.getId(),
                        this.getTitle(),
                        this.getDescription(),
                        this.getStatus());
        }

}
