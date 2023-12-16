public class Main {

    public static void main(String[] args) {

        System.out.println(solution(1666));

    }


    public static String solution(int n) {
        if (n < 1 || n > 3999) return "";

        String result = "";
        int number = n;
        switch (number / 1000) {
            case 1:
                result += "M";
                number -= 1000;
                break;
            case 2:
                result += "MM";
                number -= 2000;
                break;
            case 3:
                result += "MMM";
                number -= 3000;
                break;
            default:
                break;
        }


        switch (number / 100) {
            case 1:
                result += "C";
                number -= 100;
                break;
            case 2:
                result += "CC";
                number -= 200;
                break;
            case 3:
                result += "CCC";
                number -= 300;
                break;
            case 4:
                result += "CD";
                number -= 400;
                break;
            case 5:
                result += "D";
                number -= 500;
                break;
            case 6:
                result += "DC";
                number -= 600;
                break;
            case 7:
                result += "DCC";
                number -= 700;
                break;
            case 8:
                result += "DCCC";
                number -= 800;
                break;
            case 9:
                result += "CM";
                number -= 900;
                break;
            default:
                break;
        }

        switch (number / 10) {
            case 1:
                result += "X";
                number -= 10;
                break;
            case 2:
                result += "XX";
                number -= 20;
                break;
            case 3:
                result += "XXX";
                number -= 30;
                break;
            case 4:
                result += "XL";
                number -= 40;
                break;
            case 5:
                result += "L";
                number -= 50;
                break;
            case 6:
                result += "LX";
                number -= 60;
                break;
            case 7:
                result += "LXX";
                number -= 70;
                break;
            case 8:
                result += "LXXX";
                number -= 80;
                break;
            case 9:
                result += "XC";
                number -= 90;
                break;
            default:
                break;
        }

        switch (number) {
            case 1:
                result += "I";
                break;
            case 2:
                result += "II";
                break;
            case 3:
                result += "III";
                break;
            case 4:
                result += "IV";
                break;
            case 5:
                result += "V";
                break;
            case 6:
                result += "VI";
                break;
            case 7:
                result += "VII";
                break;
            case 8:
                result += "VIII";
                break;
            case 9:
                result += "IX";
                break;
            default:
                break;
        }

        return result;
    }


}
