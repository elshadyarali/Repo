package com.mumsched.cs.services;

import java.util.List;

import com.mumsched.cs.domains.Section;
import com.mumsched.cs.domains.Section;

public interface SectionService {

    void createNewSection(Section section, Long courseId, Long blockId);
    void createNewSection(Section section);
	Section getSection(Long id);
	List<Section> getAllSections();
	void updateSection(Section section);
	void deleteSection(Long id);
	List<Section> getSectionBycourse(Long id);
	List<Section> getSectionByBlock(Long id);
	List<Section> getSectionByFaculId(Long id);
	
}
