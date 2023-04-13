import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mensajeBienvenida;
        String mensajeErrorCodigoUsuario;
        String mensajeErrorClaveNumerica;
        String solicitudDeCodigoUsuario;
        String solicitudClaveNumerica;

        int correctoCodigoUsuario = 1024;
        int correctaClaveNumerica= 4567;
        int ingresoCodigoUsuario;
        int ingresoClaveNumerica;

        mensajeErrorCodigoUsuario = "El codigo de usuario ingresado no es correcto.";
        mensajeErrorClaveNumerica = "La clave numerica ingresada no es correcta.";
        mensajeBienvenida = "Bienvenido al sistema de ingreso.";
        solicitudDeCodigoUsuario = "Por favor ingrese su codigo de usuario: ";
        solicitudClaveNumerica = "Por favor ingrese su clave numerica: ";
        Scanner scann = new Scanner(System.in);

        System.out.println(mensajeBienvenida);

        do {
            System.out.println(solicitudDeCodigoUsuario);
            ingresoCodigoUsuario = scann.nextInt();

            System.out.println(solicitudClaveNumerica);
            ingresoClaveNumerica = scann.nextInt();

            if (ingresoCodigoUsuario != correctoCodigoUsuario){
                System.out.println(mensajeErrorCodigoUsuario);
            }

            if (ingresoClaveNumerica != correctaClaveNumerica){
                System.out.println(mensajeErrorClaveNumerica);
            }
        }while(ingresoCodigoUsuario != correctoCodigoUsuario && ingresoClaveNumerica != correctaClaveNumerica);

        System.out.println("Los datos fueron validados correctamente.");


    }
}