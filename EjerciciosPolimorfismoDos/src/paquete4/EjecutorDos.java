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
        
        System.out.println("Ingrese el numero de locales a ingresar: ");
        cont = sc.nextInt();
        for (int i = 0; i < cont; i++) {
            System.out.println("Ingrese el local deseado: (1) Local Comida"
                    + " (2) Local Comercial (3) Local Sesiones");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    
                    break;
            }
            
        }
        
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
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
