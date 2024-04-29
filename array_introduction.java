//public class array_introduction {
//    public static void main(String[]args){
//        int [] marks=new int[3];
//        marks[0]=95;
//        marks[1]=90;
//        marks[2]=91;
////        System.out.println(marks);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//
//        for(int i=0;i<3;i++){
//        System.out.println(marks[i]);}
//
//    }
//}


//import java.util.Scanner;
//
//public class array_introduction{
//    public static void main(String[]args){
//        Scanner sc =new Scanner(System.in);
//        int size= sc.nextInt();
//        int number[]=new int[size];
//        for (int i=0;i<size;i++){
//            number[i]= sc.nextInt();
//        }
//
//        for (int i=0;i<size;i++){
//            System.out.println(number[i]);
//        }
//    }
//}
//


import java.util.Scanner;

public class array_introduction{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("what size of array you want");
        int size= sc.nextInt();
        int number[]=new int[size];
//        System.out.println("input your array of length"+ size);

        for (int i=0;i<size;i++){

            number[i]= sc.nextInt();}
//        System.out.println("input number(digit) you want to find in your array");
        int x= sc.nextInt();

        for (int i=0;i< number.length;i++)   {
            if (number[i]==x){
                System.out.println("x found at index" + i);
            }
        }

        }
    }
