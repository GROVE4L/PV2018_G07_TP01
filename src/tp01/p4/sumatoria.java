/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.p4;

/**
 *
 * @author Ignacio
 */
public class sumatoria {
    public int sum(int num){
        int i;
        int resultado = 0;
        for (i=1; i<=num; i++){
            resultado = resultado + (2 * i - 1);
        }
        return resultado;
    }
}
