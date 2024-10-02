import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Turma turmaCiencia = new Turma();
        turmaCiencia.nomeTurma = "Ciencia";
        turmaCiencia.professor= "Lucia";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Clara";
        aluno1.idade = 10;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Vinicius";
        aluno2.idade = 11;

        turmaCiencia.adicionarAlunos(aluno1);
        turmaCiencia.adicionarAlunos(aluno2);
        turmaCiencia.removerAlunos(aluno2);
        turmaCiencia.imprimirAlunos();


        // COPIANDO UM ARRAY PARA O OUTRO
        // criando o array
        int[] numeroJogos1 = {25, 11, 8, 46, 37, 14};

        // realizando a copia de 3 posiçoes do array de cima
        int[] numeroJogos2 = Arrays.copyOf(numeroJogos1, 3);


    }
}