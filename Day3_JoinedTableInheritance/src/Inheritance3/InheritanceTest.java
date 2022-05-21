package Inheritance3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Sunil");
		emp.setSalary(25000);
		em.persist(emp);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Sandeep");
		manager.setSalary(70000);
		manager.setDeptName("Program Specialist");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("added one emp and one manager");
		em.close();
		factory.close();
	}

}
