//                                   //first program in java
// import java.lang.*;
// import java.util.Scanner;
// class basic
// {
//     public static void main(String args[])
//     {
//         // float a=(float)(0.00000000000008/3.999999999);
//         // System.out.println("Hello World");
//         // System.out.println(a);
//         Scanner sc= new Scanner(System.in); 
//          System.out.print("Enter PIN: ");
//         int pin = sc.nextInt();          
//         while (pin != 1234) {            
//             System.out.print("Wrong. Enter PIN: ");
//             pin = sc.nextInt();          
//             }
//     }

// }
//                            //second program in java
// import java.io.Console;
// import java.util.Arrays;
// class basic {
//     public static void main(String[] args) {
//         Console console = System.console();
//         if (console == null) {
//             System.out.println("No console available. Run this from an actual terminal (not an IDE).");
//             return;
//         }
//         char[] pinInput = console.readPassword("Enter PIN: ");
//         int pin = Integer.parseInt(new String(pinInput));

//         while (pin != 1234) {
//             pinInput = console.readPassword("Wrong. Enter PIN: ");
//             pin = Integer.parseInt(new String(pinInput));
//         }
//         System.out.println("Access granted!");
//     }
// }
                            //third program in java
// import java.lang.*;
// import java.util.*;
// import java.io.*;
// import java.util.Arrays;
// class basic
// {
//     public static void main(String args[]) throws IOException
//     {
//         StringBuffer[] a= new StringBuffer[5];
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         for(int i=0;i<5;i++)
//         {
//             System.out.print("Enter name: ");
//             a[i]=new StringBuffer(br.readLine());
//         }
//         for(StringBuffer i:a)
//         {
//             System.out.println(i);
//         }
//         System.out.println("After removing duplicates");
//         Arrays.sort(a);
//         for(int i=0;i<4;i++)
//         {
//             if (a[i] != null && a[i+1] != null && a[i].toString().equals(a[i+1].toString())){
//                 a[i+1]=null;
//             }
//         }
//         Arrays.sort(a, Comparator.nullsLast(Comparator.naturalOrder()));
//         for(StringBuffer i:a)
//         {
//             if(i!=null)
//             System.out.println(i);
//         }
//     }

// }
                                  //fourth program in java
// import java.lang.*;
// import java.util.Scanner;
// interface a {
//     int calculatearea(int n, int m);
// };
// interface b {
//     int calculatearea(float r);
// };
// class c implements a, b {
//         @Override
//         public int calculatearea(int n, int m) {
//             int area1 = n * m;
//             return area1;
//         }
//         @Override
//         public int calculatearea(float r) {
//             int area2 = 3.14 * r * r;
//             return area2;
//         }   
//     }
// class basic {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         c obj = new c();
//         System.out.print("Enter length and breadth of rectangle: ");
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         System.out.println("Area of rectangle: " + obj.calculatearea(n, m));
//         System.out.print("Enter radius of circle: ");
//         float r = sc.nextFloat();
//         System.out.println("Area of circle: " + obj.calculatearea(r));
//     }
// }