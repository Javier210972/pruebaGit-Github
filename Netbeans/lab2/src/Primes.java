public class Primes {

    public static void main(String[] args) {
        printPrimes(Integer.parseInt(args[0]));
    }

    private static void printPrimes(int limit) {
        int count =0;
        for (int c = 2; c <= limit ; c+=1) {
if (isPrime(c)){
    if (count == 10) {
        System.out.println();
        count =0;
    }
    System.out.print(c + " ");
    count++;
    }
        }
        System.out.println();
    }
    private static boolean isPrime (int x){
    if (x<=1){
        return false;


    }
    else    {
        for (int i = 2; i < x; i+=1) {
            if (x%i == 0) {
                return  false;

            }
        }
        return true;
    }


    }
}
