package patterns;
import java.util.Scanner;
class one{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int r = sc.nextInt();
    System.out.println("Enter the number of columns");
    int c = sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
}
                                             // output::
// C:\Users\Anushka\OneDrive\Desktop\DSA>java patterns.one
// Enter the number of rows
// 5 
// Enter the number of columns
// 6
// ******
// ******
// ******
// ******
// ******