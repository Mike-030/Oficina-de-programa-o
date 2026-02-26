public class CalculadoraSalario {

    public double calcularSalarioBruto(Funcionario funcionario) {
        return funcionario.getSalarioBase() +
               (funcionario.getHorasExtras() * funcionario.getValorHoraExtra());
    }
}