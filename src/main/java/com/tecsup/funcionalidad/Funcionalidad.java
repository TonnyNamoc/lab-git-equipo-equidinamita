package com.tecsup.funcionalidad;

public class Funcionalidad {
    public static String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        String saludo = saludar("Juan");
        System.out.println(saludo);
    }
}
