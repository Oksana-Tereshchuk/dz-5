public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        a = a + b;
        c = c + d;
        System.out.println(a > c ? "true" : "false");

        a++;
        c-=2;
        System.out.println(a > c ? "true" : "false");

        System.out.println(a % 2==0 || c % 2==0 ? "true" : "false");

    }
}