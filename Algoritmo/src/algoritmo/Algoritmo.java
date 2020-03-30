/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS X441U
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        ArrayList <String> listanombre  = new ArrayList <String>();
        ArrayList <String> informe_temperatura = new ArrayList <String>();
        ArrayList informefamilia= new ArrayList <String>();
        int temperatura;
        System.out.println("Desea agregar los datos de un integrante de la familia? Si--No");
        String pregunta;
        pregunta = entrada.nextLine();
        
        while("Si".equals(pregunta) || "si".equals(pregunta)){
            System.out.println("Nombre del integrante");
            String nombre;
            nombre=entrada.nextLine();
            listanombre.add(nombre);//
            informe_temperatura.add(nombre);
            informefamilia.add(nombre);//
            System.out.println("Ingrese parentesco");
            String parentesco;
            parentesco=entrada.nextLine();
            informefamilia.add(parentesco);//agregar parentesco
            System.out.println("Edad del integrante");
            int edad;
            String pregunta_temperatura;
            edad=entrada.nextInt();
            entrada.nextLine();
            informefamilia.add(String.valueOf(edad));//agregar edad
            System.out.println("Escriba la temperatura del integrante");
            temperatura=entrada.nextInt();
            entrada.nextLine();
            
            informe_temperatura.add(String.valueOf(temperatura));
            
            System.out.println("Quiere seleccionar una persona ingresada para agregarle otro valor de temperatura? (Si..No");
            pregunta_temperatura= entrada.nextLine();
            while("si".equals(pregunta_temperatura)||"Si".equals(pregunta_temperatura)){
                
                System.out.println("nombre del integrante");
                String escogernombre;
                escogernombre=entrada.nextLine();
                if (listanombre.contains(escogernombre))
                {
                    System.out.println("Ingrese la temperatura");
                    temperatura=entrada.nextInt();
                    entrada.nextLine();//Debido a que el nextInt guarda la tecla enter, se inserta esta linea de codigo
                    informe_temperatura.add(escogernombre);
                    informe_temperatura.add(String.valueOf(temperatura));
                }
                else{
                     System.out.println("El nombre no ha sido escrito anteriormente");
                     System.exit(0);
                 }
                System.out.println("Quiere añadir mas temperaturas con otro integrante?  Si..No");
                pregunta_temperatura=entrada.nextLine();
            }
            System.out.println("Quiere seguir agregando los datos de un integrante de la familia? Si--No ");
            pregunta=entrada.nextLine();
        }
        System.out.println("Informe de la familia");
        /*for (int i=0;i<informefamilia.size();i++){
            System.out.println(informefamilia.get(i));
        }*/
       informefamilia.forEach((a)->System.out.println(a));
       System.out.println("\n\nInforme de cada integrante con sus distintas temperaturas");
       /*for (int i=0;i<informe_temperatura.size();i++){
            System.out.println(informe_temperatura.get(i)+" "+informe_temperatura.get(i+1));
        }*/
       informe_temperatura.forEach((a)->System.out.println(a));
       
    }
}
