package com.project;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.controller.ProjectController;
import com.project.model.Project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProjectController.class)
@AutoConfigureMockMvc
class ProjectControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCreateProject() throws Exception {
        // Mock data
    	Project project = new Project("Test Project", "Description", "date", "date2");

        // Perform the request and verify the response
        mockMvc.perform(post("/projects")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(project)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value(project.getName()))
                .andExpect(jsonPath("$.description").value(project.getDescription()))
                .andExpect(jsonPath("$.startDate").value(project.getStartDate().toString()))
                .andExpect(jsonPath("$.endDate").value(project.getEndDate().toString()));
    }

}
