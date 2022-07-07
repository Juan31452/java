package ejemplossemana2;

public class Operacion {
    private double b;
    private int e;
    private double valor;
     /*En Java puede pasar que el nombre de un parámetro o una
        variable local sea el mismo que el nombre de una variable
        de instancia, cuando esto sucede, el nombre local oculta
        la variable de instancia. Puede obtener acceso a la 
        variable de instancia oculta haciendo referencia a ella 
        a través de this. */
        public Operacion()
        {

        }
    public Operacion(double b, int e) {
        this.b = b;
        this.e = e;
        valor = 0;
    }
    public double proces(){
        if (e >= 0){
            valor = valor +b+e;
        } else{
            valor = valor +(e* Math.pow(b,e));
        }
        return valor;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

   public double getValor() {
        return valor;
    }


public static void main(String[] args) {
    Operacion nuevaOpe = new Operacion(4.0, 5);
        //Obtengo el valor 
    //Debo primero hacer process
    System.out.println(nuevaOpe.proces());
    //despues mirar el valor, si no es asi me da cero
    System.out.println(nuevaOpe.getValor());
    Operacion nuevaOpe1 = new Operacion();
    nuevaOpe1.setE(20);
    System.out.println(nuevaOpe1.getE());
    nuevaOpe1.setB(10);
    System.out.println(nuevaOpe1.getB());
    System.out.println(nuevaOpe1.proces());
    System.out.println(nuevaOpe1.getValor());
   }

    
}
