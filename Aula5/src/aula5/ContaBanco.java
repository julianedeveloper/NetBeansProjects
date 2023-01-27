package aula5;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("___________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public ContaBanco(){
        saldo = 0;
        status = false;
    }
    public void setDono(String d){
        setDono(d);
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(int s){
        setSaldo (s);
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean status){
        setStatus(status);
    }
    public boolean getStatus(){
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(tipo == "CC"){
            setSaldo(50);
        }else if(tipo == "CP"){
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Ainda há saldo positivo. Fechamento não concluído.");
        }else if(saldo < 0){
            System.out.println("Conta com débito pendente.");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar( float v){
        if(true== this.getStatus()){
            this.setSaldo((int) (this.getSaldo() + v));
        }else{
            System.out.println("Impossível depositar. Conta fechada.");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
              this.setSaldo((int) (this.getSaldo()- v)); 
              System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente para sacar.");
            }
        }else{
                System.out.println("Impossível sacar de uma conta fechada.");
               }
    }
    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo((int) (this.getSaldo() - v));
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Conta fechada.");
        }
    }
    
}
