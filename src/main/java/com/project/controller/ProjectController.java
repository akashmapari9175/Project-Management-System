package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exception.UserNotFoundException;
import com.project.model.Project;
import com.project.service.ProjectService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@PostMapping
	public ResponseEntity<Project> createProject(@Valid @RequestBody Project project)
	{
		Project createProject = service.createProject(project);
		return new ResponseEntity<>(createProject,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Project>> getAllProject(){
		List<Project> allProject = service.getAllProject();
		return new ResponseEntity<>(allProject,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable("id") long userId ){
		Project projectBYId = service.getProjectBYId(userId);
		return new ResponseEntity<>(projectBYId,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @Valid @RequestBody Project updatedProject) {
        Project updateProject = service.updateProject(id, updatedProject);
        return new ResponseEntity<Project>(updateProject,HttpStatus.OK);
    }
	
	 @DeleteMapping("/{id}")
	    public String deleteProject(@PathVariable Long id) {
	         service.deleteProject(id);
	        return "User deleted successfully "; 
	 }
	
	
	
}
