package com.example.swagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "name API")
public class NameController {
    @Operation(summary = "Get the username", description = "Returns the name of the user")

    @GetMapping("/name")
    public String getName(@RequestParam @Parameter(name = "name", description = "The name of the user", example = "Alessio") String name) {
        return name;
    }
    @Operation(summary = "Get username reversed", description = "Returns the username, but reversed")
    @PostMapping("/reversename")
    public StringBuilder postName(@RequestParam @Parameter(name = "name", description = "The name of the user", example = "Alessio") StringBuilder name) {
        return name.reverse();
    }
}
