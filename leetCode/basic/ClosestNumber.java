package leetCode.basic;

public class ClosestNumber{
    public static void main(String[] args) {
        //absulute value is the value without posite ou negative symbol
        int n = 13, m = 4;
        double nd = 13, md = 4;
        System.out.println(closestNumber(n, m));
        System.out.println(closestNumberImproved(n, m));
        System.out.println(closestNumberImproved(nd, md));
    }
    // Naive approach iterative cheking
    static int closestNumber(int n, int m){
        // find the quotient
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        // Check numbers around n
        for(int i = n - Math.abs(m); i <= n + Math.abs(m); ++i ){
            if(i % m == 0){
                int difference = Math.abs(n - i);

                if(difference < minDifference 
                || (difference == minDifference && Math.abs(i) > Math.abs(closest))){
                    closest = i;
                    minDifference = difference;   
                    }
            }
        }
        return closest;
    }

    // Expected Approach by finding quotient
    
    static int closestNumberImproved(int n, int m){
        // find the quotient
        int q = n / m;

        // 1st possible closest number
        int n1 = m * q;

        // 2nd possible closest number
        int n2 = (n * m) > 0 ? (m* (q + 1)) : (m * (q - 1));

        // if true, then n1 is the required closest number
        if(Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        // else n2 is the required closest number
        return n2;
    }

    //for double not working very well, because when we put float numbers, the nearest number is, for example 13 by 4 is 12.999...
    static double closestNumberImproved(double n, double m)  {
        return 0;
    }
}
