package tp01.p5;
public class cuadratica {
    public void raices(double a,double b, double c) {
        double raiz=(b*b)-4*a*c;
        if(raiz < 0)
            System.out.println("ERROR: Raiz Negativa.");
        else {
            double r1,r2;
            r1 = (-b+raiz)/(2*a);
            r2 = (-b-raiz)/(2*a);
            System.out.println("Raices Calculadas\nRaiz 1:"+r1+" - Raiz 2: "+r2);
        }
    }
}
