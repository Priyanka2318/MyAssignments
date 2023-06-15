package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Id: "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Name and Id: " +name+" " +id);
	}
	public void getStudentInfo(String email, long Phoneno) {
		System.out.println("Email Id: " +email + " Phone number: "+Phoneno);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(12345);
		stud.getStudentInfo(123, "Priyanka");
		stud.getStudentInfo("Priyanka@gmail.com", 587654321);

	}

}
