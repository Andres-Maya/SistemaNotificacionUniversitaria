package Model;

import java.util.Date;

public class NotificacionCalificacion extends Notificacion{
    private String curso;
    private double nota;

    public NotificacionCalificacion(String codigo, String destinatario, String mensaje,
                                    Date fechaEnvio, Estado estado, CanalEnvio canal,
                                    String curso, double nota) {
        super (codigo, destinatario, mensaje, fechaEnvio, estado, canal);
        this.curso = curso;
        this.nota = nota;
    }

    public NotificacionCalificacion(String curso, double nota) {
        this.curso = curso;
        this.nota = nota;
    }

    public NotificacionCalificacion(){
        super();
        this.curso = "";
        this.nota = 0;
    }

    @Override
    public void enviar() {
        canal.enviar(getMensaje());
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Notificación de calificación: " + super.toString() +
                "\n Curso: " + curso +
                "\n Nota: " + nota;
    }
}
