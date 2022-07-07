

package com.mintic.reto1;

/**
 *
 * @author juank
 */
public class Reto1 {

    public static void main(String[] args) {
        // BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        // System.out.println(becaUniversitaria.calcularInteresSimple());
        // System.out.println(becaUniversitaria.calcularInteresCompuesto());
        // System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
        
         BecaUniversitaria becaUniversitaria1 = new BecaUniversitaria(48,10000,2.0);
         System.out.println(becaUniversitaria1.calcularInteresSimple());
         System.out.println(becaUniversitaria1.calcularInteresCompuesto());
         System.out.println(becaUniversitaria1.compararInversion());

        // BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria();
        // System.out.println(becaUniversitaria2.calcularInteresSimple());
        // System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        // System.out.println(becaUniversitaria2.compararInversion());

    }
}
