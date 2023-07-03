package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        pila mipila = new pila(10);
        int placa,movimientos,opc=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("####################################");
            System.out.println("estacionamiento");
            System.out.println("1.Ingresar Automovil.");
            System.out.println("2.Retirar Automovil.");
            System.out.println("3.Mostrar lista del Estacionamiento.");
            System.out.println("4.Terminar programa.");
            System.out.println("####################################");
            opc = in.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese la placa:");
                    placa = in.nextInt();
                    movimientos = 0;
                    mipila.apilar(placa, movimientos);
                    break;
                case 2:
                    boolean con=false;
                    int aux=0;
                    System.out.println("Ingrese placa a desapilar");
                    placa = in.nextInt();
                    aux = mipila.desapilar();
                    break;
                case 3:
                    mipila.mostrarPila();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }while(opc!=4);
    }
}
