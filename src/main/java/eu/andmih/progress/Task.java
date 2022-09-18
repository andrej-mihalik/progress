package eu.andmih.progress;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Task {

    private @Id @GeneratedValue Long id;
    private String objective;
    private Double reward;

    private Task(){};

    public Task(String objective, Double reward){
        this.objective = objective;
        this.reward = reward;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(objective,task.objective);
    }

    @Override
    public int hashCode(){
        return Objects.hash(objective);
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    @Override
    public String toString(){
        return "Task: " + objective;
    }
}
