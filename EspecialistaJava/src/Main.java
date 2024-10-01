import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.idade = 10;
        cliente.notas = new int[]{2, 3, 4, 5};

        //Printando o valor por index
        System.out.println(cliente.notas[2]);

        for (int element : cliente.notas) {
            System.out.println(element);
        }
        System.out.println(cliente.notas[2]);

        //Alterando os valores do index
        cliente.notas[3]= 10;
        System.out.println(cliente.notas[3]);



    }
}