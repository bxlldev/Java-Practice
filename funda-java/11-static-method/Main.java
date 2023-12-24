public class Main {
    public static void main(String[] args) {
        Loan ball = new Loan("Ball");
        ball.show();
        Loan.info();
        infoMain();

        // static's method can be called only static's method
        // if you want static's method can be called non-static's method, need to create new instant
        
    }

    public static void infoMain(){
        System.out.println("Main:: static - infoMain()");
    }
    
}
