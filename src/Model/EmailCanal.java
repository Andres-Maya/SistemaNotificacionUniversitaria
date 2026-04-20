package Model;

public class EmailCanal implements CanalEnvio{
    private String correo;

    public EmailCanal(String correo) {
        this.correo = correo;
    }
    public EmailCanal() {
        this.correo = "";
    }

    @Override
    public void enviar(String mensaje){
        System.out.println("EMAIL a " + correo + ": " + mensaje);
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Correo email: " + correo;
    }
}
