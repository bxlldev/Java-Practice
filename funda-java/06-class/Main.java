public class Main {
    public static void main(String[] args) {
        // String applicantName = "Ball";
        // double johnLoanAmount = 10000.0d;
        // float interestRate = 7.5f;
        
        // System.out.println("Applicant Name: " + applicantName);
        // System.out.println("Loan Amount: " + loanAmount);
        // System.out.println("Interest Rate: " + interestRate);

        Loan ball = new Loan("Ball", 20000.0d, 8.5f);
        System.out.println(ball.getInterestRate());
        ball.setInterestRate(9.5f);
        System.out.println(ball.getInterestRate());
        System.out.println(ball);

        System.out.println("Interest: " + ball.cal());


        System.out.println("---------------");


        Loan bass = new Loan("Bass");
        System.out.println(bass);
        System.out.println("Interest: " + bass.cal(10000.0d, 6.5f));

    }
}
