public class RodarAplicacao {
    public static void main(String[] args) {

        // Crie um objeto do tipo funcionario e guardei dentro da classe Funcionario
        Funcionario funcionario = new Funcionario();

        // nessas 3 linhas, ocorreu 3 upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineira = new Faxineira();

        // Gerente gerente_ = new Funcionario();
        // downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
