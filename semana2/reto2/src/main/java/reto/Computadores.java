package reto;

public class Computadores 
{
  // Variables base
  protected final static char CONSUMO_W = 'F';
  protected final static Double PRECIO_BASE = 100.0;
  protected final static Integer PESO_BASE =  5;
  // Variables
  protected Integer peso;
  protected char consumoW;
  protected Double precioBase;
 
  // Constructores 
  public Computadores() 
  {
    this.peso = PESO_BASE;
    this.precioBase= PRECIO_BASE;
    this.consumoW = CONSUMO_W;
  }
  
  public Computadores(Double precioBase, Integer peso) 
  {
    this.precioBase = precioBase;
    this.peso = peso; 
    this.consumoW = CONSUMO_W;
  }

  public Computadores(Double precioBase, Integer peso, char consumoW) 
  {
    this.precioBase = precioBase;
    this.peso = peso; 
    this.consumoW = consumoW;
  }


public Double calcularPrecio() 
  {
    Double adicion = 0.0;
    Double total = 0.0;
    //  Consumo
    switch(consumoW)
    {
      case 'A':
        adicion+=100.0;
        break;
      case 'B':
        adicion+=80.0;
        break;
      case 'C':
        adicion+=60.0;
        break;
      case 'D':
        adicion+=50.0;
        break;
      case 'E':
        adicion+=30.0;
        break;
      case 'F':
        adicion+=10.0;
        break;    
    }
    //peso
    if (peso>=0 && peso<19 ) 
    {
      adicion+=10.0;    
    } 
    else if(peso>=20 && peso<49)
    {
      adicion+=50.0;
    }
    else if(peso>=50 && peso<=79)
    {
      adicion+=80.0;
    }
    else if(peso>=80)
    {
      adicion+=100.0;
   }
   total = precioBase + adicion;
   return total;
  }
   
  //getter

  public Integer getPeso() {
    return peso;
  }

  public char getConsumoW() {
    return consumoW;
  }

  public Double getPrecioBase() {
    return precioBase;
  }

}
