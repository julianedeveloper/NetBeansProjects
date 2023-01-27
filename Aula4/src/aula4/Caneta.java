
package aula4;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private boolean destampar;
    private String cor;
    
    public Caneta(String m, String c, float p){
        this.tampar();
        this.cor = "Azul";
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    private void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.destampar = false;
    }
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + true);
        
    }
}
