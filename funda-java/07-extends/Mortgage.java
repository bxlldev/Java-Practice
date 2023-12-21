public class Mortgage extends Loan {

     public Mortgage(String applicantName){
        super(applicantName);
    }

    // Constructure => same method's name with class
    public Mortgage(String applicantName, double loanAmount, float interestRate){
        super(applicantName, loanAmount, interestRate);
    }
    
    @Override
    public double calculateInterest(){
        System.out.println("Mortgage:: calculateInterest");
        return 3.4d;
    }
}
