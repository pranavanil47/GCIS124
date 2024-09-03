public class calculator {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println(adition(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(divide(a, b));
        
    }

    public static  int adition(int a, int b){
        return (a+b);

    }
    public static  int subtraction(int a, int b){
        return (a-b);
        
    }
    public static  int multiplication(int a, int b){
        return (a*b);
        
    }
    public static  double divide(int a, int b){
        float x =  (float) a/b;
        return x;
        
    }
}
