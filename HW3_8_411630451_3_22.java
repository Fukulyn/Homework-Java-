package Me;
import java.util.Scanner;

public class HW3_8_411630451_3_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if(distance <= 100 && distance > 0){
            System.out.printf("Point (%f, %f) is in the circle.", x, y);
        }
        else{
            System.out.printf("Point(%f, %f) is not in the circle.", x, y);
        }
    }
}

     
    

        
            
    
    

            


