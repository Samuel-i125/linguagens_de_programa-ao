public class fatec {
    public static void main (String[] args) {
        aluno aluno_1 = new aluno("Diogo", "diogo@hotmail.com");
        aluno aluno_2 = new aluno("João", "jo@hotmail.com");
        aluno aluno_3 = new aluno("Maria", "ma@hotmail.com");

        Aluno[] fatec = {aluno_1, aluno_2, aluno_3};

        for(Aluno aluno: fatec){
            System.out.println("## Informações do Aluno ##");
            System.out.println("Nome: " + aluno.nome);
            System.out.println("E-mail: " + aluno.email);
            System.out.println("\n");
        }
    }
}