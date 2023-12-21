public class Auto extends Loan {

     public Auto(String applicantName){
        super(applicantName);
    }

    // Constructure => same method's name with class
    public Auto(String applicantName, double loanAmount, float interestRate){
        super(applicantName, loanAmount, interestRate);
    }

    @Override
    public double calculateInterest(){
        System.out.println("Auto:: calculateInterest");
        return 5.5d;
    }
}
