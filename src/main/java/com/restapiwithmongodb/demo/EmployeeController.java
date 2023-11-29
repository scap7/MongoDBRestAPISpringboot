package com.restapiwithmongodb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
    EmployeeService employeeService;


    @GetMapping("/")
   public ResponseEntity<?> getEmployee(){
        return ResponseEntity.ok(this.employeeService.getAll());

        
    }
    @PostMapping("/")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
       
        return  ResponseEntity.ok(this.employeeService.addEmployee(employee));
    }
    // @DeleteMapping("/{id}")
    // public ResponseEntity<?> deleteEmployee(@RequestParam Integer id){
    //     return ResponseEntity.ok(this.employeeService.deleteEmployee(id));
    // }

}
