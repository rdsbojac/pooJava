public class Employee {

    //Definindo os atribtuso da classe Mãe
    private String nome;
    private double salario;
    private static double IMPOSTO = 0.08; // Atributo com valor fixo(constante)
    private double bonus;

    //Construtor com 3 parametros, quando estanciado recebe o valor do parametro "bonus" passado no construtor.
    public Employee(String nome, double salario, double bonus){
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }
    //Construtor com 2 parametros, quando estanciado recebe o valor fixo de 500
    public Employee(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.bonus = 500.0;
    }

    // --------- GETTERS ANDS SETTERS--------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Calcula o valor do salario aplicando o imposto e o bonus
    public double getSalario() {
        return (1-IMPOSTO)* salario + bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}

