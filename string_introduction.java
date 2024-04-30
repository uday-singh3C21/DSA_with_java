//import java.util.Scanner;
//
//public class string_introduction {
//    public static void main(String[]args){
//        // string declaration
//        String name="uday singh shekhawat ";
//        Scanner sc =new Scanner(System.in);
//        String fullName=sc.nextLine();
//        System.out.println(fullName);
//    }
//}


import java.util.Scanner;

public class string_introduction {
    public static void main(String[]args){
        // string declaration
        Scanner sc =new Scanner(System.in);
        String fullName=sc.nextLine();
        System.out.println(fullName + fullName.length());
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}

