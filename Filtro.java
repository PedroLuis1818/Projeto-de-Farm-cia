import java.util.Scanner;
public class Filtro extends Filtracao {

    @Override
    public double FiltragemDouble(Scanner input){
        while (!input.hasNextInt()){
            System.out.println("Digite numerais!");
            input.nextLine();
        }
        return input.nextDouble();
    }

    @Override
    public int FiltragemInt(Scanner input){
        while (!input.hasNextInt()){
            System.out.println("Digite numerais inteiros!");
            input.nextLine();
        }
        return input.nextInt();
    }

    //Polimorfismo
    public int FiltragemInt(Scanner input, String custom){
        while (!input.hasNextInt()) {
            System.out.println(custom);
            input.nextLine();
       }
        return input.nextInt();
    }

}
