/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.c2.vista;

import co.edu.utp.misiontic2022.c2.controlador.CalculadoraController;
import co.edu.utp.misiontic2022.c2.controlador.Operacion;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Ana Maria
 */
public class CalculadoraDivisionGUI extends JFrame implements CalculadoraVista{
    private JTextField txtNumeroUno;
    private JTextField txtNumeroDos;
    private JTextField txtResultado;
    private JButton btnDivision;
   
    public CalculadoraDivisionGUI() {
        initUI();
    }

    private void initUI() {
        setTitle("Aplicación MVC para Division");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));

        txtNumeroUno = new JTextField(10);
        txtNumeroUno.setHorizontalAlignment(JTextField.TRAILING);

        txtNumeroDos = new JTextField(10);
        txtNumeroDos.setHorizontalAlignment(JTextField.TRAILING);

        txtResultado = new JTextField(10);
        txtResultado.setHorizontalAlignment(JTextField.TRAILING);
        txtResultado.setEditable(false);

        btnDivision = new JButton("Division");
        
        var panel = new JPanel();
        panel.add(new JLabel("Numero 1:"));
        panel.add(txtNumeroUno);
        getContentPane().add(panel);

        panel = new JPanel();
        panel.add(new JLabel("Numero 2:"));
        panel.add(txtNumeroDos);
        getContentPane().add(panel);

        panel = new JPanel();
        panel.add(btnDivision);
        panel.add(txtResultado);
        getContentPane().add(panel);

        setSize(350, 150);
        setLocationRelativeTo(null);
    }

    @Override
    public String getNumeroUno() {
        return txtNumeroUno.getText();
    }

    @Override
    public String getNumeroDos() {
        return txtNumeroDos.getText();
    }

    @Override
    public void setResultado(String resultado) {
        txtResultado.setText(resultado);
    }

    @Override
    public void iniciar(CalculadoraController controller) {
        controller.setOperacion(Operacion.DIVISION);

        btnDivision.addActionListener(controller);

        setVisible(true);

    }

    @Override
    public void mostrarExcepcion(Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Division MVC-GUI", JOptionPane.ERROR_MESSAGE);
    }

    
}
