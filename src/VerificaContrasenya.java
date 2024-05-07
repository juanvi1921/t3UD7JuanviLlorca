import java.util.ArrayList;
import java.util.List;

public class VerificaContrasenya {
    private String contrasenya;

    public VerificaContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public EsCorrecta verificacion(String contrasenya) {
        if (contrasenya.length() < 8) {
            return new EsCorrecta(false, tipoErrores().get(0));
        }
        return new EsCorrecta(true, "La contrasenya es valida");
    }

    private EsCorrecta esValida(boolean esValida, String msg) {
        return new EsCorrecta(esValida, msg);
    }

    private List<String> tipoErrores() {
        List<String> errores = new ArrayList<>();
        errores.add("La contrasenya ha de tenir almenys 8 caracters");
        errores.add("La contrasenya ha de contenir almenys 2 numeros");
        errores.add("La contrasenya ha de contenir almenys una lletra majuscula");
        errores.add("La contrasenya ha de tenir almenys un caracter especial");
        return errores;
    }
}
