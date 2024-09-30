package edu.escuelaing.NameIETI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NameController class
 * 
 * This controller handles HTTP GET requests and returns a static string.
 */
@RestController
public class NameController {

    /**
     * Handles GET requests to /name and returns a string with the name.
     * 
     * @return A string that says "My name is Johann Amaya"
     */
    @GetMapping("/name")
    public String getName() {
        return "My name is Johann Amaya";
    }
}