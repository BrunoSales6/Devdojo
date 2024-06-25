package ExercicicoAssosiacao;

public class Teste {
    public static void main(String[] args) {
        Seminario seminario=new Seminario("Chat gpt100");
        Local local=new Local("Auditório");
        Professor professor =new Professor("Villian","Machine Learning");
        Aluno aluno1=new Aluno("Bruno",19);
        Aluno aluno2=new Aluno("Iruan",19);
        Seminario[]seminarios={seminario};
        Aluno[]alunos={aluno1,aluno2};
        professor.setSeminarios(seminarios);
        seminario.setAlunos(alunos);
        seminario.setLocal(local);
        seminario.setProfessor(professor);
        seminario.imprime();





    }
}
