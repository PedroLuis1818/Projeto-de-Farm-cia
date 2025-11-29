import java.util.Scanner;

abstract class Filtracao {

    public double FiltragemDouble(Scanner input){

        return input.nextDouble();
    }

    public int FiltragemInt(Scanner input){

        return input.nextInt();
    }

    public String FiltragemString(Scanner input){

        return input.nextLine().toUpperCase().trim();
    }
}
