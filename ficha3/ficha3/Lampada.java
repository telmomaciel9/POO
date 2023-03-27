package ficha3;

public class Lampada {
    private double consumoMax, consumoEco, consumoAtual;
    private double msCriação, msUltimoReset;

    public Lampada(){
        consumoMax = 10;
        consumoEco = 3;
        consumoAtual = 0;
        msCriação = System.currentTimeMillis();
        msUltimoReset = this.msCriação;
    }

    public Lampada(double consumoMax, double consumoEco){
        this.consumoMax = consumoMax;
        this.consumoEco = consumoEco;
        this.consumoAtual = 0;
        this.msCriação = System.currentTimeMillis();
        this.msUltimoReset = this.msCriação;
    }

    public Lampada(Lampada lamp){
        this.consumoMax = lamp.getConsumoMax();
        this.consumoEco = lamp.getConsumoEco();
        this.consumoAtual = lamp.getConsumoAtual();
        this.msCriação = lamp.getMsCriação();
        this.msUltimoReset = lamp.getMsUltimoReset();
    }

    public double getConsumoMax() {
        return consumoMax;
    }

    public void setConsumoMax(double consumoMax) {
        this.consumoMax = consumoMax;
    }

    public double getConsumoEco() {
        return consumoEco;
    }

    public void setConsumoEco(double consumoEco) {
        this.consumoEco = consumoEco;
    }

    public double getConsumoAtual() {
        return consumoAtual;
    }

    public void setConsumoAtual(double consumoAtual) {
        this.consumoAtual = consumoAtual;
    }

    public double getMsCriação() {
        return msCriação;
    }

    public void setMsCriação(double msCriação) {
        this.msCriação = msCriação;
    }

    public double getMsUltimoReset() {
        return msUltimoReset;
    }

    public void setMsUltimoReset(double msUltimoReset) {
        this.msUltimoReset = msUltimoReset;
    }

    @Override
    public String toString() {
        return "Lampada [consumoMax=" + consumoMax + ", consumoEco=" + consumoEco + ", consumoAtual=" + consumoAtual
                + ", msCriação=" + msCriação + ", msUltimoReset=" + msUltimoReset + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lampada other = (Lampada) obj;
        if (Double.doubleToLongBits(consumoMax) != Double.doubleToLongBits(other.consumoMax))
            return false;
        if (Double.doubleToLongBits(consumoEco) != Double.doubleToLongBits(other.consumoEco))
            return false;
        if (Double.doubleToLongBits(consumoAtual) != Double.doubleToLongBits(other.consumoAtual))
            return false;
        if (Double.doubleToLongBits(msCriação) != Double.doubleToLongBits(other.msCriação))
            return false;
        if (Double.doubleToLongBits(msUltimoReset) != Double.doubleToLongBits(other.msUltimoReset))
            return false;
        return true;
    }

    public Lampada clone(){
        return new Lampada(this);
    }

    public void reset(){
        this.consumoAtual = 0;
        this.msUltimoReset = 0;
    }

    public void lampON(){
        this.consumoAtual = this.consumoMax;
    }

    public void lampOFF(){
        this.consumoAtual = 0;
    }

    public void lampECO(){
        this.consumoAtual = this.consumoEco;
    }

    public double totalConsumo(){
        long ms = System.currentTimeMillis();
        return (ms-this.msCriação)*this.consumoAtual;
    }

    public double periodoConsumo(){
        long ms = System.currentTimeMillis();
        return (ms-this.msUltimoReset)*this.consumoAtual;
    }
}
