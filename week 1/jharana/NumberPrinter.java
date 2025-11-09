public class NumberPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.print("skip" + " ");
            } else if (i % 4 == 0) {
                System.out.print(i * 2 +" " ); 
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.print("done");
    }
}

    

