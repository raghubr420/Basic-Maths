package Exception_Handling;

class Example1 {
	public static void main(String args[]) {
		try {
			int arr[] = new int[7];
			arr[4] = 30 / 0;
			System.out.println("Last Statement of try block");
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero : I'm from ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit");
		} catch (Exception e) {
			System.out.println("Some Other Exception");
		}
		System.out.println("Out of the try-catch block");
	}
}

/*
 * In the above example, the first catch block got executed, 
 * because the code we have written in try block throws ArithmeticException
 * (because we divided the number by zero).
 */