/**
 * @author DAW120
 */

package daw120.tipoenum;
public class TipoENUM {
    public static void main(String[] args) {
      
    // declaracion de variables:
        enum Sexo { CHICA, CHICO, CHIQUE }; //definir el enum fuera de la Clase(MAY)
        Sexo valor ; // definir variable (valor) que arrojará el resultado asignando..
        valor= Sexo.CHICO; // la anterior variable otorga el VALOR enum-erado antes.
      
        // Se pide el valor en la salida:
        System.out.println("\nel sexo es:  "+valor+"\n");
    }
}
