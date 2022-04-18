public class WageEmployee extends Employee{

    //Atributo proprios da classe filha
    private double comissao; // valor da comissao por venda
    private int vendas;

    //Construtor da classe filha recebe um terceiro parametro (comissao)
    public WageEmployee(String nome, double salario, double comissao){
        super(nome,salario); // Chamando o construtor da classe mãe
        this.comissao = comissao;
    }
    //Construtor que recebe alem do valor da comissao a quantidade de vendas
    public WageEmployee(String nome, double salario, double comissao, int vendas){
        super(nome,salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    // ------------- GETTERS AND SETTERS -------------------

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    //Poliformismo sera aplicado quando esta classe for estanciada e chamar o metodo getSalario
    //@Override (Subscrevendo o metodo)
    //Chamando o getSalario da classe Mãe e somando o retorno com (vendas * comissao)
    //Entao o getSalario do funcionario com comissao sera somando a vendas e comissao
    @Override
    public double getSalario() {
        return super.getSalario() + vendas * comissao;
    }
}
