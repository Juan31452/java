package ejemplossemana2;

import javax.swing.JOptionPane;
//Muestra un cuadro de dialogo.
//Permite introducir/mostrar información y se encuentra 
//en el paquete javax.swing.
public class Arreglos {
    public static void main(String[] args) {
        //declaramos un array
        //un solo [] es un vector
        //dos [][] es una matriz
        String[] Numero = new String[]{"1","2","3","4","5"};
        //Muestra los datos del array <showMessageDialog(parentComponent,Object message)
        //null utiliza el marco por defecto
        JOptionPane.showMessageDialog(null, Numero);


        int valor = 0;
        valor= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de elementos para el promedio"));

        int [] numeros = new int[valor];
        // Declaracion variable
        int suma = 0;
        double promedio;
      
        //ingresaNumero
        for (int i=0;i<valor; i++){
        numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero \n" + (i+1) + " por favor"));
        suma += numeros[i];
        }
        //operacion
        promedio=(double)suma/numeros.length;
        
        //mostrarDatos
        JOptionPane.showMessageDialog(null, promedio);

    }
}
