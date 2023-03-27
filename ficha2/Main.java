package ficha2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exercicio1 e1 = new Exercicio1();
        int[] arr = {1, 0, 10, 15, 20};

        System.out.println("Minimo: " + e1.minimo(arr));
        System.out.println("SubAray: " + Arrays.toString(e1.subarray(arr, 1, 4)));

        int[] b = {1, 1, 15};
        System.out.println("Comuns: " + Arrays.toString(e1.comuns(arr,b)));

        Exercicio2 e2 = new Exercicio2();

        for (int i=0; i<20; i++){
            e2.insereData(LocalDate.of(2019, 1, 1));
        }

    }
}
