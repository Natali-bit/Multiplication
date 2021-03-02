public class Multiplication{

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int line: numbers) {
            for (int nextline : numbers) {
                System.out.printf("%4d", (line * nextline));
            }
            System.out.println();
        }
    }
}
