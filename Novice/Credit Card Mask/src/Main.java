public class Main {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    public static String maskify(String str) {

        if (str.length() <= 4) {
            return str;
        }

        String s1 = str.substring(str.length() - 4);
        String s2 = "";

        for (int i = 0; i < str.length() - 4; i++) {
            s2 += "#";
        }
        s2 += s1;

        return s2;
    }

}
