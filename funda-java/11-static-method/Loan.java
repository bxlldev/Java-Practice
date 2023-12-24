public class Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Loan(){

    }

    
    public Loan(String applicantName){
        this.applicantName = applicantName;
    }

    // Constructure => same method's name with class
    // public Loan(String applicantName, double loanAmount, float interestRate){
    //     this.applicantName = applicantName;
    //     this.loanAmount = loanAmount;
    //     this.interestRate = interestRate;
    // }


    // Void => no need "return", but double, float, String, etc., need to "return"
    // Static => stickly with Class only, no matter when instant is called => best practice, should be called with class itself
    public static void info(){
        System.out.println("Loan:: static - info()");
    }

    public void show(){
        System.out.println("Loan:: show() : " + this.applicantName);
    }

    public String toString(){
        return "Application Name: " + applicantName + "\nLoan Amount: " + loanAmount + "\nInterest Rate: " + interestRate;
    }
}
