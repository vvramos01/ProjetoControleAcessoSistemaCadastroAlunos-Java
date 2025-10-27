public class TesteAcesso {
   public static void main(String[] args) {


       Aluno aluno1 = new Aluno("Joao Silva", "2023001", 20, "joao.silva@email.com");


       System.out.println("--- Teste de Acesso Direto aos Atributos ---");


       System.out.println("Acesso ao 'nome' (public): " + aluno1.nome);


       System.out.println("Acesso à 'idade' (protected): " + aluno1.idade);


       System.out.println("Acesso ao 'email' (default): " + aluno1.email);


       System.out.println("\n--- Teste de Acesso via Métodos ---");


       aluno1.mostrarDadosPublicos();
       aluno1.acessarDadosPrivados();


   }
}
