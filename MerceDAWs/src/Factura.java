import java.util.*;

public class Factura {

    // Insertar dependencia de Reparacion, ya que éstas se almacenarán
    // en una lista de reparaciones que comprende la Factura
    private ArrayList<Reparacion> reparaciones;

    // Constructor
    public Factura(){

    //Dentro del constructor se crea la lista de reparaciones
    reparaciones = new ArrayList<Reparacion>();

    }

}
