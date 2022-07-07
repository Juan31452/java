package ejemplossemana2.Interfaz;

public class EleProceso implements Proceso {
   // implements Proceso ya que es clase miembro de proceso
    int iniciar;
    int valor;
    int anterior;

    EleProceso(){
        iniciar=0;
        valor=0;
    }

    public int getSiguiente() {
        anterior=valor;
        valor+=2;
        return valor;
    }

    public void reiniciar() {
        valor=iniciar;
        anterior=valor-2;
    }

    public void setComenzar(int x) {
        iniciar=x;
        valor=x;
        anterior=x-2;
    }

    //Añadiendo un método que no está definido en Proceso
    int getAnterior(){
        return anterior;
    }
}
