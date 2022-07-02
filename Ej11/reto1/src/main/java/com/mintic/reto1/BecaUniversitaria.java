
package com.mintic.reto1;

import javax.lang.model.util.ElementScanner6;
import javax.xml.crypto.dom.DOMURIReference;

public class BecaUniversitaria {
  //atributos
  private int tiempo;
  private double monto;
  private double interes;
  //private double interesCompuesto;
  //private double interesSimple;      
    
  //Constructor
   public BecaUniversitaria()
   {
    tiempo = 0;
    monto = 0;
    interes = 0;

   }

   public BecaUniversitaria(int pTiempo, double pMonto, double pInteres)
   {
      this.tiempo = pTiempo;
      this.monto = pMonto;
      this.interes = pInteres;
   }  

    
  //metodos
  public double calcularInteresSimple()
  {
    double interesSimple;
    interesSimple = monto * (interes/100) * tiempo; 
    return interesSimple; 
  }

  public double calcularInteresCompuesto()
  {
    double interesCompuesto;
    interesCompuesto = Math.round( monto*(Math.pow(1+(interes/100),tiempo)-1));
    return interesCompuesto;
  }


  public String compararInversion(int pTiempo, double pMonto, double pInteres)
  {
    double diferencia=0;
    String cadena;
    
    this.tiempo = pTiempo;
    this.monto = pMonto;
    this.interes = pInteres;

    cadena = "La diferencia entre la proyección de interés compuesto e interés simple es: $";  
    diferencia = Math.round(calcularInteresCompuesto()  - calcularInteresSimple());
    
    if (diferencia==0)
    {
      return " No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";        
    }

    else
    {
     return cadena+diferencia;
    }
  }

  public String compararInversion()
  {
    double diferencia=0;
    String cadena;
    
    cadena = "La diferencia entre la proyección de interés compuesto e interés simple es: $";  
    diferencia = Math.round(calcularInteresCompuesto()  - calcularInteresSimple());
    
    if (diferencia==0)
    {
      return " No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";        
    }

    else
    {
     return cadena+diferencia;
    }
  }
    
}
