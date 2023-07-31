import java.util.HashMap;
import java.util.Map;

public class PrimeFactorization {

    private HashMap<Integer, Integer> primeFactors;

    public PrimeFactorization() {
        primeFactors = new HashMap<>();
    }

    public void primeFactors(int number) {
        int startingNumber = 2;

        // compare only till startingNumber^2 as that would be the max check for prime
        // startingNumber*startingNumber will result in O(sqrt(n)) , else O(n)
        while (number > 1 && startingNumber*startingNumber<=number) {
            int exponent = 0;

            while (number%startingNumber == 0) {
                number /= startingNumber;
                exponent++;
            }

            if (exponent > 0) {
                primeFactors.put(startingNumber, exponent);
            }

            // just incrementing starting number would work as lower numbers would already be factors
            // e.g. 4 would already be a factor of 2 so would be eliminated from the list
            startingNumber++;
        }

        // To handle square root
        if (number > 1) {
            primeFactors.put(number, 1);
        }


        for (Map.Entry<Integer, Integer> entry: primeFactors.entrySet()) {
            System.out.println(entry.getKey() + "^" + entry.getValue());
        }
    }

    public static void main(String []args) {
        PrimeFactorization factors = new PrimeFactorization();
        factors.primeFactors(91);
    }
}