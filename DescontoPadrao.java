public class DescontoPadrao implements CalculadoraDesconto {

    @Override
    public double calcularDesconto(double salarioBruto) {

        double inss = salarioBruto * 0.08;
        double ir = salarioBruto * 0.05; 

        return inss + ir;
    }
}