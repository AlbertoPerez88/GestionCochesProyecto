/*
PROPIEDADES VEHICULO:
- matricula -> String
- marca -> String
- modelo -> String
- color -> String
- tafifa -> double
- disponible -> boolean
GETTER y SETTER
CLASE PRINCIPAL -> TEST -> Instanciar un par de objetos y mostrarlos por pantalla
*/  
package test;

/**
 *
 * @author Alumno Mañana
 */
public class test {
    
    public static void main(String[] args) {
        //instancio un primer coche usando el constructor de matricula
        Vehiculo coche1 = new Vehiculo("1722GLT");
        //IMPRIMO EL OBJETO
        System.out.println(coche1);
        //INSTANCIO UN SEGUNDO COCHE CON TODAS LAS PROPIEDADES
        Vehiculo coche2 = new Vehiculo("4324DCB","Opel","Astra","Azul metro",20.00,true);
        System.out.println(coche2);
    }
}
