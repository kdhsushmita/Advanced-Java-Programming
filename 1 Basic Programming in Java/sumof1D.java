package Labsheet;

public class sumof1D {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};     
	        System.out.print("Initial array : {" + " ");     
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	        
	        System.out.println(" }");
	        int sum = calculateSum(numbers);
	        System.out.println("\n\nSum of the array: " + sum);
	    }

	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }

}
