/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import Exepciones.DivisionCero;
import Exepciones.ValorInvalido;

/**
 *
 * @author josed
 */
public class Calculadora {
    
    public void ValidarNumero(double numero)
            throws ValorInvalido{
        if(Double.isNaN(numero)){
                throw new ValorInvalido("Numero Invalido");
            }
    }
    
    public double sumar(double numero1, double numero2)
            throws ValorInvalido{
        ValidarNumero(numero1);
        ValidarNumero(numero2);
        
        return numero1 + numero2;
    }
    
    public double restar(double numero1, double numero2)
            throws ValorInvalido{
        ValidarNumero(numero1);
        ValidarNumero(numero2);
        
        return numero1 - numero2;
    }
    public double multiplicar(double numero1,double numero2)
            throws ValorInvalido{
        ValidarNumero(numero1);
        ValidarNumero(numero2);
        
        return numero1 * numero2;
    }
    public double dividir(double numero1,double numero2)
    throws DivisionCero,ValorInvalido{
        ValidarNumero(numero1);
        ValidarNumero(numero2);
        
        if(numero2 == 0){
            throw new DivisionCero("imposible dividir entre 0");
        }
        return numero1 / numero2;   
    }    
   
    
    }

