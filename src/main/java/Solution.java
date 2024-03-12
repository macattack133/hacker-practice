import java.util.*;


//PROBLEM ONE
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if ((N % 2 == 0) & (N >= 2) & (N <= 5)) {
            System.out.println("Not Weird");

        } else if ((N % 2 == 0) & (N >= 6) & (N <= 20)) {
            System.out.println("Weird");

        } else if (N % 2 == 1) {
            System.out.println("Weird");
        } else if ((N % 2 == 0) & (N > 20)) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}


////PROBLEM THREE
//Scanner scan = new Scanner(System.in);
//int i = scan.nextInt();
//double d = scan.nextDouble();
//        scan.nextLine();
//String s = scan.nextLine();
//        scan.close();
//
//
//// Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }
//            }