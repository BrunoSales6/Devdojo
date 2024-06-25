package classeCoringa.servico;

import java.util.List;

public class RentalService <T>{
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("BUSCANDO..");
        T t=objetosDisponiveis.remove(0);
        System.out.println("Alugando: "+t);
        System.out.println("Objetos disponíveis agora:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: ");
        System.out.println(objetosDisponiveis);
    }

}
