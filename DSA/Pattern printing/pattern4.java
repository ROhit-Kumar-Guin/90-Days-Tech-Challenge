import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
