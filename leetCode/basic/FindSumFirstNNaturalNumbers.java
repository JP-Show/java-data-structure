package leetCode.basic;

public class FindSumFirstNNaturalNumbers {
    public static void main(String[] args) {
        findSum(5);
    }

    static void findSum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i);
            if(i == n){
                System.out.print(" = ");
                System.out.print(sum);
                break;
            }
            System.out.print(" + ");
        }
        
    }
}
