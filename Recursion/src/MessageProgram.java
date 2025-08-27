public class MessageProgram {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello Message");
        message1();
    }
    static void message1(){
        System.out.println("Hello Message1");
        message2();
    }

     static void message2() {
         System.out.println("Hello Message2");
         message3();
    }

    private static void message3() {
        System.out.println("Hello Message3");
        message4();
    }

    private static void message4() {
        System.out.println("Hello Message4");
    }

}
