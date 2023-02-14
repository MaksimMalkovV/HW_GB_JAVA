import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class TASK_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число n: ");
        int n = in.nextInt();
        System.out.printf("Треугольное число равно: %d\n", terear(n));
        in.close();
    }

    public static int terear(int n) {
        return (n * (n+1))/2;
    }
}