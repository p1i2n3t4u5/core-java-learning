package cloning.deepcopy;

public class DeepCloneTest {

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
		System.out.println("printing cloned object after chaging name:\n" + student2);
		System.out.println("printing original object after chaging name in cloned object :\n" + student);

		student2.getAddress().setCity("Bangalore");
		System.out.println("printing the cloned object:" + student2);
		System.out.println("Printing after changing cloned object's inner object's city value   \n" + student);
	}

}
