package cloning.deepcopy;

public class Student implements Cloneable{
	
	private int id;
	
	private String name;
	
	private Address address;
	
	public Student() {
		
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		Student clonedObj = (Student) super.clone();
		clonedObj.setAddress(address.clone());
//		clonedObj.setId(this.id);
//		clonedObj.setName(new String(this.name));
		return clonedObj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]"+this.hashCode();
	}
	
	

}
