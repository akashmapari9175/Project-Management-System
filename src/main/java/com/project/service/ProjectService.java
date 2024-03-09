package com.project.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.exception.GlobalExceptionHandler;
import com.project.exception.UserNotFoundException;
import com.project.model.Project;
import com.project.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project createProject(Project project) {
		Project save = projectRepository.save(project);
		return save;
	}
	
	public List<Project> getAllProject(){
		List<Project> allProject = projectRepository.findAll();
		return allProject;
	}
	
	public Project getProjectBYId(long id) {
		Project project = projectRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
		return project;
	}
	
	 // Update operation
    public Project updateProject(Long id, Project updatedProject) {
    	Project project = projectRepository.findById(id).orElseThrow( ()->new UserNotFoundException(id));
    	updatedProject.setId(id);
    	Project save = projectRepository.save(updatedProject);
    	return save;
    	
    }
    
    public void deleteProject(Long id) {
        Project existingProject = projectRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));;
        projectRepository.deleteById(id);
    }

	
	
}

