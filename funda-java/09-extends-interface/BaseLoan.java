public class BaseLoan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public BaseLoan(String applicantName){
        this.applicantName = applicantName;
    }

    // Constructure
    public BaseLoan(String applicantName, double loanAmount, float interestRate){
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    // // Interest Rate (Cal)
    // public double calculateInterest(){
    //     System.out.println("BaseLone:: Interest()");
    //     return 4.4;
    // }

    // Getter
    public String getApplicantName(){
        return applicantName;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    
    public float getInterestRate(){
        return interestRate;
    }

    // Setter
    public void setApplicantName(String applicantName){
        this.applicantName = applicantName;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public void setInterestRate(float interestRate){
        this.interestRate = interestRate;
    }

    // toString Method => Transfer Hash to String
    public String toString(){
        return "BaseLoan [applicationName: " + applicantName + " loanAmount: " + loanAmount + " interestRate: " + interestRate + "]";
    }
}
