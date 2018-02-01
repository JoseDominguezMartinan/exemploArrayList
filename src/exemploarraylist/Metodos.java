/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class Metodos
        
{
    public static int numMaior; // declaramos duas variables estaticas para poder utilizar no main o numero maior e menor como se pide no exercicio
    public static int numMenor;
   public void engadirElemento(ArrayList <Integer>lis)
   {
     
     lis.add(Integer.parseInt(JOptionPane.showInputDialog("numero que queres engadir"))); // engadimos este valor que estamos a pedir na lista do metodo 
       
   }
   public void amosar(ArrayList<Integer>lis) // metodo para amosar os elementos do arrayList
   {
    
       Iterator it=lis.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }
   }
   public void borrarPosicion(ArrayList<Integer>lis,int pos){ // metodo para borrar un elemento segundo a sua posicion
       lis.remove(pos);
       System.out.println(lis);
   }
   public void borrarElemento(ArrayList<Integer>lis,String valor){ // metodo para borrar un elemento segundo o seu valor 
       lis.remove(new Integer(valor));
       System.out.println(lis);
      }
   public void modificarValorPosicion(ArrayList<Integer>lis,int posicion,int valor){ // metodo para modificar o valor dun elemento da lista segundo a sua posicion 
       lis.set(posicion,valor);
       System.out.println(lis);
   }
   public void modificarValorValor(ArrayList<Integer>lis,int valorAntigo,int valorNovo){// metodo para modificar o valor dun elemento da lista segundo o seu valor
       int posicion=lis.lastIndexOf(valorAntigo);
       lis.set(posicion,valorNovo);
       System.out.println(lis);
       
   }
   public void mostrarMaiorMenor(ArrayList<Integer>lis){ // recoller no main o numero maior e o numero menor, para iso temos duas variables estaticas nas que metemos o valor  
       Collections.sort(lis); // ordena a nosa lista de menor a maior
       numMenor=lis.get(0); // obtemos o primeiro da lista e o metemos na variable
       numMaior=lis.get(lis.size()-1); // obtemos o ultimo e o metemos na variable 
       System.out.println(numMenor+" "+numMaior);
   }
   public void almacenarPares(ArrayList<Integer>lis,ArrayList <Integer> pares){ // metodo para recoller os valores pares do array e metelos noutro array distinto 
       for(int i=0;i<lis.size();i++){ // recorremos con un bucle todas as posicions do array 
           if((lis.get(i) % 2) == 0){ // se o modulo da division entre dous e igual a cero, tratase dun numero par
              pares.add(lis.get(i));  // añadimos este numero par ao novo array
           }
           
       }
   }
   
   
   }

