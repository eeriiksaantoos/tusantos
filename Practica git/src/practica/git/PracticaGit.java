/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.git;

/**
 *
 * @author Santos
 */
public class PracticaGit {

    
    public static void main(String[] args) {
        
        int multi = multiplicacion(12 , 13);
        System.out.println(multi);
    }

    public static int multiplicacion(int a , int b){
    
    int multiplicacion = a * b; 
    return multiplicacion;

    }

    public static int suma(int a , int b){
    
    int suma = a + b; 
    return suma;
    }

}
