package polimorfismo.teste;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.servico.RepositorioBancoDeDados;
import polimorfismo.servico.RepositorioMemoria;

public class TesteRepositorio {
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorioBancoDeDados=new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();
        Repositorio repositorio=new RepositorioMemoria();
        repositorio.salvar();
    }
}
