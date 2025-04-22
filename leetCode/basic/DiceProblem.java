package leetCode.basic;

public class DiceProblem {
    public static void main(String[] args) {
        System.out.println(oppositeFaceOfDice(2));
        System.out.println(oppositeFaceOfDiceImproved(2));
    }
    public static int oppositeFaceOfDice(int n){
        int ans;
        if (n == 1) {
            ans = 6;
        }
        else if (n == 2) {
            ans = 5;
        }
        else if (n == 3) {
            ans = 4;
        }
        else if (n == 4) {
            ans = 3;
        }
        else if (n == 5) {
            ans = 2;
        }
        else {
            ans = 1;
        }
        return ans;
    }
    public static int oppositeFaceOfDiceImproved(int n){
        // Stores number on opposite face of dice
        int ans = 7 - n;
        return ans;
    }

}