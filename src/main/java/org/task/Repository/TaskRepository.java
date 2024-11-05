package org.task.Repository;

import org.springframework.stereotype.Repository;
import org.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository

public interface TaskRepository extends JpaRepository<Task, Long>{

    List<Task> findAll();

}
