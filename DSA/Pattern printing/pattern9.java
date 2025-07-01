import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        int temp = 1;
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
