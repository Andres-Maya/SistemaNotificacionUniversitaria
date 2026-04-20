import Model.*;
import Model.NotificacionPago;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==Bienvenido al Sistema de Envío de Notificaciones==");

        System.out.println("Ingrese el código: ");
        String codigo = sc.nextLine();

        System.out.println("Ingrese el nombre del destinatario: ");
        String destinatario = sc.nextLine();

        System.out.println("Ingrese su mensaje: ");
        String mensaje = sc.nextLine();

        Date fechaEnvio = new Date();
        Estado estado = Estado.PENDIENTE;

        System.out.println("\nSelecciona el canal de envío: ");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. App Móvil");
        System.out.println("Seleccione un número");

        int opcionCanal = sc.nextInt();
        sc.nextLine();

        CanalEnvio canal = null;
        switch (opcionCanal) {
            case 1:
                System.out.println("Ingrese el correo: ");
                String correo = sc.nextLine();
                canal = new EmailCanal(correo);
                break;
            case 2:
                System.out.println("Ingrese el SMS: ");
                String numero = sc.nextLine();
                canal = new SmsCanal(numero);
                break;
            case 3:
                System.out.println("Ingrese el usuario: ");
                String usuarioApp = sc.nextLine();
                canal = new AppMovilCanal(usuarioApp);
                break;
            default:
                System.out.println("Opción invalida");
                return;
        }

        System.out.println("\nSeleccione el Tipo de Notificación: ");
        System.out.println("1. Calificaciones");
        System.out.println("2. Pago");
        System.out.println("3. Cancelación de Clase");
        System.out.println("4. Evento");
        System.out.println("Ingrese un número");

        int tipo =  sc.nextInt();
        sc.nextLine();

        Notificacion notificacion = null;

        switch (tipo) {
            case 1:
                System.out.println("Curso: ");
                String curso = sc.nextLine();

                System.out.println("Nota: ");
                double nota = sc.nextDouble();

                notificacion = new NotificacionCalificacion(
                        codigo, destinatario, mensaje, fechaEnvio, estado,
                        canal, curso, nota
                );
                break;
            case 2:
                System.out.print("Monto: ");
                double monto = sc.nextDouble();
                sc.nextLine();

                System.out.print("Fecha límite de pago: ");
                String fechaLimite = sc.nextLine();

                notificacion = new NotificacionPago(
                        codigo, destinatario, mensaje, fechaEnvio, estado,
                        canal, fechaLimite, monto
                );
                break;
            case 3:
                System.out.println("Motivo: ");
                String motivo = sc.nextLine();

                notificacion = new NotificacionCancelacion(
                        codigo, destinatario, mensaje, fechaEnvio, estado,
                        canal, motivo
                );
            case 4:
                System.out.print("Nombre del evento: ");
                String nombreEvento = sc.nextLine();

                System.out.print("Lugar: ");
                String lugar = sc.nextLine();

                notificacion = new NotificacionEvento(
                        codigo, destinatario, mensaje, fechaEnvio, estado,
                        canal,  nombreEvento, lugar
                );
            default:
                System.out.println("Tipo de Notificación invalida");
                return;
        }

        System.out.println("--Enviando Notificación--");
        notificacion.enviar();

        System.out.println("\nDetalles del envío: ");
        System.out.println(notificacion);

        sc.close();
    }
}
