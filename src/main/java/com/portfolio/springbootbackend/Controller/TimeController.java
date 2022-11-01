/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Controller;

import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gaston
 */
@RestController
@RequestMapping("/api/v1.0")
public class TimeController {
    
    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime(){
     
        return Instant.now().toString();
    }
    
}
