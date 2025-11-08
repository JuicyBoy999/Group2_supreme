public class Question5 {
    public static void main(String[] args) {
        int sumEven=0;
        int productOdd=1;

        for (int i=1; i<=10; i++){
            if (i%2==0){
                sumEven+=i;
            } else{
                productOdd*=i;
            }
        }
        System.out.println("Sum of even numbers between 1 and 10: "+ sumEven);
        System.out.println("Product of odd numbers between 1 and 10: "+ productOdd);
    }

}

