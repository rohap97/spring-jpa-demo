package com.example.springjpademo.controller;

import com.example.springjpademo.EmployeeService;
import com.example.springjpademo.entity.Branch;
import com.example.springjpademo.entity.Employee;
import com.example.springjpademo.exception.EmployeeAppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    private ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) throws URISyntaxException, EmployeeAppException {
        employee =  employeeService.createEmployee(employee);
        URI location = new URI("/employee/"+employee.getId());
        return ResponseEntity.created(location).body(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getBranchbyId(@PathVariable Integer id){
        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);
    }

}
