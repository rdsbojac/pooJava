public class Triangulo extends FiguraGeometrica{

    int lado1, lado2, base;
    double altura;

    public Triangulo(int lado1, int lado2, int base, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public  Triangulo(int lado1, int lado2, int base){
        this.lado1 = lado2;
        this.lado2 = lado2;
        this.base = base;
        this.altura = 0;
    }

    // GETTERS AND SETTERS

    public String getTipoTriangulo(){
        if(lado1 == lado2 && lado1 == base){
            return "Equilareto";
        }else if(lado1 == lado2 || lado1 == base || lado2 == base){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }

    // Mudando o metodo da classe mae para calcular somente a area do triangulo
    @Override
    public double getArea() {
        //Se triangulo for equilatero aplica essa formula raiz(3)/4 * lado²
        if (lado1 == lado2 && lado1 == base){
            return (Math.sqrt(3) / 4) * (lado1 * lado1);

        //Se altura for diferente de 0 e o triagulo for Isosceles aplica a formula (base*altura) / 2
        }else if (altura != 0 && (lado1 == lado2 || lado1 == base || lado2 == base)){
            return (base * altura) / 2;
        }else{
            return (base * altura) / 2;
        }
    }

    // Mudando metodo da classe mae para calcular o perimetro do triangulo
    @Override
    public double getPerimetro() {
        return super.getPerimetro() + lado1 + lado2 + base;
    }

    // Mudando metodo da classe mae para mostrar o nome desse objeto
    @Override
    public String getNomeFigura() {
        return "Esta figura eh um triangulo";
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
