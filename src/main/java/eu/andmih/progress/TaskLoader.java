package eu.andmih.progress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskLoader implements CommandLineRunner {

    private final TaskRepository repository;
    private final PlanRepository prepository;

    @Autowired
    public TaskLoader(TaskRepository repository,PlanRepository prepository){
        this.repository = repository;
        this.prepository = prepository;
    }


    public void run(String... strings) throws Exception {
        //this.repository.save(new Task("take out the trash", 1.0));
        //this.repository.save(new Task("world domination", 5.0));
        //Task t1 = new Task("read a book", 1.0);
        //Plan p1 = new Plan("learning");
        //p1.addTask(t1);
        //this.repository.save(t1);
        //this.prepository.save(p1);
    }
}
