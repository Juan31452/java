
package ejemplos1;

public class Calculo 
{
  private int Cantidad;
  private double Valor_Unitario;

  //Constructor 
  public Calculo(int cantidad,double valoru)
  {
     this.Cantidad = cantidad;
     this.Valor_Unitario = valoru;
  }
  
  public int CalcularTotal()
  {
   int total = Cantidad*(int)Valor_Unitario; 
   return total;
  }
}
