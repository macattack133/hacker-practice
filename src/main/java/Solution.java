public class Solution {
    //problemOne

import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
            System.out.println("Hello, World.");
            System.out.println("Hello, Java.");
        }
    }


    public class Solutions {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            // Complete this line
            // Complete this line

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            // Complete this line
            // Complete this line
        }
    }

    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class Solution {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if ((N%2 ==0) & (N >= 2) & (N<=5)) {
                System.out.println("Not Weird");

            } else if ((N%2 == 0) & (N >= 6) & (N<=20)) {
                System.out.println("Weird");

            } else if (N%2 == 1){
                System.out.println("Weird");
            } else if ((N%2 ==0) & (N>20)) {
                System.out.println("Not Weird");
            }
            scanner.close();
        }
    }

}
