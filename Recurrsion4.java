public class Recurrsion4 {
    public static void main(String args[]){
    int ans = fact(5);
    System.out.println("answer is " + ans);
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }

        return n * fact(n-1);
    }
}
