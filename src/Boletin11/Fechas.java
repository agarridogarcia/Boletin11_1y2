
package Boletin11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import javax.swing.JOptionPane;


public class Fechas {
    public void calcularTempo (){
        Instant ahora1=Instant.now();//tempo no que se empeza a escribir
        String resposta=JOptionPane.showInputDialog("Escribe a seguinte: \n A documentación é todo aquel \n conxunto de manuais impresos \n ou en formato dixital que \n explique unha aplicación \n informática .");
        Instant antes1=Instant.now();//tempo no que acabamos de escribir
        System.out.println("Tardaste em escribir a frase: " + Duration.between(ahora1, antes1).getSeconds() + "segundos");
        
    }
    
   
    public void fechaActual (){
       LocalDateTime ahora = LocalDateTime.now(); 
       System.out.printf("A fecha e: %s%n", ahora); 
       LocalDateTime algunDia = LocalDateTime.of(1990, Month.AUGUST, 6, 6, 10); 
       System.out.printf("Cumpleanos %s%n", algunDia); 
       System.out.printf("Fai seis meses foi %s%n", LocalDateTime.now().minusMonths(6)); 
       System.out.printf("Fai seis dias foi %s%n", LocalDateTime.now().minusDays(6)); 
       System.out.printf("Fai cinco semanas foi %s%n", LocalDateTime.now().minusWeeks(5));
       
       
    }
    
}
