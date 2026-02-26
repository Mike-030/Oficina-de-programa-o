public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Michel",
                3000,
                10,
                50
        );

        CalculadoraSalario calcSalario = new CalculadoraSalario();
        CalculadoraDesconto calcDesconto = new DescontoPadrao();

        FolhaPagamento folha = new FolhaPagamento(calcSalario, calcDesconto);
        folha.gerarFolha(funcionario);
    }
}