public class arrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.err.println(leng(numbers));

    }

    public static int leng(int[]array){
        return array.length;

    }
}
