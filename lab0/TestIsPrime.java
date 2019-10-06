public class TestIsPrime {
    public static void main(String [] args) {

        System.out.println("Asserting isPrime(x) method: ");
        assert isPrime(1) == false;
        assert isPrime(5) == true;
        assert isPrime(8) == false;
        assert isPrime(13) ==true;

        System.out.println("All assertions passed:");

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
