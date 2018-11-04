package com.source.document.service;

import com.source.document.model.Employee;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

public abstract interface IService
{
  public abstract List<Employee> getEmployees();
  
  public abstract Employee storeEmployee(@RequestBody Employee paramEmployee);
  
  public abstract Employee updateEmployee(@RequestBody Employee paramEmployee);
  
  public abstract List<Employee> getEmployeeByName(String paramString);
  
  public abstract List<Employee> getEmployeeBySTATUS(String paramString);
  
  public abstract List<Employee> getEmployeeByENDDATE(Date paramDate);
  
  public abstract void delete(int paramInt);
}