import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao do dai canh thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap vao do dai canh thu hai: ");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap vao do dai canh thu ba: ");
        int c = scanner.nextInt();
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.testDoDai(a , b , c);
    }

    public IllegalTriangleException() {
    }

    public void testDoDai(int a, int b, int c) {
        try {
            if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
                throw new IllegalTriangleException();
            } else if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException();
            } else {
                System.out.println("Do dai ba canh tam giac ban da nhap la: " + a + "\t" + b + "\t" + c);
            }
        } catch (IllegalTriangleException e) {
            System.out.println("Ban da nhap khong dung!");
        }
    }
}
