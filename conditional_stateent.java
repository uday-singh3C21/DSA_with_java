/*import java.util.Scanner;

public class conditional_stateent {
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a%2==0){
        System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }
    }
}*/

import java.util.Scanner;

public class conditional_stateent {
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("a is equal to b");
        } else if (a>b) {
            System.out.println("a is grater to b");
        }
        else{
            System.out.println("b is grater then a");
        }
    }
}
