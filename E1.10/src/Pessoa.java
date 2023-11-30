public class Pessoa {
    private String nome;
    private double salario;
    private int idade;
    private int dependentes;

    public Pessoa(String nome, double salario, int idade, int dependentes) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.dependentes = dependentes;
    }

    public double calculaImposto() {
        if (idade >= 65) {
            return 0;
        } else {
            if (salario <= 1787.77) {
                return 0;
            } else if (salario >= 1787.78 && salario <= 2679.29) {
                return (salario * 0.075) - (dependentes * 179.71) - 134.08;
            } else if (salario >= 2679.29 && salario <= 3572.43) {
                return (salario * 0.15) - (dependentes * 179.71) - 335.03;
            } else if (salario >= 3572.44 && salario <= 4463.81) {
                return (salario * 0.225) - (dependentes * 179.71) - 602.96;
            } else {
                return (salario * 0.275) - (dependentes * 179.71) - 826.15;
            }
        }
    }
}