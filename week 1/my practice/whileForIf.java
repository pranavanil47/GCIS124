//if statements while loops and calling methods 


public class whileForIf {
    public static double average(int x, int y, int z, int a, int b){
        return (x+y+z+a+b)/5.0;

    }

    public static void whileLooop() {
        int x = 0;

        while(x<=5)
        {
            System.err.println(x);
            x++;

        }
    }

    public static void forLoops(){
        for(int i= 0; i<8;i++){
            System.out.println(i);
        }

    }

    public static void whileWithonlyeven() {

        int i = 100;
        while(i>0)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }

            i--;

        }
        
    }
    
    public static void main(String[] args) {
        
        double result = average(11, 22, 33, 43, 54);

        System.out.println(result);

        if(result<5 && result>3)
        {
            System.out.println("You have just passed ");

        }
        else if(result>5)
        {
            System.out.println("You have aced");

        }
        else
        {
            System.out.println("You failed");
        }

        //whileLooop();
        //forLoops();
        whileWithonlyeven();

    }
}
