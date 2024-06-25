package exceptions;

public class LoginInvalido extends Exception {
    public LoginInvalido() {
        super("Login inválido");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
