/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportes;

/**
 *
 * @author Admin
 */
public class Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un vehiculo terrestre
        
        VehiculoTerrestre vehiculoTerrestre = new VehiculoTerrestre("Chevrolet","Camaro",4);
        
        VehiculoAcuatico vehiculoAcuatico = new VehiculoAcuatico("Lancha","Yamaha","Motor");
        
        //Mostrar informacion de los vehiculos
        System.out.println("Informacion del vehiculo Terrestre");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo();
        
    }
    
}
