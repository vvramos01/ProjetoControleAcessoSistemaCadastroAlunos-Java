public class Aluno {
   public String nome;
   private String matricula;
   protected int idade;
   String email;


   public Aluno(String nome, String matricula, int idade, String email) {
       this.nome = nome;
       this.matricula = matricula;
       this.idade = idade;
       this.email = email;
   }
   public void mostrarDadosPublicos() {
       System.out.println("Dados Públicos:");
       System.out.println("Nome: " + this.nome);

   }
   private void mostrarTodosDados() {
       System.out.println("Todos os Dados:");
       System.out.println("Nome: " + this.nome);
       System.out.println("Matrícula: " + this.matricula);
       System.out.println("Idade: " + this.idade);
       System.out.println("Email: " + this.email);
   }
   public void acessarDadosPrivados() {
       System.out.println("\nAcessando dados privados através de um método público...");
       mostrarTodosDados();
   }
}

