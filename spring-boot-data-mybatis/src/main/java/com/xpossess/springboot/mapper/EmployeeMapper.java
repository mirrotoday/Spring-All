package com.xpossess.springboot.mapper;

import com.xpossess.springboot.bean.Employee;

/**
 * Mybatis 配置版
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void inserEmp(Employee employee);
}
