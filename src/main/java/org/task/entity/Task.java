package org.task.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;
}
