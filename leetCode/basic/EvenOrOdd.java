package leetCode.basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println(4 & 0b1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador se um número é impar ou par: ");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();
        boolean result = isEvenShift(num);
        if(result) System.out.println("É par");
        else System.out.println("É impa");

    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static boolean isEvenBitwise(int n){
        return ((n & 0b1) == 0) ? true : false;
    }
    public static boolean isEvenShift(int n){
        return (n == (n >> 1) << 1)? true : false;
    }
}
