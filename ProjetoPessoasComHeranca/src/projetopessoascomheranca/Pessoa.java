package projetopessoascomheranca;

public class Pessoa {
    protected String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(){
        this.idade++;
                System.out.println("Feliz aniversário!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Essa pessoa se chama: {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
