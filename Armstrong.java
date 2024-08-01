public class Armstrong {
    public static void main(Str[] args){
        
       boolean ans = armStr(125);
       System.out.println(ans);
       
        
    }
        
            
        static boolean armStr(int n){
            int original = n;
            int sum = 0;
            while(n>0){
                int rem = n%10;
                int cube= rem*rem*rem;
                sum = sum+cube;
                n=n/10;
            }
            if(sum==original){
                return true;
            }
            return false;
        }

    
    
}
