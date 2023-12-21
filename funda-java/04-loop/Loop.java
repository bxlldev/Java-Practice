public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++){
            System.out.println(i);
        }

        System.out.println("----for loop-----");

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++){
            int n = numbers[i];
            if (n % 2 == 0){
                System.out.println(n + " is even!");
            } else if(n == 3){
                System.out.println(n + " is Three!");
            }else {
                System.out.println(n + " is odd!");
            }

        }

        // System.out.println("----while loop-----");

        // int i = 0;
        // while (i< numbers.length) {
        //     System.out.println(numbers[i]);
        //     i++;
            
        // }
        
    }
    
}
