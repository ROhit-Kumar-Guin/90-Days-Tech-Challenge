// *****
// *****
// *****
// *****


import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int row = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = scan.nextInt();
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
