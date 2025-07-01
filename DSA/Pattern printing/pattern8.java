import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print((2*j)-1);
            }
            System.out.println();
        }
    }
}
