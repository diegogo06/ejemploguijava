package clases.operaciones;

public class MatematicasLogica extends Matematicas{
    public double calcularsuma ()
    {
        return (this.getNumero1()+this.getNumero2());

    }
    public double calcularresta ()
    {
        return (this.getNumero1()-this.getNumero2());

    }
    public double calcularmultiplicacion ()
    {
        return (this.getNumero1()*this.getNumero2());

    }
    public double calculardivision ()
    {
        return (this.getNumero1()/this.getNumero2());

    }
}
