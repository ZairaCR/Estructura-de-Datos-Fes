/**
 *
 * @author michz
 */

import Arreglos.Arreglos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;

public class Nomina {
    private String nombreCompania;
    Arreglos<Trabajador> nomina;
    private String rutaArchivo;
    
    public static String SepSaltoLinea = "\n";
    public static String SepComa = ",";
    
    public Nomina(String rutaArchivo)throws IOException{
      this.rutaArchivo = rutaArchivo;
      
      String linea, fileContent = "";
      int contador = 0;
      
       BufferedReader bufferLectura = new BufferedReader(new FileReader(this.rutaArchivo));
       
        bufferLectura.readLine();
        while(( linea = bufferLectura.readLine()) != null) {
            fileContent += linea + "\n";
            contador++;
        }
        bufferLectura.close();
        
        String[] separacionSaltosLinea = fileContent.split(SepSaltoLinea);
        
        nomina = new Arreglos<>(contador);

        for (int i = 0; i < separacionSaltosLinea.length; i++) {
                   
            String[] lineaSeparadaComa = separacionSaltosLinea[i].split(SepComa);
            Trabajador trabajadorTemp = new Trabajador();
            trabajadorTemp.setNumeroTrabajador(parseInt(lineaSeparadaComa[0]));
            trabajadorTemp.setNombre(lineaSeparadaComa[1]);
            trabajadorTemp.setPaterno(lineaSeparadaComa[2]);
            trabajadorTemp.setMaterno(lineaSeparadaComa[3]);
            trabajadorTemp.setHorasExtra(parseInt(lineaSeparadaComa[4]));
            trabajadorTemp.setSueldoBase(parseInt(lineaSeparadaComa[5]));
            trabajadorTemp.setAnioIngreso(parseInt(lineaSeparadaComa[6]));
            nomina.setElemento(i, trabajadorTemp);
        }
    }

    public void calcularSueldo() {
        for(int i = 0; i < nomina.getLongitud(); i++){
            System.out.println(nomina.getElemento(i));
            System.out.println("Sueldo total: " + nomina.getElemento(i).calcularSueldo());
        }
    }

    public void obtenerMaxMin() {
        Trabajador maxTrabajador = nomina.getElemento(0);
        Trabajador minTrabajador = nomina.getElemento(0);
        for(Trabajador currTrabajador : nomina) {
            if(currTrabajador.getAnioIngreso() > maxTrabajador.getAnioIngreso()) {
                maxTrabajador = currTrabajador;
            }
            if(currTrabajador.getAnioIngreso() < minTrabajador.getAnioIngreso()) {
                minTrabajador = currTrabajador;
            }
        }

        System.out.println("Antiguedad ");
        System.out.println("Menor antiguedad: ");
        System.out.println(minTrabajador);
        System.out.println("Mayor antiguedad: ");
        System.out.println(maxTrabajador);
    }
      
  }

