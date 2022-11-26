package com.example.springjpademo;

import com.example.springjpademo.entity.Employee;
import com.example.springjpademo.repo.IAddressRepo;
import com.example.springjpademo.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {


    @Autowired
    private IEmployeeRepo employeeRepo;

    @Autowired
    private IAddressRepo addressRepo;

    @Transactional
    public Employee createEmployee(Employee employee)  {
        addressRepo.save(employee.getAddress());
        employeeRepo.save(employee);
        if(employee.getAddress().getCity().equals("Kanpur")){
            throw new RuntimeException();
        }
        return employee;
    }


    public Employee findByName(String name){
        return null;
    }

    public Employee findById(Integer id){
        return employeeRepo.findById(id).get();
    }

}
