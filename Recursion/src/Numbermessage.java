public class Numbermessage {
    public static void main(String[] args) {
        number();
    }

    private static void number() {
        System.out.println(1);
        number1();
    }

    private static void number1() {
        System.out.println(2);
        number2();
    }

    private static void number2() {
        System.out.println(3);
        number3();
    }

    private static void number3() {
        System.out.println(4);
        number4();
    }

    private static void number4() {
        System.out.println(5);
    }
}