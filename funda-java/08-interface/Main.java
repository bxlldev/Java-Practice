public class Main {
    public static void main(String[] args) {
        Loan mortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
        System.out.println(mortgage);
        double rate = mortgage.calculateInterest();
        System.out.println("Interest: " + rate);

        System.out.println("-----------------");

        Loan ball = new Auto("Ball", 10000.0d, 7.5f);
        System.out.println(ball);
        double rate2 = ball.calculateInterest();
        System.out.println("Interest: " + rate2);


    }
    
}
