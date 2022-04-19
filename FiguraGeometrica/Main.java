public class Main {

    public static void main(String[] args) {

        FiguraGeometrica figuraQualquer = new FiguraGeometrica();
        Quadrado quadrado = new Quadrado(9);
        Triangulo triangulo1 = new Triangulo(3, 5, 9, 8);
        Triangulo triangulo2 = new Triangulo(3, 3, 9, 8);
        Triangulo triangulo3 = new Triangulo(3,3,3,3);
        Triangulo triangulo4 = new Triangulo(2,2,2);
        Circulo circulo = new Circulo(2);


        FiguraGeometrica[] figuras = new FiguraGeometrica[7];
        figuras[0] = figuraQualquer;
        figuras[1] = quadrado;
        figuras[2] = triangulo1;
        figuras[3] = triangulo2;
        figuras[4] = triangulo3;
        figuras[5] = circulo;
        figuras[6] = triangulo4;

        // para cada figura em figuras
        for(FiguraGeometrica figura : figuras){
            System.out.println(figura.getNomeFigura() + ". Esta eh a area dessa figura: "  +
                               figura.getArea() +       ", e esse eh o seu perimetro:  " +
                               figura.getPerimetro());
        }
        System.out.println(triangulo1.getTipoTriangulo());
        System.out.println(triangulo2.getTipoTriangulo());
        System.out.println(triangulo3.getTipoTriangulo());
        System.out.println(triangulo4.getTipoTriangulo());
    }

}
