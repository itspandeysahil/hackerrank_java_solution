import java.util.Scanner;

public class loop2 {public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int summ = a;
            for(int j = 0; j<n; j++){
                summ += (Math.pow(2,j)*b);
                System.out.print(summ + " ");
            }
            System.out.println();
        }
        in.close();
    }
    
}
