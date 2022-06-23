import java.util.Date;

public abstract class Human {
	
	public String id;
	public String fullname;
	private Date DateOfBirth;
	private String telephoneNumber;
	private String address;
	
	Human(String id,String fullname,Date DateOfBirth,String telephoneNumber,String address){
		this.setId(id);
		this.setFullname(fullname);
		this.setdateOfBirth(DateOfBirth);
		this.setTelephoneNumber(telephoneNumber);
		this.setAddress(address);
	} 

	public void setId(String id) {
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	
	public void setFullname(String fullname) {
		this.fullname=fullname;
	}
	public String getFullname(){
		return this.fullname;
	}
	
	public void setdateOfBirth(Date DateOfBirth){
		this.DateOfBirth=DateOfBirth;
	}
	public Date getdateOfBirth(){
		return this.DateOfBirth;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber=telephoneNumber;
	}
	public String getTelephoneNumber(){
		return this.telephoneNumber;
	}	

	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
	
	public String toString(){
		String ret = new String("Id:" +id+ "\n"
									+"Fullname:" +fullname+ "\n" 
									+"Date of birth:" +DateOfBirth+ "\n" 
									+"Telephone number:" +telephoneNumber+ "\n" 
									+"Address:" +address+ "" );
		return ret;
	}

	
}
