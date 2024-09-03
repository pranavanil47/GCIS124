public class slicingSting {
    public static void main(String[] args) {
        String a = "Pranav Anil";
        char first = a.charAt(0);
        char last = a.charAt(a.length()-1);
        System.out.println("first " + first +  " ,last "+ last);

        System.out.println(first);
        System.out.println(last);

        String x = ""+first+last;

        System.out.println(x);

        String[] sliced = a.split(" ");

        for(int i=0; i<sliced.length;i++){
            System.out.print(sliced[i] + " ");
            
        }
        System.out.println("");

        for(String i: sliced){
            System.out.print(i+ "   ");
        }




        

        

    }
    
}
