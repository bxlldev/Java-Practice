import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Auto ball = new Auto("Ball", 10000.0d, 7.5f);
        System.out.println(ball);
        ball.calculateInterest();
        System.out.println(ball.getApplicantName());
        System.out.println(Arrays.toString(ball.paymentOptions()));
        

        System.out.println("--------");

        Mortgage boat = new Mortgage("Boat", 20000.0d, 8.5f);
        System.out.println(boat);
        boat.calculateInterest();
        System.out.println(boat.getApplicantName());
        System.out.println(Arrays.toString(boat.paymentOptions()));


        
    }
    
}
