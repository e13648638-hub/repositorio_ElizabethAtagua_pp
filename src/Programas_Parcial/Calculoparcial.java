/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas_Parcial;
import java.util.Scanner;

/**
 * @author Elizabeth */
public class Calculoparcial {
public static void main(String[] args) {

        String empleado;
        double horas, thora, sbruto, descuento, sneto;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese Nombre del Empleado: ");
        empleado = lectura.nextLine();
        System.out.print("Ingrese Horas Trabajadas: ");
        horas = lectura.nextDouble();
        System.out.print("Ingrese Tarifa por Hora: ");
        thora = lectura.nextDouble();
        sbruto = horas * thora;
        descuento = sbruto * 0.13;
        sneto = sbruto - descuento;
        System.out.println("El sueldo bruto es: " + sbruto);
        System.out.println("Descuento total es: " + descuento);
        System.out.println("El sueldo neto es: " + sneto);
        
        // Actualización del programa
        System.out.print("Examen parcial concluido");
    }
}
