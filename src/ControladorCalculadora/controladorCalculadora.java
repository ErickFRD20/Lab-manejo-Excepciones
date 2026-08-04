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
    
    public boolean seleccionarOperacion(String textoPantalla, String operacionNueva){
        if (textoPantalla==null || textoPantalla.isEmpty()) {
            return false;
        }
        
        if(operacionElegida){
            return false;
        }
        
        if(!operacionValida(operacionNueva)){
            return false;
        }
        
        try {
            valor1 = Double.parseDouble(textoPantalla);
            operacion = operacionNueva;
            operacionElegida = true;
            esperarValor2 = true;
            resultadoMostrado = false;
            return true;
        } catch (NumberFormatException error){
            return false;
        }
    }
    
    private boolean guardarValor2(String textoPantalla){

    if(!operacionElegida){
        return false;
    }

    if(textoPantalla==null || textoPantalla.isEmpty()){
        return false;
    }

    try{
        valor2 = Double.parseDouble(textoPantalla);
        return true;

    }catch (NumberFormatException error){
        return false;
    }
  }
}
