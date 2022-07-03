import java.util.Scanner;

public class console {
    
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt,int min, int max){
        double number;
        
        while(true){
            System.out.print(prompt);
            number = scanner.nextDouble();
            System.out.println();
            if(number>=min && number<=max){
                break;
            }else{
                System.out.println("Enter the value within "+min + " - "+max); 
                System.out.println();
            }
        }  
        return number;
    }

}
