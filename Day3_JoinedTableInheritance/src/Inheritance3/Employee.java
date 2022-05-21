package Inheritance3;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EMP_STIRE3")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee implements Serializable {
	private static final long serilVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empID;
	private String name;
	private double salary;
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	
}
