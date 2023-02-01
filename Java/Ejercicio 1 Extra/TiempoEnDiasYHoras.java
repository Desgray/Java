import java.util.Scanner;
import java.time.Duration;
public class TiempoEnDiasYHoras {
  public static void main(String[] args) {


      Scanner valor=new Scanner(System.in);
      System.out.println("Ingrese los minutos");
      long minutes=valor.nextInt();
      Duration duration = Duration.ofMinutes(minutes);
      long days = duration.toDays();
      long hours = duration.toHours();
      long minutos=duration.toMinutes();
      System.out.println("Equivalente en dias y horas: " + days + " dia(s) y " + hours + " hora(s)"+minutos+" minuto(s)");
    // Pedir al usuario que ingrese el tiempo en minutos
    /*Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tiempo en minutos: ");
    int minutos = scanner.nextInt();
    
    // Convertir el tiempo en minutos a horas
    double horas = minutos / 60.0;
    
    // Convertir el resultado en horas a días
    double dias = horas / 24.0;
    
    // Calcular las horas restantes después de convertir a días
    horas = horas - (dias * 24);
    
    // Mostrar el resultado al usuario
    System.out.println("Equivalente en días y horas: " + dias + " día(s) y " + horas + " hora(s)");
    */
  }
}
