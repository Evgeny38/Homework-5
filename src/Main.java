public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // TASK 1.
        //1.
        int [] dogs = new int[3] ;
        dogs [0] = 1;
        dogs [1] = 2;
        dogs [2] = 3;
        //2.
        double [] weights = {1.57, 7.654 ,9.986} ;
        //3.
        int [] flats = {3, 5, 15, 33,45} ;

        // TASK 2.
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i]);
            if (i != dogs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < flats.length; i++) {
            System.out.print(flats[i]);
            if (i != flats.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // TASK 3.

        for (int i = dogs.length - 1; i >= 0 ; i--) {
            System.out.print(dogs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weights.length -1; i >=0 ; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = flats.length - 1; i >=0; i--) {
            System.out.print(flats[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // TASK 4.

        for (int i = 0; i < dogs.length; i++) {
            if ( dogs[i] % 2 != 0) {
                dogs[i]++;
            }
            System.out.print(dogs[i]);
            if (i != dogs.length - 1) {
                System.out.print(", ");
            }

        }


    }
}