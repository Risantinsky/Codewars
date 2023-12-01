public class Main {
    public static void main(String[] args) {

        boolean result = StringEndsWith("abc", "bc");
        System.out.println(result);
        boolean result2 = StringEndsWith("abc", "cd");
        System.out.println(result2);

    }

    public static boolean StringEndsWith(String s1, String s2) {
        return s1.endsWith(s2);
    }

}