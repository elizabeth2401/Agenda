// Ing.en Sistemas Computacionales 4A
// Sedano Acosta Martha Elizabeth   19290949
// Barajas Cervantes Luis Enrique   19290975
import javax.swing.*;
import java.awt.*;

public class JFrameDatos extends JFrame
{
   PanelDatosA pdA = new PanelDatosA();
      public JFrameDatos()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pdA);
      setVisible(true);
   }   
}