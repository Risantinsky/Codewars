public class Main {

    public static void main(String[] args) {

        System.out.printf("isIsogram '%s' = %b \n", "Dermatoglyphics", isIsogram("Dermatoglyphics"));
        System.out.printf("isIsogram '%s' = %b \n", "moose", isIsogram("moose"));
        System.out.printf("isIsogram '%s' = %b \n", "aba", isIsogram("aba"));
        System.out.printf("isIsogram '%s' = %b \n", "moOse", isIsogram("moOse"));
        System.out.printf("isIsogram '%s' = %b \n", "", isIsogram(""));

    }

    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

}
