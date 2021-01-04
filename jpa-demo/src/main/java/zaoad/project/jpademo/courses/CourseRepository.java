package zaoad.project.jpademo.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findBytopicId(String topicId);
	public List<Course> findByName(String name);
	public List<Course> findByTopicId(String topicId);
	
}
