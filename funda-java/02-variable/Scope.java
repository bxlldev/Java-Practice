public class Scope {
    public static void main(String[] args) {
        float xxx = 7.5f;

        {
            float interestRate = 7.5f;
            System.out.println(interestRate);
            System.out.println("inside: " + xxx);
        }
        System.out.println(xxx);
    }
    
}
