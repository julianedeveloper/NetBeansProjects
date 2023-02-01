package projetopessoascomheranca;

public class ProjetoPessoasComHeranca {
    
    public static void main(String[] args) {
         Visitante v1 = new Visitante();
         v1.setNome("Fernando");
         v1.setIdade(37);
         v1.setSexo("M");
         System.out.println(v1.toString());
         System.out.println("____________________");
         
         Aluno a1 = new Aluno();
         a1.setNome("Fernando");
         /*a1.setMatricula(0905);*/
         a1.setCurso("Arquitetura");
         a1.setIdade(37);
         a1.setSexo("M");
         a1.pagarMensalidade();
         System.out.println("______________________________");
         
         Bolsista b1 = new Bolsista();
         b1.setNome("Juliane");
         b1.setMatricula(0703);
         b1.setCurso("Software Engineer");
         b1.pagarMensalidade();
         System.out.println("_________________________________________");
         
        
       
    }
    
}