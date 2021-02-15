/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
    
/**
 *
 * @author victorjoab
 */
@SessionScoped
@Named("operar")
public class OperarNumeros implements Serializable{
    private String numero1, numero2;
    private int resultado;
    private int num1, num2;

    public OperarNumeros() {
    }
    
    
    
    private void convertirNumeros (){
        try {
            num1 = Integer.parseInt(numero1);
            num2 = Integer.parseInt(numero2);
        } catch (NumberFormatException e) {
        
        }
    }
    
    public String suma(){
        convertirNumeros();
        resultado =  num1 + num2;
        return "resultadoPage";
    }
     
    public String resta(){
        convertirNumeros();
        resultado =  num1-num2;
        return "resultadoPage";
    }
      
    public String multiplicacion(){
        convertirNumeros();
        resultado =  num1 * num2;
        return "resultadoPage";
    }
    
    public String division(){
        convertirNumeros();
        resultado =  (num1/num2);
        return "resultadoPage";
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }


    @Override
    public String toString() {
        return  " " + resultado;
    }
    
    

}
