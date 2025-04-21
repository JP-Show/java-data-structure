package leetCode.basic;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("a =  " + a + "b = " + b);
        
        //Swa a and b using temp varible
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =  " + a + "b = " + b);
        //without using the third variable

        //Using Arithmetic Operators
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a =  " + a + "b = " + b);

        //Using Bitwise XOR

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("a =  " + a + "b = " + b);
    }
    
}