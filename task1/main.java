import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу вычисления n-ого треугольного числа n1=1 n2=1+2 n3=1+2+3
 */
public class main {
    
    public static void main(String[] arg) throws IOException{
        int n = 0;
        int sum = 0;
        System.out.println("Введите число N");
        n = EnterN(n);
        System.out.println("Число N: " + n);
        sum = TrangleNum(n, sum);
        System.out.println("Сумма треугольного числа: " + sum);
    }
    public static int EnterN(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());
        return num;
    }

    public static int TrangleNum(int n, int sum){
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 = sum2 + 1;
            sum = sum + sum2;
        }
        return sum;
    }

}
