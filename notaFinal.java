import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        System.out.println("Asignatura: Cálculo Diferencial e Integral.");
        boolean examen = false;
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese su nota de presentación: ");
        double Nota = reader.nextDouble();
        if (Nota >= 5.0) {
            System.out.println("Aprobado con eximición."); 
        } else {
            System.out.println("Debe rendir examen.");
            examen = true;
        }
        if (examen == true) {
            System.out.print("Ingrese su nota de examen: ");
            double notaExamen = reader.nextDouble();
            double notaFinal = (Nota * 0.7 + notaExamen * 0.3);
            if (notaFinal >= 4.0) {
                System.out.println("Aprobado. Nota final: " + notaFinal);
            } else {
                System.out.println("Reprobado. Nota final: " + notaFinal);
            }
        }    
    }
}
