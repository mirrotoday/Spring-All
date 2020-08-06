package com.xpossess.springboot.controller;

import com.xpossess.springboot.bean.Departments;
import com.xpossess.springboot.bean.Employee;
import com.xpossess.springboot.mapper.DepartmentsMapper;
import com.xpossess.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    DepartmentsMapper departmentsMapper;

    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/dept/{id}")
    public Departments getDepartments(@PathVariable("id") Integer id){
        return departmentsMapper.getDeptById(id);
    }
    @GetMapping("/dept")
    public Departments insertDept(Departments departments){
        departmentsMapper.insertDept(departments);
        return departments;
    }
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

}
