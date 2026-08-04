/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorCalculadora;

/**
 *
 * @author mr117
 */
public class controladorBotones {
    
    public String agregarNumero(String texto, String numero){
        texto = texto + numero;
        return texto;
    }
    public String agregarPunto(String texto){
        if (!texto.contains("")){
            return texto;
            
        }
        if (texto.length()==0){
            texto = "0";
        }
        texto = texto + ".";
        return texto;
    }
        public String cambiarSigno(String texto) {

        if (texto.length() == 0) {
            return texto;
        }
        if (texto.charAt(0) == '-') {
            texto = texto.substring(1);
        } else {
            texto = "-" + texto;
        }
        return texto;
    }
    public String borrarUltimo(String texto) {
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
        }
        return texto;
    }
    public String limpiarActual() {
        return "";
    }
    public String reiniciar() {
        return "";
    }
}
