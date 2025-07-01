import java.util.Scanner;

// ****
// ****
// ****
// ****

public class pattern2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
       
        for(int i=0 ; i<num ; i++){
            for(int j=0 ; j<num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
