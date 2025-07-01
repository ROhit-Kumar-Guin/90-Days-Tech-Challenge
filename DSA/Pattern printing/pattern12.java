import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        

        
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=i ; j++){
                if (i%2==1) {
                    if(j%2==1){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2==1){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
                      
            }
            System.out.println();
        }
    }
}
