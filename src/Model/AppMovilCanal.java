package Model;

public class AppMovilCanal implements CanalEnvio{
    private String usuarioApp;

    public  AppMovilCanal(String usuarioApp) {
        this.usuarioApp = usuarioApp;
    }
    public AppMovilCanal() {
        this.usuarioApp = "";
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("App a " + usuarioApp + ": " + mensaje);
    }

    public String getUsuarioApp() {
        return usuarioApp;
    }
    public void setUsuarioApp(String usuarioApp) {
        this.usuarioApp = usuarioApp;
    }

    @Override
    public String toString() {
        return "Usuario de app: " +  usuarioApp;
    }
}
