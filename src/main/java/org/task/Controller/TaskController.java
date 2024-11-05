package org.task.Controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.task.Repository.TaskRepository;
import org.task.entity.Task;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getTask(){
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
    return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails){
        Task task= taskRepository.findById(id).orElseThrow();
        task.setTitle(taskDetails.getTitle());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskRepository.deleteById(id);
    }

}
