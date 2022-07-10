package reto;

public class PrecioTotal 
{
  private Double totalComputadores = 0.0;
  private Double totalComputadoresPortatiles = 0.0;
  private Double totalComputadoresMesa = 0.0;
  private Computadores[] listaComputadores;

  // Constructor
  PrecioTotal(Computadores[] pComputadores) 
  {
    this.listaComputadores = pComputadores;
  }

  public void mostrarTotales() 
  {
    // Código
    for (int k = 0;k<listaComputadores.length; k++)
    {
      if(listaComputadores[k]instanceof Computadores)
      {
        totalComputadores+=listaComputadores[k].calcularPrecio();
      } 

      if(listaComputadores[k]instanceof ComputadoresMesa)
      {
         totalComputadoresMesa+=listaComputadores[k].calcularPrecio();
      } 
     
      if(listaComputadores[k]instanceof ComputadoresPortatiles)
      {
        totalComputadoresPortatiles+=listaComputadores[k].calcularPrecio();
      } 
    }

   // Mostramos los resultados
   System.out.println("La suma del precio de los computadores es de " + totalComputadores);
   System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
   System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
  }
}
