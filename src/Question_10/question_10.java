package Question_10;
import java.util.*;

public class question_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        numberConsists(n);
    }


    static void numberConsists(int n) {  //Cформирован массив, элементами которого являются цифры числа N.
        int a[] = new int[n];
        int i = 0;
        System.out.println("Numbers included in the number "+n+":");
        while(n!=0){
            i++;
            a[i]=n%10;
            n=n/10;
            System.out.println(a[i]);
        }

    }
}
