import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                if(j==(num/2+1) || i==(num/2+1)){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
               
            }
            System.out.println();
        }
    }
}
