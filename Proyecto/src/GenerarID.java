
import java.util.Random;


public class GenerarID {
    public static String generarIDMembresia() {
        Random random = new Random();
        int numeroAleatorio = 100000 + random.nextInt(900000); 
        return "" + numeroAleatorio;
    }
}
