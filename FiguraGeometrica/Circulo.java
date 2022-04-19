public class Circulo extends FiguraGeometrica{

    double diametro;
    private static final double  pi = 3.14;

    public Circulo(int diametro){
        this.diametro = diametro;
    }

    // GETTERS AND SETTERS

    // Mudando o metodo da classe mae para calcular somente a area do circulo
    @Override
    public double getArea() {
        double raio = diametro / 2;
        return super.getArea() + pi * (raio * raio);
    }

    // Mudando metodo da classe mae para calcular o perimetro do circulo
    @Override
    public double getPerimetro() {
        double raio = diametro / 2;
        return super.getPerimetro() + 2*pi*raio ;
    }

    // Mudando o metodo herdado da classe mae para mostrar o nome this.objeto
    @Override
    public String getNomeFigura() {
        return "Esta figura eh um Circulo";
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}

