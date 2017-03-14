/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a11.p2;
import java.awt.*;
/**
 *
 * @author ivana
 */
public class ventana3 extends Frame  {
    //Atributos: 3 botones.
    private final Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    
    //Constructor
    public ventana3 (){
        super("Ventana 3");
        setLayout(new GridLayout());
        
        btn1 = new Button("boton 1");
        add (btn1); 
        
        btn2 = new Button ("boton 2");
        add (btn2);
        
        btn3= new Button ("boton 3");
        add (btn3);
        
        btn4= new Button ("boton 4");
        add (btn4);
        
        btn5= new Button ("boton 5");
        add (btn5);
        
         btn6= new Button ("boton 6");
        add (btn6);
        
         btn7= new Button ("boton 7");
        add (btn7);
        
         btn8= new Button ("boton 8");
        add (btn8);
        
         btn9= new Button ("boton 9");
        add (btn9);
        setSize(800,600);
        setVisible(true);
    
    }
}

