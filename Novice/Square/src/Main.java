public class Main {
    public static void main(String[] args) {

        System.out.println(SquareNumber(-1));
        System.out.println(SquareNumber(0));
        System.out.println(SquareNumber(3));
        System.out.println(SquareNumber(4));
        System.out.println(SquareNumber(25));
        System.out.println(SquareNumber(26));

    }

    public static boolean SquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

}