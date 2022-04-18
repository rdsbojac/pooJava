public class Main {


    public static void main(String[] args) {

        PersonalityObject objeto = new PersonalityObject();
        Employee e1 = new Employee("Ronaldo", 1500);
        Employee e2 = new Employee("Daniel", 3000, 900);
        WageEmployee e3 = new WageEmployee("Gabriela", 2000, 5);
        WageEmployee e4 = new WageEmployee("Rosinaldo",3200, 20,320);



        Employee[] employees = new Employee[4];
        employees[0] = e1; // Estanciado usando construtor com 2 paraametros
        employees[1] = e2; // Estanciado usando construtor com 3 parametros(nome,salario e bonus)
        employees[2] = e3; // Herança aplicada e nova estancia recebe agora a comissao
        employees[3] = e4; //

        for(Employee employee: employees){ // iterando sobre a lista de objetos e retorndo os atributos das mesmas
            System.out.println("Nome: " + employee.getNome() + " Salario: " + employee.getSalario());
        }





    }
}
