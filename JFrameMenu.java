// Ing.en Sistemas Computacionales 4A
// Sedano Acosta Martha Elizabeth   19290949
// Barajas Cervantes Luis Enrique   19290975
import javax.swing.*;
import java.awt.*;

public class JFrameMenu extends JFrame{
   Menu menu= new Menu();
   public JFrameMenu(){
      initComponents();
   }
   private void initComponents(){
      setSize(200,200);
      setTitle("MENU");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(menu);
      setVisible(true);
   }
} 