import java.util.List;
import java.util.ArrayList;

public class Main {
        private static List<Professor> professores = new ArrayList<>();
        private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        professores.add (new Professor("Aeronauta"));
        professores.add (new Professor("Joaquim"));
        
        alunos.add (new Aluno ("Pedro"));
        alunos.add (new Aluno ("Sheila"));

        for (Professor prof : professores) {
            System.out.println("Nome: " + prof.getNome());
        }

        for (Aluno al : alunos) {
            System.out.println("Nome: " + al.getNome());
        
        }
        
    }
}

