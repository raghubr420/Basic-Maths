package Exception_Handling;

public class Example2 {
	public static void main(String args[]) {
		try {
			int arr[] = new int[7];
			arr[10] = 10 / 5;
			System.out.println("Last Statement of try block");
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit : I'm from ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Some Other Exception");
		}
		System.out.println("Out of the try-catch block");
	}
}

/*
 * In this case, the second catch block got executed because the code throws ArrayIndexOutOfBoundsException. 
 * We are trying to access the 11th element of array in above program but the array size is only 7.
 * */
