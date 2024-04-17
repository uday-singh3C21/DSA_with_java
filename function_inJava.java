//import java.util.Scanner;
//
//public class function_inJava {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[]args){
//        Scanner sc =new Scanner(System.in);
//        String name=sc.nextLine();
//        printMyName(name);
//    }
//}


//import java.util.Scanner;
//
//public class function_inJava {
//    public static int sunOfTwoNumber(int a,int b){
//        int sum=a+b;
//        System.out.println(sum);
//        return sum;
//    }
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int sum=sunOfTwoNumber(a,b);
//    }
//}


import java.util.Scanner;

public class function_inJava {
  public static void PrintFactorial(int n){
        if (n<1){
            System.out.println("Invalid");
            return;
        }
        int factorial=1;
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        PrintFactorial(n);
    }
}

