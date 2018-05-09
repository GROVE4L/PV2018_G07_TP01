package tp01.p3;

public class primos {
    public void verPrimos(int A, int B) {
        int i;
        for(i=A; i<=B; i++) {          
            if(esPrimo(i))
                System.out.println(i);              
        }
    }
    private boolean esPrimo(int numero){
        if(numero == 1) return true;
        if(numero <= 0) return false;
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
    }
}
