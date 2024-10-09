package com.ironhack.labweek8.controller;

import com.ironhack.labweek8.model.Employee;
import com.ironhack.labweek8.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employees")
public class EmployeeControllerImpl implements EmployeeControllerInterface {

  private final EmployeeService employeeService;

  @GetMapping("/all")
  @ResponseStatus(HttpStatus.OK)
  public List<Employee> getEmployees() {
    return employeeService.getAllEmployees();
  }
 
}