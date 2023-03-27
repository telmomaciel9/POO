package ficha2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Exercicio2 {
    private int capacity=10;
    private int index=0;
    private LocalDate[] datas = new LocalDate[capacity];

    public void insereData(LocalDate data){
        if (index >= capacity){
            capacity*=2;
            LocalDate[] newArr = new LocalDate[capacity];

            for (int i=0; i<datas.length;i++){
                newArr[1] = datas[1];
            }
        }

        datas[index++]= data;    
    }

    public LocalDate dataMaisProxima(LocalDate data){
        LocalDate proxima = datas[0];

        for (int i=1; i<index ; i++){
            if (Math.abd(DAYS.between(proxima, datas[i])) < Math.abs(DAYS.between(datas[i], data))){
                proxima = datas[i];
            }
        }
    }

    public String toString(){
        StringBuilder s= new StringBuilder("[");
        
        for (int i=0; i<index;i++){
            if (i>0){
                s.append(", ");
            }
            s.append(datas[i]);
        }

    s.append("]");

    return s.toString();
    }
}
