import java.util.Date;
public class Student extends Human {
	private String AM;
	private String academicDepartment;
	private int semester;
	Student(String id, String fullname, String AM, Date DateOfBirth, String telephoneNumber, String address, String academicDepartment, int semester){
		super(id, fullname, DateOfBirth, telephoneNumber, address );
		this.setam(AM);
		this.setAcademicDepartment(academicDepartment);
		this.setSemester(semester);
	}
	
	public void setam(String AM){
		this.AM=AM;
	}
	public String getam() {
		return AM;
	}	
	
	public void setAcademicDepartment(String academicDepartment){
		this.academicDepartment=academicDepartment;
	}
	public String getAcademicDepartment() {
		return academicDepartment;
	}
	
	public void setSemester(int semester){
		this.semester=semester;
	}
	public int getSemester() {
		return semester;
	}	

	public String toString() {
		return new String(
					"Student {" + "\n"
							+super.toString() + "\n"
							+"AM:" +AM+ "\n"
							+"Academic Department:" +academicDepartment+ "\n"
							+"Semester:" +semester+  "\n"
							+ "}"
				);
	}
	public void  advanceSemester() {
		semester=semester+1;
	}
}
