// Ing.en Sistemas Computacionales 4A
// Sedano Acosta Martha Elizabeth   19290949
// Barajas Cervantes Luis Enrique   19290975
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel implements ActionListener{
   
   JButton btnAlta,btnBuscar,btnSalir,btnDatos;
   PanelDatosA si;
      
   public Menu(){
      setLayout(new GridLayout(6,1));
      btnAlta= new JButton("Dar de Alta");
      btnAlta.addActionListener(this);
      btnBuscar= new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnDatos= new JButton("Mostrar Datos");
      btnDatos.addActionListener(this);
      btnSalir= new JButton("Salir");
      btnSalir.addActionListener(this);
      add(btnAlta);
      add(btnBuscar);
      add(btnDatos);
      add(btnSalir);
   }
   public void actionPerformed(ActionEvent e){
      if (e.getSource() == btnAlta){
         JFrameDatos si= new JFrameDatos();
      }
      else
         if (e.getSource() == btnBuscar){
         //   Buscar buscar= new Buscar();
         }
         else
            if (e.getSource()== btnDatos){ 
               JFrameMostrar jfm = new JFrameMostrar(); 
            }
            else
               if (e.getSource() == btnSalir){
                  System.exit(0);
               }
   }
}