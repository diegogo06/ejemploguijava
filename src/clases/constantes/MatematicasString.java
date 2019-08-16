package clases.constantes;

public enum MatematicasString {
    TITULO_OPCION("Opciones matematicas");

    public String getTexto() {
        return texto;
    }

    private String texto;

    MatematicasString(String texto) {
        this.texto = texto;
    }

}
