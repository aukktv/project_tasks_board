package lt.aukktv.projectboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lt.aukktv.projectboard.domain.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long>{
	
	ProjectTask getById (Long id);
	

}
