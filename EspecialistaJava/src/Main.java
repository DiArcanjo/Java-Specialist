import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.idade = 10;
        aluno.notas = new Integer[]{5, 7, 1};

        //Printando o valor por index
        //System.out.println(aluno.notas[2]);

        for (int element : aluno.notas) {
            System.out.println(element);
        }
        //System.out.println(aluno.notas[2]);

        //Alterando os valores do index
        //aluno.notas[2]= 8;
        //System.out.println(aluno.notas[3]);

        double media = Calculadora.calcularMedia(aluno.notas);

        System.out.println(media);

        // Trabalhando com Array de string
        String notasAluno = Arrays.toString(aluno.notas);
        System.out.println(notasAluno);

        // Ordenando Arrays em ordem natural
        Arrays.sort(aluno.notas);
        System.out.println("Ordenando Arrays Asc: " + Arrays.toString(aluno.notas));

        // Ordenando Arrays em ordem reversa
        Arrays.sort(aluno.notas, Comparator.reverseOrder());
        System.out.println("Ordenando Arrays Desc: " + Arrays.toString(aluno.notas));


    }
}