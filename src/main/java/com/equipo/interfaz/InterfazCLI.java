package com.equipo.interfaz;

import com.tecsup.funcionalidad.*;
import java.util.Scanner;

public class InterfazCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        
        // Llamando a la funcionalidad de saludar
        String saludo = Funcionalidad.saludar(nombre);
        System.out.println(saludo);
        
        scanner.close();
    }
}
