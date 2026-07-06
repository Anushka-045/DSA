package patterns;
import java.util.Scanner;
public class two {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int r = sc.nextInt();
    for(int i=0;i<r;i++){
        for(int j=1;j<=i;j++){
            System.out.print('*');
        }
        System.out.println();
    }
    sc.close();

}
}
// output::
// C:\Users\Anushka\OneDrive\Desktop\DSA>java patterns.two     
// Enter the number of rows
// 5
// Enter the number of columns
// 5
// *
// **
// ***
// ****
