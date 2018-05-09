/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.p2;

/**
 *
 * @author Ignacio
 */
public class rectangulo {
    public void rec(int ll, int lc){
        double per = ( 2 * ll) + ( 2 * lc );
        double area = ( lc * ll );
        System.out.println("El perimetro es: " + per + " El area es: " + area);
    }
}
