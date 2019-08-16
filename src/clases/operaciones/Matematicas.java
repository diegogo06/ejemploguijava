package clases.operaciones;
import static clases.constantes.MatematicasEnteros.*;
/**  @author cualquier cosa
 * @version 1.1 **/
public class Matematicas {
    private double numero1;
        private double numero2;


    public Matematicas() {
        this.numero1=CERO.getValor();
        this.numero2=CERO.getValor();
    }

    public Matematicas(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

}