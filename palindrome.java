public class palindrome{
    public static void  main(Str[]args){
        int num=123;
        int rev = 0;
        int temp;
        
        temp=num;
        while(temp!=0){
           int rem = temp%10;
            rev = (rev * 10 )+ rem;
            temp = temp/10;
        }
        if(num==rev)
            System.out.println("palindrome");

    
        else
        System.out.println("not a palindrome");
    }
}