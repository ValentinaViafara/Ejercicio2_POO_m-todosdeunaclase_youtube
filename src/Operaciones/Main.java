/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author danie
 */
public class Main {
    public static void main(String []arg){
        
        //CREACION DE OBJETO
        Operacion op1=new Operacion();
        
        op1.num1=20;
        op1.num2=10;
        
        op1.sumar();
        op1.resta();
        op1.multiplicacion();
        op1.division();
        op1.mostrarResultado();
        
        
    }
}
