package exceptions;

import java.util.Scanner;

public class ExceptionCustom  {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalido e) {
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalido {
        Scanner sc= new Scanner(System.in);
        String user= "Bruno";
        String senha= "123";
        System.out.println("Usuer:");
        String userdigitado=sc.nextLine();
        System.out.println("senha:");
        String senhadigitada=sc.nextLine();
        if (!senha.equals(senhadigitada) || !user.equals(userdigitado)){
            throw new LoginInvalido("Usuario ou senha inválido");
        }
        System.out.println("Aceso liberado");

    }
}
