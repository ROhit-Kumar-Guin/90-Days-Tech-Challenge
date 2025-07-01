import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int nsp=num-1;
        int nst=1;

        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=nsp ; j++){
                System.out.print(" "+" ");
            }
            for(int k=1 ; k<=nst ; k++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst +=2;
            System.out.println();
        }
        nsp=1;
        nst=nst-4;

        for(int i=1 ; i<=num-1 ; i++){
            for(int j=1 ; j<=nsp ; j++){
                System.out.print(" "+" ");
            }
            for(int k=1 ; k<=nst ; k++){
                System.out.print("*"+" ");
            }
            nsp++;
            nst -=2;
            System.out.println();
        }
        
        

    }
}
