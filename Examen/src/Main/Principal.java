package Main;
import logica.Parcial;


public class Principal {
    
    public static void main(String[] args) {
        Parcial ecuacion = new Parcial();
        
        try {
            double[] raices = ecuacion.solver(12, 4, 2);
            System.out.println("Las Raíces serian: " + raices[0] + ", " + raices[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
