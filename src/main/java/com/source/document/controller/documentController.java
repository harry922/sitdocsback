package com.source.document.controller;

import com.source.document.constant.URI;
import com.source.document.model.Employee;
import com.source.document.service.IService;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;








@CrossOrigin(origins={"*"}, allowedHeaders={"*"})
@RestController
@RequestMapping({"api"})
public class documentController
{
  private IService service;
  
  public documentController(IService service)
  {
    this.service = service;
  }
  
  @RequestMapping(value=URI.EMPLOYEES, method={org.springframework.web.bind.annotation.RequestMethod.GET}, produces={"application/json;charset=UTF-8"})
  public List<Employee> getEmployees()
  {
    return service.getEmployees();
  }
  
  @ResponseBody
  @RequestMapping(value=URI.ADDEMPLOYEE, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Employee addEmployee(@RequestBody Employee employee)
  {
    return service.storeEmployee(employee);
  }
  



  @ResponseBody
  @RequestMapping(value=URI.UPDATEEMPLOYEE, method={org.springframework.web.bind.annotation.RequestMethod.PUT}, consumes={"application/json;charset=UTF-8"}, produces={"application/json;charset=UTF-8"})
  public Employee updateEmployee(@RequestBody Employee employee)
  {
    return service.storeEmployee(employee);
  }
  


  @RequestMapping(value=URI.GETEMPLOYEEBYNAME, method={org.springframework.web.bind.annotation.RequestMethod.GET}, produces={"application/json;charset=UTF-8"})
  public List<Employee> getEmployeeByName(@PathVariable("firstname") String firstname)
  {
    return service.getEmployeeByName(firstname);
  }
  
  @RequestMapping(value=URI.GETEMPLOYEEBYSTATUS, method={org.springframework.web.bind.annotation.RequestMethod.GET}, produces={"application/json;charset=UTF-8"})
  public List<Employee> getEmployeeBySTATUS(@PathVariable("status") String status) {
    return service.getEmployeeBySTATUS(status);
  }
  
  @RequestMapping(value={"get-employee-by-enddate/{enddate}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET}, produces={"application/json;charset=UTF-8"})
  public List<Employee> getEmployeeByENDDATE(@PathVariable("enddate") Date enddate)
  {
    return service.getEmployeeByENDDATE(enddate);
  }
  
  @RequestMapping(value=URI.DELETEEMPLOYEE, method={org.springframework.web.bind.annotation.RequestMethod.DELETE})
  public void deleteEmployee(@PathVariable int employeeid)
  {
    service.delete(employeeid);
  }
}