
package boltein12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class PreciosGaraxe {
    public int horas;
    public int horasExtra;
    private float precios;
    private float preciosExtra;
    public float cartosRecibidos;
    public float cartosDevoltos;
    
    public float calcularPrecios(){
        precios=(float) 1.5;
        preciosExtra=(float) 0.20;
        
        horas=Integer.parseInt(JOptionPane.showInputDialog("introduce numero de horas:"));
        System.out.println("Tempo no garaxe: "+horas);
        
        if (horas<=3)
            System.out.println("Factura: "+ precios);
        else if (horas>3)
            horasExtra=horas-3;
            System.out.println("Factura: "+ (precios+(preciosExtra*horasExtra)));
        
        return precios;
    }
    
    public float Precios(){
        System.out.println("Precio de la plaza durante 3 horas: "+ precios);
        System.out.println("Precio por horas extra: "+preciosExtra);
        return precios;
    }
    
    public void Pago(){
     cartosRecibidos=Float.parseFloat(JOptionPane.showInputDialog("Introduce os cartos: "));   
        
        if (cartosRecibidos==precios)
            System.out.println("Cartos recibidos: "+cartosRecibidos);
        
        else{
            System.out.println("Cartos recibidos: "+cartosRecibidos);
            System.out.println("Cartos devoltos: "+(cartosRecibidos-(precios+(preciosExtra*horasExtra))));
        
        }
    }
}
