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
        if (contrasenya.matches())
        if (contrasenya.length() < 8) {
            return new EsCorrecta(false, tipoErrores().get(0) + "\n" +
                    tipoErrores().get(1) + "\n" + tipoErrores().get(2) + "\n" +
                    tipoErrores().get(3));
        }

        //Hacerlo con StringBuilder
        return new EsCorrecta(true, "La contrasenya es valida");
    }

    private List<String> tipoErrores() {
        List<String> errores = new ArrayList<>();
        errores.add("La contrasenya ha de tenir almenys 8 caracters\n");
        errores.add("La contrasenya ha de contenir almenys 2 numeros\n");
        errores.add("La contrasenya ha de contenir almenys una lletra majuscula\n");
        errores.add("La contrasenya ha de contenir almenys un caracter especial\n");
        return errores;
    }
}
