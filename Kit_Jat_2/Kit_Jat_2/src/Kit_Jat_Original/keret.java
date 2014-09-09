package Kit_Jat_Original;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class keret
extends JFrame
implements ActionListener
{
private static final long serialVersionUID = 1L;
int random = new Random().nextInt(10) + 1;
int próba = 0;
double build = 0.04D;
JTextField textField = new JTextField(10);
JButton button = new JButton("Tippelés");
JButton button1 = new JButton("Újrakezdés");
JLabel label = new JLabel(this.próba + " próbálkozás");

public keret()
{
  setDefaultCloseOperation(3);
  setLayout(new FlowLayout());
  add(this.textField);
  add(this.button);
  add(this.button1);
  this.button.addActionListener(this);
  this.button1.addActionListener(this);
  pack();
  setVisible(true);
  setTitle("Kitalálós Játék   Ver. Alpha " + this.build);
  setSize(350, 80);
  this.button1.setEnabled(false);
  setLocationRelativeTo(null);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == this.button1)
    {
        new keret();
      this.dispose();
    }
    String szöveg = this.textField.getText();
    if (szöveg.equals("2014"))
    {
      this.textField.setText("A szám: " + this.random);
    }
    else if (szöveg.equals("F.N.A"))
    {
      this.textField.setText("HACKED BY F.N.A");
    }
    else if (szöveg.equals("19970616"))
    {
      this.textField.setText("HAHAHAH! NO !");
    }
    else if (Integer.parseInt(szöveg) < 0)
    {
      this.textField.setText("Rossz szám!");
      this.button.setEnabled(false);
      this.button1.setEnabled(true);
      this.textField.setEnabled(false);
    }
    else if (Integer.parseInt(szöveg) > 10)
    {
      this.textField.setText("Rossz szám!");
      this.button.setEnabled(false);
      this.button1.setEnabled(true);
      this.textField.setEnabled(false);
    }
    else if (Integer.parseInt(szöveg) == this.random)
    {
      this.button.setEnabled(false);
      this.button1.setEnabled(true);
      this.textField.setText("Talált!");
      this.textField.setEnabled(false);
    }
    else
    {
      this.button.setEnabled(false);
      this.textField.setText("Helytelen!");
      this.textField.setEnabled(false);
      this.button1.setEnabled(true);
    }
  }
}
