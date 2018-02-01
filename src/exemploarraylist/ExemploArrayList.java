/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class ExemploArrayList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // declaramos o arraylist de exemplo
        ArrayList lista=new ArrayList(); 
        // este arraylist e de tipo object , polo que podemos meterlle calquer tipo de valor
       Metodos met=new Metodos();
//        lista.add(1);
//        lista.add("aaaa");
//        lista.add(1.6);
//        lista.add('a');
//        // visualizamos os elementos da lista un a un con un for
//        for(int i=0;i<lista.size();i++){
//            System.out.println(lista.get(i));
//        }
        
        //imos facer un array de numeros indicando o tipo de obxetos que conten 
        ArrayList <Integer> listanum=new ArrayList();
          ArrayList <Integer> pares=new ArrayList(); // creamos un segundo array para o metodo de numero pares 
          // insertamos datos no array
        listanum.add(1);
        listanum.add(new Integer(3));
         listanum.add(8);
          listanum.add(10);
           listanum.add(7);
            listanum.add(6);
             listanum.add(0);
             
        // se intentamos meter un tipo de dato distinto de integer co metodo add nos dara erro 
        
        // creamos un menu para selecionar a opcion desexada
         boolean sair=true; // boolenao para poder sair do switch e asi facelo repetitivo
         while(sair==true){
        int op=Integer.parseInt(JOptionPane.showInputDialog(" \n 1 se quere engadir elemento \n 2 se quere amosar elemento \n "
                + "3 se quere borrar un elemento segundo a sua posicion \n 4 se quere borrar un elemento segundo o seu contido \n 5"
                + " se quere modificar o elemento segundo a posicion \n 6 se queres modificar o elemento segundo o seu valor \n"
                + " 7 se queres mostralo ordenado de maior a menor \n"
                + "8 para separar os numeros pares do array \n"
                + "0 para finalizar o programa"));
        // variables para poder levar a cabo distintos case
        int op2=0;
        String op3;
        int op4;
       
       
            switch(op)
            { 
                case 0: // case sair do bucle
                    sair=false;
                break;
                case 1: // case engadir elemento a listanum
                    met.engadirElemento(listanum);
                break;
                case 2: // case para amosar listanum
                    met.amosar(listanum);
                break; // case para borrar segundo a posicion
                case 3:
                    op2=Integer.parseInt(JOptionPane.showInputDialog("inserte a posicion a eliminar"));
                    met.borrarPosicion(listanum,op2);
                break;
                case 4: // case para borrar elemento segun contido
                    op3=JOptionPane.showInputDialog("inserte o valor do elemento que desexa eliminar");
                    met.borrarElemento(listanum,op3);
                 break;
                case 5: // case para modificar elemento segundo a sua posicion 
                    op2=Integer.parseInt(JOptionPane.showInputDialog("inserte a posicion a modificar"));
                    op4=Integer.parseInt(JOptionPane.showInputDialog("inserte o valor do elemento que desexa modificar"));
                    met.modificarValorPosicion(listanum,op2,op4);
                 break;
                case 6: // case para modificar elemento segundo o seu valor 
                    op2=Integer.parseInt(JOptionPane.showInputDialog("inserte o valor do elemento que desexa modificar"));
                    op4=Integer.parseInt(JOptionPane.showInputDialog("inserte o valor novo do elemento que desexa modificar"));
                    met.modificarValorValor(listanum,op2,op4);
                 break;
                case 7: // case para mostrar o maior e o menor dos numeros da lista 
                    met.mostrarMaiorMenor(listanum);
                break;
                case 8: // case para almacenar os numeros pares nun array distinto e amosar ese array novo 
                    met.almacenarPares(listanum,pares);
                    met.amosar(pares);
                break;
                default:
                    System.out.println("numero non valido");// canto a opcion insertada non e valida 
            }
            }
        
}
        
    
    
}
