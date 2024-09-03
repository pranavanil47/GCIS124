public class factorial {
    public static void main(String[] args) {
        int a = 10;
        int i = a;
        int ans =1; 

        while (i>0){ 
            ans = ans * i;
            i--;

        }
        System.out.println("factorial of 10 is " + ans);
    }
    
}
