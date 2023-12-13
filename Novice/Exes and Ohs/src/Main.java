public class Main {

    public static void main(String[] args) {

        System.out.printf("XO('%s') => %b \n","ooxx", getXO("ooxx"));
        System.out.printf("XO('%s') => %b \n","xooxx", getXO("xooxx"));
        System.out.printf("XO('%s') => %b \n","ooxXm", getXO("ooxXm"));
        System.out.printf("XO('%s') => %b \n","zpzpzpp", getXO("zpzpzpp"));
        System.out.printf("XO('%s') => %b \n","zzoo", getXO("zzoo"));

    }

    public static boolean getXO (String str) {
        int x = (int) str.toLowerCase().chars().filter(p -> p == 'x').count();
        int o = (int) str.toLowerCase().chars().filter(p -> p == 'o').count();
        return x == o;
    }

}
