public class Funcionario {

    private String nome;
    private double salarioBase;
    private double horasExtras;
    private double valorHoraExtra;

    public Funcionario(String nome, double salarioBase, 
    double horasExtras, double valorHoraExtra) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }
    public double getHorasExtras() { return horasExtras; }
    public double getValorHoraExtra() { return valorHoraExtra; }
}