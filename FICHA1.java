import java.lang.Math;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class FICHA1 {
    public double celsiusParaFarenheit(double graus){
        double f = graus*9/5+32;
        return f;
    }

    public int maximoNumeros(int a, int b){
        return Math.max(a,b);
    }

    public String criaDescricaoConta (String nome, double saldo){
        return ("O nome é" + nome + " e o saldo é " + saldo + ".");
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        double libra = valor*taxaConversao;
        return libra;
    }

    public int media(int a, int b){
        int media = (a * b)/2;
        return (media);
    }

    public long factorial(int num){
        long fact = 1;
        for(int i = num;i > 0; i--)
            fact *= i;
        return fact;
    }

    public long tempoGasto(){
        LocalDateTime timeBegining  = LocalDateTime.now();
        long x = Timestamp.valueOf(timeBegining).getTime();
        factorial(5000);
        LocalDateTime timeend = LocalDateTime.now();
        long y = Timestamp.valueOf(timeend).getTime();
        long r = y-x;
        return r;
    }

}
