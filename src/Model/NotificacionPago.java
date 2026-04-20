package Model;

import java.util.Date;

public class NotificacionPago extends Notificacion{
    private double monto;
    private String fechaLimite;

    public NotificacionPago(String codigo, String destinatario, String mensaje,
                            Date fechaEnvio, Estado estado, CanalEnvio canal,
                            String fechaLimite, double monto) {
        super (codigo, destinatario, mensaje, fechaEnvio, estado, canal);
        this.monto = monto;
        this.fechaLimite = fechaLimite;
    }
    public NotificacionPago(double monto, String fechaLimite) {
        this.monto = monto;
        this.fechaLimite = fechaLimite;
    }
    public NotificacionPago(){
        super();
        this.monto = 0;
        this.fechaLimite = "";
    }

    @Override
    public void enviar() {
        canal.enviar(getMensaje());
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getFechaLimite() {
        return fechaLimite;
    }
    public  void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Monto: " + monto +
                "\n Fecha Limite: " + fechaLimite;
    }
}
