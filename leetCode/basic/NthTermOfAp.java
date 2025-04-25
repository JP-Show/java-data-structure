package leetCode.basic;

public class NthTermOfAp {
    public static void main(String[] args) {
        System.out.println(NthTermOfAp(1, 3, 10));

    }

    //expect approach
    static int NthTermOfAp(int a1, int a2, int n){
        int gap = Math.abs(a1 - a2);
        int result = a1 + (n - 1) * gap;
        return result;
    }
}
