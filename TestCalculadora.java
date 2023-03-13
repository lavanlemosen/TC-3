package testcalculadora;
import java.util.Scanner;
public class TestCalculadora {
    public static void main(String[] args) {
       
       Double num;
       Scanner valor = new Scanner(System.in);

       System.out.println("Digite um número");
       while (!valor.hasNextDouble()){
        System.out.println("Digite um número válido");
        valor.next();
    } 
       num = valor.nextDouble();
       System.out.println("O número é:"+num);
       valor.close();
       
    }
}