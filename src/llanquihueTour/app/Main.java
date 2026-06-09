package llanquihueTour.app;

import llanquihueTour.exception.ValidacionExcepcion;
import llanquihueTour.model.Direccion;
import llanquihueTour.model.Colaborador;
import llanquihueTour.model.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA LLANQUIHUE TOUR ---");

        try {
            // 1. Cliente
            Direccion dir1 = new Direccion("Costanera", 890, "Frutillar");
            Persona cliente = new Persona("20.254.258-7", "María Vega", "mariavega@gmail.com", dir1);

            // 2.- Colaborador (guía)
            Direccion dir2 = new Direccion("Av. Vicente Rosales", 450, "Llanquihue");
            Colaborador guia = new Colaborador("20.450.850-9", "Roberto Concha", "robertoconcha@gmail.com", dir2, "guia turistico", "Paseos Lacustres");

            // 3.- Colaborador (operador)
            Direccion dir3 = new Direccion("San Martin", 120, "Puerto Varas");
            Colaborador operador = new Colaborador("15.460.807-9", "Jose Rojo", "joserojo@gmail.com", dir3, "operador local", "rutas gastronomicas");

            //Resultados

            System.out.println("\n Registros exitosos: ");
            System.out.println(cliente.toString());
            System.out.println(guia.toString());
            System.out.println(operador.toString());

        } catch (ValidacionExcepcion e) {
            System.out.println("\n ERROR DETECTADO POR EL SISTEMA: " + e.getMessage());
            e.printStackTrace();

        }
    }
}




