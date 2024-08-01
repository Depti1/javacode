

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 12;
        String ans = isPrime(n);
        System.out.println(ans);
    }

    static String isPrime(int n){
        for(int i = 2 ; i<n ; i++){
            if(n%i==0){
                return "not prime";
            }
        }
        return "prime";
    }
}
