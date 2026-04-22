package Model;

import java.util.Date;

public abstract class Notificacion{
    private String codigo;
    private String destinatario;
    private String mensaje;
    private Date fechaEnvio;
    private Estado estado;

    protected CanalEnvio canal;

    public Notificacion(String codigo, String destinatario, String mensaje,
                        Date fechaEnvio, Estado estado, CanalEnvio canal) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.canal = canal;
    }

    public Notificacion(){
        this.codigo = "";
        this.destinatario = "";
        this.mensaje = "";
        this.fechaEnvio = new Date();
        this.estado = Estado.PENDIENTE;
        this.canal = null;
    }

    public abstract void enviar();

    public String getCodigo() {
        return codigo;
    }
    public  void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String  getDestinatario() {
        return destinatario;
    }
    public void  setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void  setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public Date getFechaEnvio() {
        return fechaEnvio;
    }
    public Estado getEstado() {
        return estado;
    }
    public CanalEnvio getCanal() {
        return canal;
    }
    public void setCanal(CanalEnvio canal) {
        this.canal = canal;
    }

    @Override
    public String toString(){
        return  "Notificación:" +
                "\n Código: " + codigo +
                "\n Destinatario: " + destinatario +
                "\n Fecha de Envío: " + fechaEnvio +
                "\n Canal de Envío: " +  canal +
                "\n Estado: " + estado +
                "\n Mensaje: " + mensaje;
     }
}
