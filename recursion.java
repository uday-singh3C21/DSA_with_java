//public class recursion {
//    public static void printNUmber(int n){
//        if (n>=6){
//        return;
//        }
//        System.out.println(n);
//        printNUmber(n+1);
//    }
//    public static void main(String[]args){
//        int n=1;
//        printNUmber(n);
//
//    }
//}



//sum of first n nuber
//public class recursion {
//    public static void printSum(int i,int n,int sum){
//        if (i>=n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        printSum(i+1,n,sum);
//    }
//    public static void main(String[]args){
//        printSum(1,5,0);
//    }
//}



//public class recursion {
//    public static int calculateFactorial(int n){
//        if (n==1||n==0){
//            return 1;}
//        int facr_nm1=calculateFactorial(n-1);
//        int facr_n=n*facr_nm1;
//        return facr_n;
//    }
//    public static void main(String[]args){
//        int n=5;
//        int ans=calculateFactorial(n);
//        System.out.println(ans);
//    }
//}



//public class recursion{
//
//    public static void printFib(int a ,int b,int n){
//
//        if (n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        printFib(b,c,n-1);
//    }
//    public static void main(String[]args){
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=7;
//
//        printFib(a,b,n-2);
//    }
//}



public class recursion {
    public static int climbStairs(int n) {
        if (n <= 1)
            return 1;
        if (n == 2)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }4
    public static void main(String[] args) {
        int n = 10;
        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs without repetition: " + ways);
    }
}

