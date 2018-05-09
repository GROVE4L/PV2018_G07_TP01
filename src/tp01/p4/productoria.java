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
public class productoria {
    public int pro(int num){
        int resultado = 1;
        for (int i=1; i<=num; i++){
        resultado = resultado * i;
        }
    return resultado;
    }
}
