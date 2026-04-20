package Model;

public class SmsCanal implements CanalEnvio {
    private String numero;

    public SmsCanal(String numero) {
        this.numero = numero;
    }
    public SmsCanal(){
        this.numero = "";
    }

    @Override
    public void enviar(String mensaje){
        System.out.println("SMS a " + numero + ": " + mensaje);
    }

    public String getNumero() {
        return numero;
    }
    public  void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Número SMS: " +  numero;
    }
}
