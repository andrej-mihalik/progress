package eu.andmih.progress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskLoader implements CommandLineRunner {

    private final TaskRepository repository;

    @Autowired
    public TaskLoader(TaskRepository repository){
        this.repository = repository;
    }

    public void run(String... strings) throws Exception {
        this.repository.save(new Task("take out the trash", 1.0));
        this.repository.save(new Task("world domination", 5.0));
    }
}
