package logica;

public class Parcial {
	  
    public double[] solver(double a, double b, double c) {
        // la ecuasion primero  ax^2 + bx + c = 0
    	//-b+-squrt(b^2-4ac)/2a, si a llega a hacer 0 generaria error 
        if (a == 0) {
            throw new IllegalArgumentException("'a' no puede ser 0");
        }
        //lo que esta dentro de la raiz si esto es menor a cero darian raices negativas
        double coso =( b *b )- 4 * a * c;
        
        if (coso < 0) {
            throw new IllegalArgumentException("Discriminante negativo - raíces complejas");
        }
        
        double raiz1 = (-b + Math.sqrt(coso)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(coso)) / (2 * a);
        
        return new double[] { raiz1, raiz2 };
    }

}








/*

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/