import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        

        //ABCD
        //ABCD
        //ABCD
        //ABCD
        
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){
                char ch = (char) (j+64);
                System.out.print(ch);
            }
            System.out.println();
        }


        //AAAA
        //BBBB
        //CCCC
        //DDDD

        // for(int i=1 ; i<=num ; i++){
        //     for(int j=1 ; j<=num ; j++){
        //         char ch = (char) (i+64);
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }
    }
}
