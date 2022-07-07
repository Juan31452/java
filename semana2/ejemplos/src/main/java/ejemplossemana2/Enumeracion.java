package ejemplossemana2;
/*
 * objeto tipo de enumeración solo puede contener 
 * los valores definidos por la lista, brinda una manera 
 * de definir con precisión un nuevo tipo de datos con
 *  número fijo de valores válidos
 */
enum Transporte{
    AUTO, CAMION, AVION, TREN, BARCO;
}
public class Enumeracion {
    public static void main(String[] args) {
        Transporte tp;
        //tp puede tomar los elementos que estan en Transporte
        tp=Transporte.AVION;
        System.out.println("Valor de tp: "+tp);

         //enum para controlar sentencia switch
        switch(tp){
            case AUTO:
                System.out.println("Un auto lleva personas.");
                break;
            case CAMION:
                System.out.println("Un camión lleva carga.");
                break;
            case AVION:
                System.out.println("Un avión vuela.");
                break;
            case TREN:
                System.out.println("Un tren corre sobre rieles.");
                 break;
            case BARCO:
                System.out.println("Un barco navega en el agua.");
                break;
        }
    }
    
}
