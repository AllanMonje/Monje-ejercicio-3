package com.monje;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> carros = new ArrayList();
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println("1.  Registrar automovil");
            System.out.println("2.  Mostrar vehiculos");
            System.out.println("3.  Salir");
            System.out.println("Ingrese su opcion");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Especifique la marca de vehiculo");
                        System.out.println("\t1.Ford");
                        System.out.println("\t2.Toyota");
                        System.out.println("\t3. Nissan");
                        System.out.println("\t4.Honda");
                        System.out.print("Ingrese su opcion: ");
                        int marca = lector.nextInt();

                        System.out.println("Ingrese el color del vehiculo: ");
                        String color = lector.next();
                        System.out.println("Ingrese el año: ");
                        int año = lector.nextInt();
                        System.out.println("Ingrese el precio del vehiculo: ");
                        double precio = lector.nextDouble();

                        if (marca == 1) {
                            Ford carro = new Ford();
                            carro.color = color;
                            carro.año = año;
                            carro.precio = precio;
                            carros.add(carro);
                            System.out.println("Registro completo!");
                        } else if (marca == 2) {
                            Toyota carro = new Toyota();
                            carro.color = color;
                            carro.año = año;
                            carro.precio = precio;
                            carros.add(carro);
                            System.out.println("Registro completo!");
                        } else if (marca == 3) {
                            Nissan carro = new Nissan();
                            carro.color = color;
                            carro.año = año;
                            carro.precio = precio;
                            carros.add(carro);
                            System.out.println("Registro completo!");
                        } else if (marca == 4) {
                            Honda carro = new Honda();
                            carro.color = color;
                            carro.año = año;
                            carro.precio = precio;
                            carros.add(carro);
                            System.out.println("Registro completo!");
                        } else {
                            System.out.println("NO existe esa marca");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Ingrese un digito");
                    } catch (Exception e) {
                        System.out.println("Algo salio mal, contacte al programador!");
                    }
                    break;
                case 2:
                    if (carros.isEmpty()) {
                        System.out.println("--No hay vehiculos--");
                    } else {
                        System.out.println("**Mostrando Toyota y Nissan**");
                    }

                    for (Vehiculo c : carros) {
                        String tipo ="";
                        if (c instanceof Toyota) {
                            tipo = "Marca Toyota";
                            System.out.println("Color: " + c.color + " - " + tipo);
                        }else if (c instanceof Nissan) {
                            tipo = "Marca Nissan";
                            System.out.println("Color: " + c.color + " - " + tipo);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opcion == 3) {
                break;
            }

            }
        }
    }
