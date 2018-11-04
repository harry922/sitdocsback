package com.source.document.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int employeeid;
  @Column
  private String firstname;
  @Column
  private String lastname;
  @Column
  private String status;
  @Column
  private Date startdate;
  @Column
  private Date enddate;
  @Column
  private String phone;
  @Column
  private String email;
  @Column
  private String description;
  @Column
  private String documentnumber;
  @Column
  private Date empstartdate;
  @Column
  private Date empenddate;
  
  
  
  
  
  
  
  public Date getEmpstartdate() {
	return empstartdate;
}

public void setEmpstartdate(Date empstartdate) {
	this.empstartdate = empstartdate;
}

public Date getEmpenddate() {
	return empenddate;
}

public void setEmpenddate(Date empenddate) {
	this.empenddate = empenddate;
}



public Employee(int employeeid, String firstname, String lastname, String status, Date startdate, Date enddate,
		String phone, String email, String description, String documentnumber, Date empstartdate, Date empenddate) {
	super();
	this.employeeid = employeeid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.status = status;
	this.startdate = startdate;
	this.enddate = enddate;
	this.phone = phone;
	this.email = email;
	this.description = description;
	this.documentnumber = documentnumber;
	this.empstartdate = empstartdate;
	this.empenddate = empenddate;
}

public String getDocumentnumber() {
	return documentnumber;
}

public void setDocumentnumber(String documentnumber) {
	this.documentnumber = documentnumber;
}

public int getEmployeeid()
  {
    return employeeid;
  }
  
  public void setEmployeeid(int employeeid) { this.employeeid = employeeid; }
  
  public String getFirstname() {
    return firstname;
  }
  
  public void setFirstname(String firstname) { this.firstname = firstname; }
  
  public String getLastname() {
    return lastname;
  }
  
  public void setLastname(String lastname) { this.lastname = lastname; }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) { this.status = status; }
  
  public Date getStartdate() {
    return startdate;
  }
  
  public void setStartdate(Date startdate) { this.startdate = startdate; }
  
  public Date getEnddate() {
    return enddate;
  }
  
  public void setEnddate(Date enddate) { this.enddate = enddate; }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) { this.phone = phone; }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) { this.email = email; }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) { this.description = description; }
  

 
  
  public Employee() {}
}