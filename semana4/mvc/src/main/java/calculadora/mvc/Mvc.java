
package calculadora.mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Mvc {

    public static void main(String[] args) {
      Modelo mod = new Modelo();
      Vista vis = new Vista();
      Controlador ctrl = new Controlador(vis, mod);
      ctrl.iniciar();
      vis.setVisible(true);
    }
}  
      