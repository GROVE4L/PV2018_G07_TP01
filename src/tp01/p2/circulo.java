package tp01.p2;

public class circulo {
    public void cir(int radio){
        double pi = 3.14;
        double area = pi * (radio * radio); 
        double per = pi * 2 * radio;
        System.out.println("El perimetro es: " + per + " El area es: " + area);
    }
}
