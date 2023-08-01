import java.util.Arrays;

public class SieveOfErasthones {

    private boolean []isPrime;
    private int num;

    public SieveOfErasthones(int num) {
        this.isPrime = new boolean[num+1];
        Arrays.fill(this.isPrime, true);
        this.num = num;
    }

    /**
     * Time complexity
     * 
     * first for loop 2 --> num/2
     * 
     * second for loop is essentially for each j , num/ j steps
     * 
     * i.e. num/ 2 + num / 3 + num / 5 + num / 7 + num/11 + .... 
     * 
     * which is <= num ( 1/2 + 1/3 + 1/4 + 1/5 + 1/6)
     * 
     * <= log(num)
     * 
     * O(n * log(n))
     * 
     * 
     */
    public void getAllPrimes() {
        // I can check only until num/2 because I am talking multiples of i
        // which would exceed num
        for (int i=2; i<=num/2; i++) {
            if (isPrime[i]) {
                for (int j=i+i; j<=num; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers until : " + this.num);
        for (int i=2; i<= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String []args) {
        SieveOfErasthones s = new SieveOfErasthones(100);
        s.getAllPrimes();
    }
    
}
