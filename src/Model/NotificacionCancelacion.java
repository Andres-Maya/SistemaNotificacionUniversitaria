package Model;

import java.util.Date;

public class NotificacionCancelacion extends Notificacion{
    private String motivo;

    public NotificacionCancelacion(String codigo, String destinatario, String mensaje,
                                   Date fechaEnvio, Estado estado, CanalEnvio canal,
                                   String motivo) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, canal);
        this.motivo = motivo;
    }
    public NotificacionCancelacion(String motivo) {
        this.motivo = motivo;
    }
    public NotificacionCancelacion() {
        super();
        this.motivo = "";
    }

    @Override
    public void enviar() {
        canal.enviar(getMensaje());
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n motivo=" + motivo;
    }
}
