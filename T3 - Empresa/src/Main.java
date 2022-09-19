
/**
 *
 * @author michz
 */
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Nomina nomina = new Nomina("junio.dat");
        nomina.calcularSueldo();
        nomina.obtenerMaxMin();
    }
}
