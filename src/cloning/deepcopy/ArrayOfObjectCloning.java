package cloning.deepcopy;import java.util.Arrays;

public class ArrayOfObjectCloning {
	public static void main(String[] args) {
	  
    Student[] arr = new Student[10];
    arr[0] = new Student(1, "Niranjan", null);
    arr[1] = new Student(2, "Satya", null);
    Student[] arr2 = arr.clone();
    if (arr == arr2) {
      System.out.println("equal" + arr + "   " + arr2);
    } else {
      System.out.println("Array not equal" + arr + "   " + arr2);
    }
    
    arr[0].setName("Niranjan_updated");
		System.out.println("check:  "+arr[0] + "  " + arr2[0]);

		Student[] arr3 = arr.clone();
		System.out.println(arr3[0]);
		System.out.println(Arrays.equals(arr, arr3));
		System.out.println(arr.equals(arr3));  //wrong practice
		System.out.println("Both array pointing to same object:" + arr[0].equals(arr3[0]));
		System.out.println(arr == arr3);
		System.out.println(arr.getClass() == arr3.getClass());
	}

}
