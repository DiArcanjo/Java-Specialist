import java.util.ArrayList;

public class Turma {

    String nomeTurma;
    String professor;
    ArrayList<Aluno> alunos = new ArrayList<>();


    void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    void removerAlunos(Aluno aluno){
        alunos.remove(aluno);
    }

    void imprimirAlunos(){

        for (Aluno aluno : alunos) {
            if(alunos != null){
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            }else{
                System.out.println("Vago");
            }
        }

    }

}
