package zaoad.project.jpademo.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zaoad.project.jpademo.topics.Topic;
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getCourses(@PathVariable String topicId)
	{
		return courseService.getAllCourses(topicId);	
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id)
	{
		return courseService.getCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicId,@RequestBody Course course)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT,value="topics/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable String id,@RequestBody Course course,@PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(id,course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="topics/{TopicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id)
	{
		courseService.deleteCourse(id);
	}
}
