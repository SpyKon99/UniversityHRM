import java.util.Date;

public class Faculty extends Human {
	public String title;
	private String academicDepartment;
	Faculty(String id, String fullname, Date DateOfBirth, String telephoneNumber, String address, String title, String academicDepartment){
		super(id, fullname, DateOfBirth, telephoneNumber, address );
		this.setTitle(title);
		this.setAcademicDepartment(academicDepartment);
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle() {
		return title;
	}	
	
	
	public void setAcademicDepartment(String academicDepartment){
		this.academicDepartment=academicDepartment;
	}
	public String getAcademicDepartment() {
		return academicDepartment;
	}
	
	public String toString() {
		return new String(
					"Faculty {" + "\n"
							+super.toString() + "\n"
							+"Title:" +title+ "\n"
							+"Academic Department:" +academicDepartment+ "\n"
							+ "}"
				);
	}	
}
