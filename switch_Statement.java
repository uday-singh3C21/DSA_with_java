import java.util.Scanner;
public class switch_Statement {
        public static void main(String[]agrs){
            Scanner sc=new Scanner(System.in);
            int button= sc.nextInt();
            switch(button){
                case 1 :
                    System.out.println("hello");
                    break;
                case 2 :
                    System.out.println("namasta");
                    break;
                case 3 :
                    System.out.println("bonjuer");
                    break;
                default:
                    System.out.println("invalid button");

            }
}
}
