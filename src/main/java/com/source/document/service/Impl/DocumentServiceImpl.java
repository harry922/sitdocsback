package com.source.document.service.Impl;

import com.source.document.model.Employee;
import com.source.document.repository.IEmployeeRepository;
import com.source.document.service.IService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class DocumentServiceImpl
  implements IService
{
  private IEmployeeRepository employeeRepository;
  
  @Autowired
  public DocumentServiceImpl(IEmployeeRepository employeeRepository)
  {
    this.employeeRepository = employeeRepository;
  }
  

  @Transactional
  public List<Employee> getEmployees()
  {
    return employeeRepository.findAll();
  }
  




  public Employee storeEmployee(Employee employee)
  {
    return employeeRepository.save(employee);
  }
  


  public Employee updateEmployee(Employee employee)
  {
    return employeeRepository.save(employee);
  }
  
  public List<Employee> getEmployeeByName(String firstname)
  {
    return employeeRepository.findByfirstname(firstname);
  }
  


  public List<Employee> getEmployeeBySTATUS(String status)
  {
    return employeeRepository.findBystatus(status);
  }
  

  public List<Employee> getEmployeeByENDDATE(Date enddate)
  {
    return employeeRepository.findByenddate(enddate);
  }
  
  public void delete(int employeeid)
  {
    employeeRepository.delete(employeeid);
  }
}