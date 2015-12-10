
package boltein12_1;

/**
 *
 * @author agomezcastro
 */
public class Boltein12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaxe coches1= new Garaxe();
        PreciosGaraxe factura1= new PreciosGaraxe();
        
        coches1.Plazas();
        coches1.Matricula();
        factura1.calcularPrecios();
        factura1.Precios();
        factura1.Pago();
    }
    
}
