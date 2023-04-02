import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


         int[][] movie = {
           {0,0,1,1},
           {1,1,0,0}
         };

           Scanner sc = new Scanner(System.in);

           System.out.println("Choice Row 0 or 1");
           int row = sc.nextInt();
           System.out.println("Choice seat 0,1,2,3");
           int colum = sc.nextInt();

    
          if(movie[row][colum] == 0) { 
            System.out.println("Free"); 
            System.out.println("18$");
           } else {
            System.out.println("Occupied");
            }
          
            
     
    

        
  }
}
