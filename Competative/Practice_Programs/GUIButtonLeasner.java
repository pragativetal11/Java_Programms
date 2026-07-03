import java.awt.event.*;
import javax.swing.*;

class GUIButtonLeasner 
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous PPA");
        JButton bobj = new JButton("OK");

        bobj.setBounds(100,100,150,50);

        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.print("Button Clicked");
            }
        });
        fobj.add(bobj);

        fobj.setSize(400,300);

        fobj.setLayout(null);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //leasner
    }
}