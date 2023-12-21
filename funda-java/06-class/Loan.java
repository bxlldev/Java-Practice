public class Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;


    // Overloading Constructure => same method's name with class but difference parameters => missing parameter will return the default value
    // Default value
    // String => return "null"
    // int, double, float => return "0"
     public Loan(String applicantName){
        this.applicantName = applicantName;
    }

    // Constructure => same method's name with class
    public Loan(String applicantName, double loanAmount, float interestRate){
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    // Setter
    public void setInterestRate(float interestRate){
        this.interestRate = interestRate;
    }

    // Getter
    public float getInterestRate(){
        return interestRate;
    }

    // Private Method
    private double calculateInterest(){
        return this.loanAmount * this.interestRate / 100;
    }

    // Getter with Class's Method itself
    public double cal(){
        return this.calculateInterest();
    }

    // Overloading with Class's Method itself
    public double cal(double amount, float rate){
        return amount * rate / 100;
    }

    // toString Method => Transfer Hash to String
    public String toString(){
        return "Application Name: " + applicantName + "\nLoan Amount: " + loanAmount + "\nInterest Rate: " + interestRate;
    }
}
