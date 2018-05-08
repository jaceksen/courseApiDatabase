package pl.jaceksen.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// pobieramy kursy dla danego topicu
	public List<Course> findByTopicId(String topicId);

	// pobieramy kursy dla danej nazwy kursu
	public List<Course> findByName(String name);

	// pobieramy kursy dla daneego description kursu
	public List<Course> findByDescription(String description);

}
