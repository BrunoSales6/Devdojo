package ExercicicoAssosiacao;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;

    private Professor professor;

    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println(this.titulo);
        if(alunos!=null){
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        }
        System.out.println(local.getLocal());
        System.out.println(professor.getNome());

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
