package programs;

public class PrimeNumber {

	public static boolean isPrime(int number) {
	    if (number <= 1) {
	        return false; // 1 and numbers less than 1 are not prime
	    }
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) {
	            return false; // Found a divisor other than 1 and itself
	        }
	    }
	    return true; // No divisors other than 1 and itself, so it's prime
	}
	public static void main(String[] args) {
		isPrime(23);
		
	}

	}