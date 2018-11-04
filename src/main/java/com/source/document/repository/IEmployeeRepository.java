package com.source.document.repository;

import com.source.document.model.Employee;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.Repository;

public abstract interface IEmployeeRepository
  extends Repository<Employee, Integer>
{
  public abstract Employee save(Employee paramEmployee);
  
  public abstract List<Employee> findAll();
  
  public abstract List<Employee> findByfirstname(String paramString);
  
  public abstract List<Employee> findBystatus(String paramString);
  
  public abstract List<Employee> findByenddate(Date paramDate);
  
  public abstract void delete(int paramInt);
}