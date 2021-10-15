
public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 9, high = 99999;
		int first = 1;
		System.out.print(first + " ");
        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
            	System.out.print(number + " ");
            }
                
        }

	}

}
