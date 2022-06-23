import java.util.Date;

public class Staff extends Human {
	private String department;
	private double salary;
	Staff (String id, String fullname, Date DateOfBirth, String telephoneNumber, String address, String department, double salary){
	super(id, fullname, DateOfBirth, telephoneNumber, address );
	this.setDepartment(department);
	this.setSalary(salary);
	}
	
	public void setDepartment(String department){
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return new String(
					"Staff {" + "\n"
							+super.toString() + "\n"
							+"Department:" +department+ "\n"
							+"Salary:" +salary+ "\n"
							+ "}"
				);
		
	}
	public void giveRaise(double amount){
		salary=salary+amount;
	}
	

}
