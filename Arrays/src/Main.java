//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Turma turmaCiencia = new Turma();
        turmaCiencia.nomeTurma = "Ciencia";
        turmaCiencia.professor= "Lucia";
        turmaCiencia.aluno = new Aluno[2];

        turmaCiencia.aluno[0] = new Aluno();
        turmaCiencia.aluno[0].nome = "João";
        turmaCiencia.aluno[0].idade = 10;

        turmaCiencia.aluno[1] = new Aluno();
        turmaCiencia.aluno[1].nome = "Pedro";
        turmaCiencia.aluno[1].idade = 9;

        System.out.println(turmaCiencia.aluno[0].nome);
        System.out.println(turmaCiencia.aluno[1].nome);


    }
}