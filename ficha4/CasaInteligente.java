package ficha4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import ficha4.Lampada.Modo;

public class CasaInteligente {
    
    private ArrayList<Lampada> lamp; 
    
    
    public CasaInteligente(){
        this.lamp = new ArrayList<>();
    }

    public CasaInteligente(ArrayList<Lampada> lampp){
        this.setLampadas(lampp);
    }

    public CasaInteligente(CasaInteligente casa){
        this.setLampadas(casa.getLampadas());
    }

    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CasaInteligente other = (CasaInteligente) obj;
        if (lamp == null) {
            if (other.lamp != null)
                return false;
        } else if (!lamp.equals(other.lamp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CasaInteligente [lamp=" + lamp + "]";
    }

    public ArrayList<Lampada> getLampadas() {
        ArrayList<Lampada> aux = new ArrayList<>();

        for (Lampada i : this.lamp) {
            aux.add(i);
        }
        return aux;
    }

    public void setLampadas(ArrayList<Lampada> lampp) {
        this.lamp = new ArrayList<>(lampp);
    }


    public void addLampada(Lampada l){
        lamp.add(l);
    }

    public void ligaLampadaNormal(int index){
        Lampada l = lamp.get(index);

        l.lampON();
    }

    public void ligaLampadaEco(int index){
        Lampada l = lamp.get(index);

        l.lampECO();
    }

    public int qtEmEco(){
        int contador = 0;

        for (Lampada l : lamp){
            if(l.getModo() == Lampada.Modo.ECO) contador++;
        }

        return contador;
    }

    public void removeLampada(int index){
        lamp.remove(index);
    }

    public void ligaTodasEco(){
        for(Lampada l : lamp) l.lampECO();
    }

    public void ligaTodasMax(){
        for(Lampada l : lamp) l.lampON();
    }

    public double consumoTotal(){
        double consumo = 0;

        for(Lampada l : lamp){
            consumo += l.getConsumoTotal();
        }

        return consumo;
    }

    public Lampada maisGastadora(){
        double consumo = 0;
        Lampada aux = new Lampada();

        for(Lampada l : lamp){
            if(l.getConsumoTotal() > consumo){
                consumo = l.getConsumoTotal();
                aux = l;
            }
        }

        return aux;
    }

    public Set<Lampada> lampadasEmModoEco(){
        Set<Lampada> set = new HashSet<>();

        for(Lampada l: lamp){
            if(l.getModo() == Modo.ECO) set.add(l);
        }

        return set;
    }

    public void reset(){
        for(Lampada l : lamp){
            l.resetPeriodo();
        }
    }

}


