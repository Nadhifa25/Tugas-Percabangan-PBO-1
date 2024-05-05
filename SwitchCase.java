import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Makan berapa piring : ");
        int piring = scanner.nextInt();
        
        if (piring >= 1 && piring <= 4) {
            switch (piring){
                case 1: 
                    System.out.println("Sepiring = Sarapan");
                    break;

                case 2: 
                    System.out.println("Dua piring = Makan");
                    break;

                case 3: 
                    System.out.println("Tiga piring = Membantas");
                    break;

                case 4: 
                    System.out.println("Empat piring = Menjajal");
                    break;
            }
            
        } else {
            System.out.println("Sadang dah kalo pina bungkas parut");
            }
    }
}



