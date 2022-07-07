package ejemplossemana2.Interfaz;

public class Val {
    public static void main(String[] args) {
        EleProceso p = new EleProceso();
        for (int i=0;i<3;i++){
            System.out.println("Siguiente valor es: "+p.getSiguiente());
            System.out.println("El valor anterior a " + p.getSiguiente() + " es " + p.getAnterior());
        }
            

        System.out.println("\nReiniciando");
        p.reiniciar();
        for (int i=0;i<3;i++){
            System.out.println("Siguiente valor es: "+p.getSiguiente());
            System.out.println("El valor anterior a " + p.getSiguiente() + " es " + p.getAnterior());
            System.out.println("\nIniciando en 100");
        }
            
            
        p.setComenzar(100);
        for (int i=0;i<3;i++){
            System.out.println("Siguiente valor es: "+p.getSiguiente());
            System.out.println("El valor anterior a " + p.getSiguiente() + " es " + p.getAnterior());
        }
            
        
    }
}
