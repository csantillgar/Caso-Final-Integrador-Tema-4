package Validacion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorEmail {
    public static boolean validarEmail(String email) {
        // Patrón de expresión regular para validar un correo electrónico
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compilar el patrón en un objeto Pattern
        Pattern pattern = Pattern.compile(patron);
        // Crear un objeto Matcher para la cadena de entrada
        Matcher matcher = pattern.matcher(email);
        // Verificar si la cadena cumple con el patrón de correo electrónico
        return matcher.matches();
    }
}
