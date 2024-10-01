//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.idade = 10;
        aluno.notas = new int[]{2, 3, 4};

        //Printando o valor por index
        //System.out.println(aluno.notas[2]);

        for (int element : aluno.notas) {
            System.out.println(element);
        }
        //System.out.println(aluno.notas[2]);

        //Alterando os valores do index
        aluno.notas[2]= 8;
        //System.out.println(aluno.notas[3]);

        double media = Calculadora.calcularMedia(aluno.notas);

        System.out.println(media);



    }
}