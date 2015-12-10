
package boltein12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Garaxe {
    public int numeroCoches;
    public String matricula;
    
    public int Plazas(){
        numeroCoches= Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de coches"));
        int numMaximo = 5;
        if (numeroCoches<numMaximo)
            System.out.println("PLAZAS DISPOÑIBLES");
        else if (numeroCoches==numMaximo)
            System.out.println("COMPLETO");
        
        return numeroCoches;
    }
    public String Matricula(){
        matricula= JOptionPane.showInputDialog("Introduzca la matricula:");
        System.out.println("Su matricula es: "+matricula);
        return matricula;
    }
}
