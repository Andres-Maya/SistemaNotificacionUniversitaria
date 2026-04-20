package Model;

import java.util.Date;

public class NotificacionEvento extends Notificacion{
    private String nombreEvento;
    private String lugar;

    public NotificacionEvento(String codigo, String destinatario, String mensaje,
                              Date fechaEnvio, Estado estado, CanalEnvio canal,
                              String nombreEvento, String lugar) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, canal);
        this.nombreEvento = nombreEvento;
        this.lugar = lugar;
    }
    public NotificacionEvento(String nombreEvento, String lugar) {
        this.nombreEvento = nombreEvento;
        this.lugar = lugar;
    }
    public NotificacionEvento() {
        super();
        this.nombreEvento = "";
        this.lugar = "";
    }

    @Override
    public void enviar() {
        canal.enviar(getMensaje());
    }

    public String getNombreEvento() {
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Nombre del Evento: " + nombreEvento +
                "\n Lugar del Evento: " + lugar;
    }
}
