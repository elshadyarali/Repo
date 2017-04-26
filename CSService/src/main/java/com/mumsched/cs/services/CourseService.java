package com.mumsched.cs.services;

import java.util.List;

import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Course;
import com.mumsched.cs.domains.Section;

public interface CourseService {

    void createNewCourse(Course course);
	Course getCourse(Long id);
	List<Course> getAllCourses();
	void updateCourse(Course course);
	void deleteCourse(Long id);
	List<Long> getTargetBlocks(Long id);
	List<Section> getSections(Long id);
}
