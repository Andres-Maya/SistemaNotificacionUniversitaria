package Model;

public enum Estado {
    PENDIENTE("Pendiente"),
    ENVIADO("Enviado"),
    LEIDO("Leido");

    private String estado;
    private Estado(String estado) {
        this.estado = estado;
    }
}
