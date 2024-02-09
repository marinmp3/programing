import java.time.LocalDateTime;
/**
 *Tenemos 3 tipos de datos fecha:
 LocalDate: fecha
 LocalTime: hora
 LocalDateTime: fecha y hora
 */

public class Fecha {
    public static void main(String[] args) throws Exception {
        LocalDateTime fecha = LocalDateTime.now(); //new LocalDateTime()
        System.out.println(fecha);

        System.out.println(fecha.getYear());
        System.out.println(fecha.getMonthValue());
        System.out.println(fecha.getDayOfMonth());
        System.out.println(fecha.getHour());
        System.out.println(fecha.getMinute());
        System.out.println(fecha.getSecond());

        Month mes = Month.APRIL;
        fecha = LocalDateTime.of(2023,mes,27,12,7); //año, mes(indicado), día, hora, minuto
        System.out.println(fecha);
        
    }
}