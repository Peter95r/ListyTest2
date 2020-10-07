import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame f = new Ramka();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Title");
            f.setLocationByPlatform(true);
            f.pack();
            f.setVisible(true);

        });
    }
}
class Ramka extends JFrame
{

    private  JLabel label;
    private  JComboBox<String> box;
    private JPanel south;
    private int size = 16;

    public Ramka ()
    {
        label = new JLabel("Przykladowy teks.");
        label.setFont(new Font("Nazwa", Font.ITALIC,size));

        add(label, BorderLayout.CENTER);

        south = new JPanel();
        add(south, BorderLayout.SOUTH);
        box = new JComboBox<>();
        box.addItem("Serif");
        box.addItem("SanSerif");
        box.addItem("inne");
        south.add(box);

    }
}
