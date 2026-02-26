public class FolhaPagamento {

    private CalculadoraSalario calculadoraSalario;
    private CalculadoraDesconto calculadoraDesconto;

    public FolhaPagamento(CalculadoraSalario calculadoraSalario,
        CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraSalario = calculadoraSalario;
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public void gerarFolha(Funcionario funcionario) {

        double bruto = calculadoraSalario.calcularSalarioBruto(funcionario);
        double desconto = calculadoraDesconto.calcularDesconto(bruto);
        double liquido = bruto - desconto;

        System.out.println("====== FOLHA DE PAGAMENTO ======");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário Bruto: R$ " + bruto);
        System.out.println("Descontos: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + liquido);
        System.out.println("================================");
    }
}