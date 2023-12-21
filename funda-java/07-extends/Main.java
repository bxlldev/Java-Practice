public class Main {
    public static void main(String[] args) {
        Loan john = new Loan("John", 20000.0d, 8.5f);
        john.calculateInterest();
        System.out.println(john);

        System.out.println("-----------------");

        Loan alice = new Auto("Alice", 10000.0d, 7.5f);
        alice.calculateInterest();
        System.out.println(alice);


        System.out.println("-----------------");

        Loan danny = new Mortgage("Danny", 10000.0d, 7.5f);
        danny.calculateInterest();
        System.out.println(danny);
        
    }
    
}
