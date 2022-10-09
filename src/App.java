import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.print("Informe valor da hora : ");
    Scanner sc = new Scanner(System.in);
    
    int valorH = sc.nextInt();
    System.out.println();
    System.out.print("Informa quatidade de horas trabalhadas : ");
    int horasT = sc.nextInt();
    int salario = valorH * horasT;
    sc.close();
    System.out.println();
    System.out.println("Salario é : R$" + salario);
    }
}
