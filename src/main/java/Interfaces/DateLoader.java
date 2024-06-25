package Interfaces;

public interface DateLoader {
    void load();
    public static final int MAX_DATA_SIZE=10;

    default void check(){
        System.out.println("Checando permissões");
    }
}
