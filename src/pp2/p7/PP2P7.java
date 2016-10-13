/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p7;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PP2P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v1, v2;
        v1 = pedirVelocidad1();
        v2 = Convertir(v1);
        Mostrar(v1, v2);
    }
    public static double pedirVelocidad1 (){
        double v1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba los kilometros por hora que quiere convertir a metros sobre segundo ");
        v1 = entrada.nextDouble();
        return v1;
    }
    public static double Convertir(double v1){
        double v2;
        v2 = v1 * 1000/3600;
        return v2;
    }
    public static void Mostrar(double v1, double v2){
        System.out.println("Los " +v1 +" kilometros por hora, equivalen a : " +v2 +" metros sobre segundo");
    }
}
