import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        for (int i=0 ; i<2*num-1 ; i++) {
            System.out.print(i+1+" ");
        }
        System.out.println();
        for(int i=1 ; i<=num-1 ; i++){
            for(int j=1 ; j<=num-i ; j++){
                System.out.print(j+" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print(" "+" ");
            }
            for(int l=num+i ; l<=2*num-1 ; l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
