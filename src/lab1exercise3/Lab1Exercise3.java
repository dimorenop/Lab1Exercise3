/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercise3;

import java.util.*;

/**
 * @author Diego Moreno Pedroza
 * @author cristian chitiva
 */
public class Lab1Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de administración de tiendas");

        System.out.println("Ingrese su número de local");
        String numCasa = in.next();
        System.out.println("Ingrese su país");
        String pais = in.next();
        System.out.println("Ingrese su código postal");
        String codigoPostal = in.next();
        Address direccion = new Address(numCasa, pais, codigoPostal);
        Store tienda = new Store(direccion);

        int opcion = 0, continuar = 0;
        do {

            System.out.println("¿Desea agregar un carro?");
            System.out.println("1.Si");
            System.out.println("2.No");
            System.out.println("3.Listar carros\n");

            opcion = in.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese categoría");
                String nombreCat = in.next();
                Category categoria = new Category(nombreCat);
                System.out.println("Ingrese el número de modelo");
                String nombreMod = in.next();
                System.out.println("Ingrese el precio");
                int precio = in.nextInt();
                CarModel nuevoMod = new CarModel(categoria
