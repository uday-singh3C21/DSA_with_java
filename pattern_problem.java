//building solid pattern using nasted loops
//public class pattern_problem {
//    public static void main(String[]args){
//        for (int n=1;n<5;n++){
//        for (int j=1;j<5;j++){
//            System.out.print("*");}
//            System.out.println();
//        }
//    }
//}


// hollow rectangle problem
//xxxxx
//x   x
//x   x
//xxxxx

//public class pattern_problem {
//    public static void main(String args[]){
//    int n=4;
//    int m=5;
//    for (int i=1 ; i<=n ; i++){
//        for (int j=1 ; j<=m ; j++){
//        if (i==1||j==1||i==n||j==m){
//            System.out.print("x");
//        }else {
//            System.out.print(" ");
//        }
//    }
//            System.out.println();
//        }
//    }
//}


// half pyramid problem
//x
//xx
//xxx
//xxxx

//public class pattern_problem {
//   public static void main(String args[]){
//   int n=4;
//
//   for (int i=1;i<=n;i++){
//       for (int j=1;j<i;j++){
//           System.out.print("x");
//       }
//
//       System.out.println("x");}
//   }
//}

//inverted half pyramid
//xxxx
//xxx
//xx
//x



//public class pattern_problem {
//    public static void main(String args[]){
//        int n=4;
//
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<i;j++){
//                System.out.print("x");
//            }
//
//            System.out.println("x");}
//    }
//}


//inverted half pyraid rotated by 180
//   x
//  xx
// xxx
//xxxx

//public class pattern_problem {
//    public static void main(String[] args) {
//        int n = 4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("x");
//            }
//            System.out.println();
//        }
//    }
//}


//making half pyramid by 1,2,3,4
//public class pattern_problem {
//   public static void main(String args[]){
//   int n=10;
//
//   for (int i=1;i<=n;i++){
//       for (int j=1;j<i;j++){
//           System.out.print(j);
//       }
//
//       System.out.println(i);}
//   }
//}


//making inverted pyramid by 1,2,3,4,5
//public class pattern_problem {
//    public static void main(String args[]){
//        int n=4;
//
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<i;j++){
//                System.out.print(j);
//            }
//
//            System.out.println(i);}
//    }
//}



//public class pattern_problem {
//    public static void main(String args[]){
//        int n=5;
//        int number=1;
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(number);
//                number++;
//            }
//
//            System.out.println();}
//    }
//}


//o-1 triangle


public class pattern_problem {
    public static void main(String args[]){
        int n=5;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }

            System.out.println();}
    }
}