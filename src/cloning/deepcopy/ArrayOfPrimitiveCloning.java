package cloning.deepcopy;

public class ArrayOfPrimitiveCloning {
	public static void main(String[] args) {
	  
	  int[] array = {23, 43, 55, 12};
    int[] copiedArray = array.clone();
    
    System.out.println(array == copiedArray);  // arrays are pointing two different memory location
    System.out.println(array[0] == copiedArray[0]); // original array and copiedArray have same values

		int[] arr = new int[10];
		int[] arr2 = arr.clone();
		arr[0] = 20;
		arr2[0] = 12;
		if (arr == arr2) {
			System.out.println("equal" + arr + "   " + arr2);
		} else {
			System.out.println("not equal" + arr + "   " + arr2);
		}
		
		System.out.println(arr[0]+"  "+arr2[0]);
		
		int[] arr3 = arr.clone();
		System.out.println(arr3[0]);
		System.out.println(arr.equals(arr3));
		System.out.println(arr == arr3);
		System.out.println(arr.getClass() == arr3.getClass());
	}

}
