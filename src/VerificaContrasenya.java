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
        StringBuilder mensaje = new StringBuilder();
        if (contrasenya.length() < 8) mensaje.append(tipoErrores().get(0));
        if (!contrasenya.matches(".*\\d.*\\d.*")) mensaje.append(tipoErrores().get(1));
        if (!contrasenya.matches(".*[A-Z].*")) mensaje.append(tipoErrores().get(2));
        if (!contrasenya.matches(".*[^a-zA-Z0-9].*")) mensaje.append(tipoErrores().get(3));

        return new EsCorrecta(false, mensaje);
    }

    private List<String> tipoErrores() {
        List<String> errores = new ArrayList<>();
        errores.add("La contrasenya ha de tenir almenys 8 caracters\n");
        errores.add("La contrasenya ha de contenir almenys 2 numeros\n");
        errores.add("La contrasenya ha de contenir almenys una lletra majuscula\n");
        errores.add("La contrasenya ha de contenir almenys un caracter especial");
        return errores;
    }
}
