public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Gabriel");
        pessoa.setIdade(21);
        pessoa.setEndereco("Avenida Paulista, 1000, Apto 41, Bela Vista, São Paulo - SP, 01310-100");
        pessoa.setCidade("São Paulo");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");

        pessoa.fazAniversario();

        System.out.println("Idade pós aniversário: " + pessoa.getIdade() + " anos");
    }
}