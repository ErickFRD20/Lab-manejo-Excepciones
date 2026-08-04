/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorCalculadora;

/**
 *
 * @author Student
 */
public class controladorCalculadora {
    private double valor1;
    private double valor2;
    private String operacion;
    private boolean operacionElegida;
    private boolean esperarValor2;
    private boolean resultadoMostrado;
    
    public controladorCalculadora(){
        valor1=0;
        valor2=0;
        operacion="";
        
        operacionElegida=false;
        esperarValor2=false;
        resultadoMostrado=false;
    }
    
    private boolean operacionValida(String operacionNueva){
        if (operacionNueva.equals("+")) {
            return true;
        }
        if(operacionNueva.equals("-")){
            return true;
        }
        if (operacionNueva.equals("*")) {
            return true;
        }
        if (operacionNueva.equals("/")) {
            return true;
        }
        return false;
    }
}
