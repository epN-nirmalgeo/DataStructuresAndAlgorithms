import java.lang.Math;

public class  PrimeNumber {

    // Algorithm
    /*
     * 
     *  n = a*b
     *  
     *  b = n/a
     * 
     * let's assume, a<=b ...hence a*b >= a^2
     * 
     * which is  n >= a^2... Thus we can determine if number is prime if divisable until sqrt(n)
     * 
     * Time complexity: O(sqrt(n))
     */


    /**
     * 
     * @param numInteger
     */
    public static String isPrime(Integer numInteger) {
        int maxValue = (int) Math.sqrt(numInteger);

        for (int i=2; i<=maxValue; i++) {
            if (numInteger % i == 0) {
                return "not prime";
            }
        }
        return "prime";

    }
    public static void main(String []args) {
        for (int i=2; i<=100; i++) {
            System.out.println(i + " is " + isPrime(i));
        }
    }
}