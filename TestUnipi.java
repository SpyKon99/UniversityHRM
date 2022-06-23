import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class TestUnipi {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Human> list = new ArrayList<Human>();
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Staff staff1 = new Staff("s1","Petros Petrou", sdf.parse("02/08/1988"), "2102819998", "Naxou 5", "Logistirio", 800);
		Staff staff2 = new Staff("s2", "Ariadni Gogou", sdf.parse("29/1/1975"), "2104537228", "Kuprou 28", "Misthodosia", 1000);
		Staff staff3 = new Staff("s3", "Mary Theodorou",  sdf.parse("11/12/1994"), "2105432148", "Limnou 12" , "Vivliothiki", 1200);
		
		Student student1 = new Student("st1", "Giannis Giannoulis", "E12009", sdf.parse("2/3/1998"), "2102828228", "Panepistimiou 2", "Department of Digital Systems", 6 );
		Student student2 = new Student("st2", "Maria Pappa", "P12008", sdf.parse("23/5/1997"), "2102987228", "Stadiou 22", "Department of Informatics", 8);
		Student student3 = new Student("st3", "John Smith", "E12010", sdf.parse("11/9/2000"), "2109878228", "Antheon 2" , "Department of Digital Systems", 4);
		
		Faculty faculty1 = new Faculty("st1", "Marios Antoniou", sdf.parse("22/3/1996"), "2107812345", "Kerkyras 92", "Epikouros", "Department of Digital Systems");
		Faculty faculty2 = new Faculty("st2", "Petroula Vagia", sdf.parse("11/5/1992"), "2107788999", "Leukadas 72", "Anaplirotis", "Department of Informatics");
		Faculty faculty3 = new Faculty("st3", "Marilena Vaiou", sdf.parse("8/11/1970"), "2102233115", "Paxon 8" , "Kathigitis", "Department of Informatics");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);	
		
		list.add(staff1);
		list.add(staff2);
		list.add(staff3);
		
		list.add(faculty1);
		list.add(faculty2);
		list.add(faculty3);
				
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Staff) {
				((Staff)(list.get(i))).giveRaise(50);
			}
			if(list.get(i) instanceof Student) {
				((Student)(list.get(i))).advanceSemester();
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		

	}
}
