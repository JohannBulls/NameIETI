package edu.escuelaing.NameIETI.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * NameControllerTest class
 * 
 * This class contains unit tests for the NameController.
 * It verifies that the /name endpoint returns the expected result.
 */
@WebMvcTest(NameController.class)
public class NameControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test to verify that the /name endpoint returns "My name is Johann Amaya".
     * 
     * @throws Exception if an error occurs during request execution
     */
    @Test
    public void shouldReturnMyName() throws Exception {
        this.mockMvc.perform(get("/name"))
                .andExpect(status().isOk()) // Verifies that the HTTP status is 200 OK
                .andExpect(content().string("My name is Johann Amaya")); // Verifies that the content matches
    }
}