package prfactorial;
public class Factorial {

    static int calcular(int x) {
        int salida = 1;
        
        if (x >= 2)
            salida = x * calcular(x-1);
        
        return salida;
    }
}
