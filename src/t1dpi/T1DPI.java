/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1dpi;

import javax.swing.JOptionPane;

/**
 *
 * @author alexb
 */
public class T1DPI {
    
    private static frmformulario formulario;
    private static Personas persona[];
    private static int contador;
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        formulario = new frmformulario();
        persona = new Personas[50];
        
        for (int i = 0; i < 50; i++){
            persona[i] = new Personas();
        }
        
        contador = 0;
        
        formulario.setVisible(true);
    }
    
    public static void guardar(String d, String n, String a, int edad){
        persona[contador].setDPI(d);
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setEdad(edad);
        
        contador++;
    }
    
    public static void buscar(String bus){
        
        for (int j = 0; j < persona.length; j++){
            
            if(persona[j].getDPI().equals(bus)){
                formulario.cargardatos(persona[j]);
            }else
            {
                JOptionPane.showMessageDialog(formulario, "No encontrado");
          
            }
            
        }
        
    }
    
}
