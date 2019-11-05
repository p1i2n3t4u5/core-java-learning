package cloning.shallow;

public class ShallowCloneTest {

	public static void main(String[] args) {
		Student student = new Student(1, "Niranjan", new Address("charampa", "bhadrak"));
		System.out.println(student);
		Student student2 = null;
		try {
			student2 = student.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("printing cloned object:\n" + student2);
		student2.setName("Satya");
		System.out.println("printing cloned object changing name :\n" + student2);
		System.out.println("printing original object:\n" + student);

		student2.getAddress().setCity("Bangalore");

		System.out.println("Printing after changing inner objects values \n" + student);

	}

}
