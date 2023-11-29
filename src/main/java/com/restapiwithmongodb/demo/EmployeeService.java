package com.restapiwithmongodb.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    
   List<Employee> getAll(){
        return this.employeeRepo.findAll();

    }

public Employee addEmployee(Employee employee) {
    this.employeeRepo.save(employee);
   return employee;
}

// public Employee deleteEmployee(Integer id) {
//     Employee e= this.employeeRepo.findById(id).get();
//     this.employeeRepo.deleteById(id);
//     return e;

// }
}
