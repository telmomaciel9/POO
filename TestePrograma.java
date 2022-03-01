import java.lang.String;
import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args)
    {
        FICHA1 f = new FICHA1();
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Introduza a temperatura em Cº");
        double tempc = input.nextDouble();
        System.out.println(tempc + " em graus ºC corresponde a " + f.celsiusparaFarenheit(tempc) + " em Farenheits");

        //Exercicio 2
        System.out.println("A");
        int a = input.nextInt();
        System.out.println("B");
        int b = input.nextInt();
        System.out.println("O maximo entre " + a + " e " + b + " é " + Math.max(a,b));

        //Exercicio 3
        System.out.println("Nome");
        String nome = input.next();
        System.out.println("Saldo");
        double saldo = input.nextDouble();
        System.out.println(f.criaDescricaoConta(nome, saldo));

        //Exercicio 4
        System.out.println("Euros");
        double euros = input.nextDouble();
        System.out.println("Taxa");
        double taxa = input.nextDouble();
        System.out.println(f.eurosParaLibras(euros, taxa) + " libras");

        //Exercicio 5
        System.out.println("Int");
        int x1 = input.nextInt();
        System.out.println("Int");
        int x2 = input.nextInt();
        if(x1>x2)
            System.out.println("Ordem : " + x1 + " " + x2 + "Média" f.media);
        else
            System.out.println("Ordem : " + x2 + " " + x1 + "Média" f.media);

        //Exercício 6
        System.out.println("Int");
        long x = input.nextLong();

        System.out.println("O fatorial do número" + x + " é" + f.fact );
        */
        //Exercício 7
        System.out.println("O tempo gasto na execução do fatorial de 5000 é " + f.tempoGasto() + " ms.");
    }
}
