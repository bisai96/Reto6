/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto6;


import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        boolean esValido;

        System.out.println("Cantidad de nombres a ingresar: ");
        cantidad = entrada.nextInt();
        String [] nombres = new String [cantidad];
        String[][] mayor = new String[4][2];
        String[][] temp = new String [4][2];
        String[][] datos = {{"Chocolate","111","483","471","427"},{"Vainilla","192","500","355","158"},{"Fresa","289","470","474","160"},{"Oreo","415","114","161","308"}};
        String[] trimestre = new String[4];
        String saborvendido = "";

        trimestre[0] = "Ene-Feb-Mar";
        trimestre[1] = "Abr-May-Jun";
        trimestre[2] = "Jul-Ago-Sep";
        trimestre[3] = "Oct-Nov-Dic";

        for(int i = 1; i < 5; i++){

            for(int a = 0; a < 4; a++){
                temp[a][0] = datos[a][0];
                temp[a][1] = datos[a][i];
            }
             mayor = orden(temp);
            saborvendido = mayor[3][0];
            System.out.println("En el trimestre " + trimestre[i-1] + " se ha vendido más el sabor " + saborvendido);
        }
    }
    void PrimerMetodoArregloU(int a []){
    }
    void SegundoMetodoArregloM(int b []){
    }
    public static String[][] orden(String[][] matriz){
        String[] temp = new String[2];
        for(int i = 0;i < 4;i++){
            for (int j = 0 ; j < 3; j++){
                if (Integer.parseInt(matriz[j][1]) > Integer.parseInt(matriz[j+1][1])){

                    temp = matriz[j];
                    matriz[j] = matriz[j+1];
                    matriz[j+1] = temp;
                }
            } 
        }
        return matriz;
    }  


 
}
