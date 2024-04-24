//for loop

/*public class loop {
    public static void main(String[]agrs){
        for (int i=0;i<100;i=i+1)
            {System.out.println(i);

        }
    }
}*/


//while loop

/*public class loop {
    public static void main(String[]agrs){
        int i=0;
        while (i<11){
        System.out.println(i);
            i=i+1;}
    }
}*/

//how to sum consitive numbers

import java.util.Scanner;

public class loop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i =0;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}

//how to make a table in java using loops
/*import java.util.Scanner;
public class loop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int mul=1;mul<11;mul++){
            int table=mul*n;
            System.out.println(table);
        }
    }
}*/