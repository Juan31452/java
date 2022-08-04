
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener
{
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
         this.view.btnsumar.addActionListener(this);
    }
    
 
    
    public void iniciar()
    {
        view.setTitle("Calculadora");
        view.setLocationRelativeTo(null);
    }        
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.setNum1(Integer.parseInt(view.txtnumero1.getText()));
        model.setNum2(Integer.parseInt(view.txtnumero2.getText()));
        model.sumar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
        
    }        
    
}
