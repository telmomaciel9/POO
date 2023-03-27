/**
 * Write a description of class Encomenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 import java.time.*;
 import java.util.Arrays;
 
 
 public class Encomenda
 {
    private String nome;
    private int nr_fiscal;
    private String morada;
    private int nr_encomenda;
    private LocalDate data;
    private LinhaEncomenda[] encomendas;
    private int nr_linhas;
    
    
    public Encomenda(){
        this.nome = "";
        this.nr_fiscal = 0;
        this.morada = "";
        this.nr_encomenda = 0;
        this.data = LocalDate.of(0,0,0);
        this.encomendas = null;
        this.nr_linhas = 0;
     }
    
    public Encomenda(String nome, int numero, int linhas, String morada,int encomenda, LocalDate data, LinhaEncomenda[] linha){
         this.nome = nome;
         this.nr_fiscal = numero;
         this.morada = morada;
         this.nr_encomenda = encomenda;
         this.data = data;
         this.encomendas = linha;
         this.nr_linhas = linhas;
     }
    
    public Encomenda(Encomenda a){
        this.nome = a.getNome();
        this.nr_fiscal = a.getFiscal();
        this.morada = a.getMorada();
        this.nr_encomenda = a.getNrEncomenda();
        this.data = a.getData();
        this.encomendas = a.getEncomendas();
        this.nr_linhas = a.getLinhas();
     }
     
    public String getNome(){
        return this.nome;
     }
    
    public int getFiscal(){
        return this.nr_fiscal;
     }
    
    public String getMorada(){
        return this.morada;
     }
    
    public int getNrEncomenda(){
        return this.nr_encomenda;
     }
     
    public LocalDate getData(){
        return this.data;
     }
     
    public LinhaEncomenda[] getEncomendas(){
        return this.encomendas;
     }
     
   public int getLinhas(){
         return this.nr_linhas;
     }
     
   public Encomenda clone(){
         return new Encomenda(this);
     }
     
   public void setNome(String n1){
         this.nome = n1;
     }
     
     public void setFiscal(int fiscal){
         this.nr_fiscal = fiscal;
     }
     
     public void setMorada(String morada){
         this.morada = morada;
     }
     
     public void setNrEncomenda(int encomenda){
         this.nr_encomenda = encomenda;
     }
     
     public void setData(LocalDate data){
         this.data = data;
     }
     
     public void setLinha(LinhaEncomenda[] linha){
         this.encomendas = linha;
     }  
     
     public void setLinhas(int linhas){
         this.nr_linhas = linhas;
     }
     
     // alinea b)
     
     public double calculaValorTotal(){
         int i;
         double total = 0;
         for(i = 0; i < this.nr_linhas; i++){
             total += this.encomendas[i].calculaValorLinhaEnc();
             }
         
         return total;
     }
     
     
     // alinea c)
     
     
     public double calculaValorDesconto(){
         int i;
         double total = 0;
         for(i = 0; i < this.nr_linhas; i++){
             total += this.encomendas[i].calculaValorDesconto();
         }
     
         return total;
     }
     
     // alinea d)
     
     
     public int numeroTotalProdutos(){
         int i;
         int total = 0;
         int quantidade;
         for(i = 0; i < nr_linhas; i++){
             quantidade = this.encomendas[i].getQuantidade();
             total += quantidade;
     
         }
         return total;
     }
     
     
     
     // alinea e)
     
     public boolean existeProdutoEncomenda(String refProduto){
         boolean resultado = false;
         int i;
         for(i = 0; i < nr_linhas && !resultado; i++){
             String ref = this.encomendas[i].getDescricao();
             resultado = ref.equals(refProduto);
     }
     
     return resultado;
 }
 
 
 
     //alinea f)
     
     public void adicionaLinha (LinhaEncomenda linha){
         int i = nr_linhas;
         if(i == this.encomendas.length - 1) Arrays.copyOf(this.encomendas, this.encomendas.length * 2);
         this.encomendas[i] = linha;
         nr_linhas++;
     }
 
 
 
     //alinea g)
     
     public void removeProduto(String codProd){
         int i;
         int j;
         for(i = 0; i < this.nr_linhas; i++){
             if(existeProdutoEncomenda(codProd)){
                 this.encomendas[i] = null;
                 this.nr_linhas--;
                 for (j = this.encomendas.length; j >= 0 && j != i - 1; j--) {                
                        encomendas[i] = encomendas[i+1];
                     }
                 }
             
         }
     }
 }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 