/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.vector;

import practica1.util.Termino;

/**
 *
 * @author cami0
 */

public class PolinomioVectorF2 {

    private Termino[] terminos;

    /**
     * Constructor para el polinomio
     *
     * @param terminos arreglo de terminos del polinomios
     */
    public void PolinomioVectorF2(Termino[] terminos) {
        this.terminos = terminos;
    }

    public void PolinomioVectorF2() {
        terminos = null;
    }

    /**
     * Obtener el grado del polinomio
     *
     * @return grado del polinomio
     */
    public int getGrado() {
        return terminos[0].getE();
    }
    
    /**
     * Obtiene el coeficiente de un termino dado un exponente
     *
     * @param exponente
     * @return
     */
    public double getCoeficiente(int exponente) {
        double coeficiente = 0;
        for (Termino t : terminos) {
            if (t.getE() == exponente) {
                return t.getC();
            }
        }
        return coeficiente;
    }
    
    /**
     * Obtener el arreglo de terminos del polinomio
     *
     * @return
     */
    public Termino[] getTerminos() {
        return terminos;
    }

    /**
     * Cantidad de terminos diferentes de coeficiente 0 en el polinomio
     *
     * @return
     */
    public int getDiferentesCero() {
        return this.terminos.length;
    }
     //Metodo que convierte un polinomio vector forma 2 en un String
    @Override
    public String toString(){
        StringBuilder polinomio = new StringBuilder();
        if(terminos == null){
            return "0";
        }
        for(Termino ti : terminos){
            double c = ti.getC();
            int e = ti.getE();
            if(c >= 0){
                polinomio.append("+");
            } else {
                polinomio.append("-");
            }
            polinomio.append(c).append("X^").append(e).append(" ");
        }
        //FALTA QUITARLE EL SIGNO AL PRIMER TÉRMINO CUANDO ES POSITIVO
        return polinomio.toString();
    }

    //Metodo que convierte un polinomio que esta en String en un polinomio vector forma 2
    public Termino[] toArray(){
        //FALTA HACERLO
        return terminos;
    }

}

