package patterns;
import java.util.Scanner;
public class three {
        public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int r = sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    sc.close();
}  
}
// output::
// C:\Users\Anushka\OneDrive\Desktop\DSA>java patterns.three      
// Enter the number of rows
// 8
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678