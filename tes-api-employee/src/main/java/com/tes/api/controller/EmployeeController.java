package com.tes.api.controller;

import com.tes.api.entity.Employee;
import com.tes.api.exception.EmployeeValidationException;
import com.tes.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/createEmployee")
    public Object createEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("/getEmployeeById/{userId}")
    public Employee getEmployeeById(@PathVariable Integer userId){
        return service.GetEmployeeById(userId);
    }
}
