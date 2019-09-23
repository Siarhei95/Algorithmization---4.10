package Question_10;
import java.util.*;

public class question_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        numberConsists(n);
    }


    static void numberConsists(int n) {  //Caормирован массив, элементами которого являются цифры числа N.
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n / n + i;
        }
        System.out.println("The number "+n+" includes the following numbers: " + Arrays.toString(a));
    }
}
