// Ing.en Sistemas Computacionales 4A
// Sedano Acosta Martha Elizabeth   19290949
// Barajas Cervantes Luis Enrique   19290975
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class MostrarDatosA extends JPanel implements ActionListener{
   private JButton btnRegresar;
   JTable tabla;
   JScrollPane scroll = new JScrollPane();
   ManejoPersona mp = new ManejoPersona();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public MostrarDatosA(){
   
     datosPer = mp.datos();
     String titulos [] = {"Nombre", "Apellidos", "Teléfono", "Tipo","Cumpleaños", "Correo"};
     String info[][] = obtenerDatos();
     setLayout(new GridLayout(2,1));
     
     tabla = new JTable(info, titulos);
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     scroll.setViewportView(tabla);
     add(scroll);
     
     btnRegresar = new JButton("Regresar");
     btnRegresar.addActionListener(this);
     add(btnRegresar);
   }
   
   private String[][] obtenerDatos(){
   
     int x=0;
     String informacion[][] = new String[datosPer.size()][6];
     Iterator<Persona> itrPersona = datosPer.iterator();
     while(itrPersona.hasNext()){
        Persona persona = itrPersona.next();
        informacion[x][0] = persona.getNombre();
        informacion[x][1] = persona.getApellidos();
        informacion[x][2] = persona.getTelefono();
        informacion[x][3] = persona.getTipo();
        informacion[x][4] = persona.getCumple();
        informacion[x][5] = persona.getCorreo();
        x++;
     }
     return informacion;
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource()==btnRegresar) {
         JFrameMenu menu = new JFrameMenu();
      }
   }
}