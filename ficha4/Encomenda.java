package ficha4;

//rafael.b.costa@inesctec.pt

import java.time.LocalDate;
import java.util.ArrayList;

public class Encomenda {
    private String nome;
    private int nif;
    private String morada;
    private int id;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> encomendas;

    public Encomenda() {
        this.nome = "";
        this.nif = 0;
        this.morada = "";
        this.id = 0;
        this.data = LocalDate.now();
        this.encomendas = new ArrayList<>();
    }

    public Encomenda(String nome, int nif, String morada, int id, ArrayList<LinhaEncomenda> encomendas) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.id = id;
        this.data = LocalDate.now();
        this.setEncomendas(encomendas);
    }


    public Encomenda(Encomenda e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.id = e.getID();
        this.data = LocalDate.now();
        this.setEncomendas(e.getEncomendas());
    }

    public String getNome() {
        return this.nome;
    }

    public int getNif() {
        return this.nif;
    }


    public String getMorada() {
        return this.morada;
    }

    public int getID() {
        return this.id;
    }

    public LocalDate getData() {
        return this.data;
    }

    public ArrayList<LinhaEncomenda> getEncomendas() {
        ArrayList<LinhaEncomenda> aux = new ArrayList<>();

        for (LinhaEncomenda i : this.encomendas) {
            aux.add(i);
        }
        return aux;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = new ArrayList<>();

        for (LinhaEncomenda l : encomendas)
            this.encomendas.add(l);
    }

    public Encomenda clone(){
        return new Encomenda(this);
    }
    

    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;

        Encomenda aux = (Encomenda) obj;
        if (aux.encomendas.size() != this.encomendas.size())
            return false;

        for(int i = 0; i < this.encomendas.size(); i++){
            if (!(this.encomendas.get(i).equals(aux.encomendas.get(i))))
                return false;
        }
        return (this.nome.equals(aux.getNome()) && this.morada.equals(aux.getMorada()) && (this.nif == aux.getNif()) && (this.id == aux.getID()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ");
        sb.append(this.nome+"\n");
        sb.append("N fiscal: ");
        sb.append(this.nif+"\n");
        sb.append("Morada: ");
        sb.append(this.morada+"\n");
        sb.append("ID: ");
        sb.append(this.id+"\n");
        sb.append("Data: ");
        sb.append(this.data+"\n");
        this.encomendas.forEach( a -> sb.append(a.toString()+"\n"));

        return sb.toString();


    }


    public double calculaValorTotal() {
        double total = 0;
        for (LinhaEncomenda l : this.encomendas) {
            total += l.calculaValorLinhaEnc();
        }
        return total;
    }

    public double valorTotalDesconto() {
        double total = 0.0;
        for (LinhaEncomenda l : this.encomendas) {
            total += l.calculaValorDesconto();
        }
        return total;
    }

    public int numeroTotalProdutos() {
        int total = 0;
        for (LinhaEncomenda l : this.encomendas) {
            total += l.getQuantidade();
        }
        return total;
    }


    public boolean existeProdutoEncomenda(String refProduto) {
        boolean f = false;
        for (LinhaEncomenda l : this.encomendas) {
            if (l.getReferencia().equals(refProduto)){
                f = true;
                break;
            }
        }
        return f;
    }

    public void adicionaLinha(LinhaEncomenda linha) {
        this.encomendas.add(linha);
    }

    public void removeProduto(String codProd) {
        int i = 0;
        for (LinhaEncomenda l : this.encomendas) {
            if (l.getReferencia().equals(codProd)) {
                this.encomendas.remove(i);
                break;
            }
            i++;
        }
    }
}