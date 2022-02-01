package Package.com;

import java.util.Arrays;

public class Kvadrat {

    public void printKvadrat(int tal){
        String[] dims = new String[tal];

        for(int i = 0; i < dims.length; i++){
            System.out.println();
            System.out.print(dims[i] = "*  ");
            for (int j = 1; j < dims.length; j++) {
                System.out.print(dims[j] = "*  ");

            }

        }


    }


    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();

        kvadrat.printKvadrat(6);
    }

}
