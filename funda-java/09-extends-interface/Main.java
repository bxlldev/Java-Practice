import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Auto ball = new Auto("Ball", 10000.0d, 7.5f);
        System.out.println(ball.calculateInterest());
        System.out.println(Arrays.toString(ball.paymentOptions()));
        System.out.println(ball);
    }
    
}
