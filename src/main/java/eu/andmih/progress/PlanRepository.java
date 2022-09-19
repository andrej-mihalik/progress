package eu.andmih.progress;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "plans", path = "plans")
public interface PlanRepository extends MongoRepository<Plan,String> {
}
