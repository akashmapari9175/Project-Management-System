package com.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.model.Project;
import com.project.repository.ProjectRepository;
import com.project.service.ProjectService;

import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    @Test
    void testCreateProject() {
        // Mock data
        Project project = new Project("Test Project", "Description", "date", "date2");

        // Mock repository behavior
        Mockito.when(projectRepository.save(any(Project.class))).thenReturn(project);

        // Call the service method
        Project createdProject = projectService.createProject(project);

        // Verify the result
        assertEquals(project.getName(), createdProject.getName());
        assertEquals(project.getDescription(), createdProject.getDescription());
        assertEquals(project.getStartDate(), createdProject.getStartDate());
        assertEquals(project.getEndDate(), createdProject.getEndDate());
    }

    // Add similar tests for other service methods
}
