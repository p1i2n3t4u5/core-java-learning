package cloning.deepcopy;

public class ArrayCloning {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr2 = arr.clone();
		arr[0] = 20;
		arr2[0] = 12;
		if (arr == arr2) {
			System.out.println("equal" + arr + "   " + arr2);
		} else {
			System.out.println("not equal" + arr + "   " + arr2);
		}
	}

}
