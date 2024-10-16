package Array;

public class Example9 {
	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 5, 6, 7 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int c[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; i++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.println(c[i][j]);
			}
			System.out.println();
		}
	}
}

//		int[] array1 = { 1, 2, 3 };
//		int[] array2 = { 4, 5, 6 };
//		int[] sumArray = new int[array1.length];
//		for (int i = 0; i < array1.length; i++) {
//			sumArray[i] = array1[i] + array2[i];
//		}
//		System.out.print("Addition of Array is : ");
//		for (int num : sumArray) {
//			System.out.print(num + " ");
//		}
//	}