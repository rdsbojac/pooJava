public class Quadrado extends FiguraGeometrica{

    double lado;

    // Construtor recebe somente um lado
    public Quadrado(double lado){
        this.lado = lado;
    }

    // GETTERS AND SETTERS

    // Mudando o metodo da classe mae para calcular somente a area do quadrado
    @Override
    public double getArea() {
        return super.getArea() + lado * lado;
    }

    // Mundando o metodo da classe mae para calcular somente o perimetro do quadrado
    @Override
    public double getPerimetro() {
        return super.getPerimetro() + lado * 4;
    }

    // Mudando o metodo da classe mae para mostrar o nome desse objeto especificamente
    public String getNomeFigura(){
        return "Esta figura eh um Quadrado";
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
