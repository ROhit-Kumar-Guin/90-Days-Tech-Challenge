import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        for(int i=1 ; i<=num ; i++){
            int temp = 0;

            for(int j=1 ; j<=num ; j++){
                if((i+j)>=num+1){
                    temp++;
                    System.out.print(temp+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
               
            }
            System.out.println();
        }
    }
}
