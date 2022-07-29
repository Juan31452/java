package Visual;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Padre extends JFrame {

    public Padre() {
        setBounds(100, 100, 500, 500);//pocision y tamaño ventana
        //setSize(500, 500);//tamaño ventana
        setTitle("Principal");//titulo
        //setLocation(100, 100);//pocision
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar ventana
        iniciarComponentes();
    }

    private void iniciarComponentes()
    {
        JPanel panel = new JPanel();//Crear
        panel.setLayout(null);//desactivar layout
        panel.setBackground(Color.CYAN);//Color
        this.getContentPane().add(panel);//agregar
        
        JLabel etiqueta = new JLabel();
        JLabel etiqueta1 = new JLabel();
        JButton btnAdicionar = new JButton();
        
        etiqueta.setBounds(230, 10, 80, 50);
        etiqueta.setText("Titulo");
        
        etiqueta1.setBounds(20, 50, 80, 50);
        etiqueta1.setText("Campo1");
        
        btnAdicionar.setBounds(50, 400, 130, 30);
        btnAdicionar.setText("Adicionar");
        
        panel.add(etiqueta);//agregar
        panel.add(etiqueta1);//agregar
        panel.add(btnAdicionar);//agregar
        
    }        
    
}
