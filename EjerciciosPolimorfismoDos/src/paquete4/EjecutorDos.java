/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class EjecutorDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArrendatario;
        double cuotaB, valorAdicionalFijo, valorLuz, valorAgua, iva, valorSillas,
                valorAmplificacion;
        int cont, opc;
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();

        System.out.print("Ingrese el numero de locales a ingresar: ");
        cont = sc.nextInt();
        for (int i = 0; i < cont; i++) {
            System.out.print("\nIngrese el local deseado: (1) Local Comida"
                    + " (2) Local Comercial (3) Local Sesiones: ");
            opc = sc.nextInt();
            System.out.print("\nIngrese el nombre del arrendatario: ");
            sc.next();
            nombreArrendatario = sc.nextLine();
            System.out.print("\nIngrese la cuota base: ");
            cuotaB = sc.nextDouble();
            switch (opc) {
                case 1:
                    System.out.print("\nIngrese el valor de la luz: ");
                    valorLuz = sc.nextDouble();
                    System.out.print("\nIngrese el valor del agua: ");
                    valorAgua = sc.nextDouble();
                    System.out.print("\nIngrese el valor del IVA: ");
                    iva = sc.nextDouble();

                    ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                            nombreArrendatario, cuotaB, valorLuz, valorAgua, iva);
                    listaArriendos.add(arriendoComida);
                    break;
                case 2:
                    System.out.print("\nIngrese el valor adicional fijo: ");
                    valorAdicionalFijo = sc.nextDouble();

                    ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                            nombreArrendatario, cuotaB);
                    arriendoComercial.establecerValorAdicionalFijo(valorAdicionalFijo);
                    arriendoComercial.establecerNombreArrendatario(nombreArrendatario);
                    listaArriendos.add(arriendoComercial);
                    break;
                case 3:
                    System.out.print("\n Ingrese el valor de las sillas: ");
                    valorSillas = sc.nextDouble();
                    System.out.print("\n Ingrese el valor de la amplificacion: ");
                    valorAmplificacion = sc.nextDouble();

                    ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                            nombreArrendatario, cuotaB);
                    arriendoSesiones.establecerValorSillas(valorSillas);
                    arriendoSesiones.establecerValorAmplificacion(valorAmplificacion);
                    listaArriendos.add(arriendoSesiones);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    i--;
                    break;
            }
        }

        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }

        CentroComercial centro = new CentroComercial("La Pradera",
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);

    }
}
