package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2019-09-28");
        LocalDateTime d05 = LocalDateTime.parse("2019-09-28T18:30:00");
        Instant d06 = Instant.parse("2019-09-28T18:30:00Z");
        Instant d07 = Instant.parse("2019-09-28T18:30:00-03:00");

        LocalDate d08 = LocalDate.parse("28/09/2019", fmt1);

        System.out.println("\n d01 -> " + d01);
        System.out.println("\n d02 -> " + d02);
        System.out.println("\n d03 -> " + d03);
        System.out.println("\n d04 -> " + d04);
        System.out.println("\n d05 -> " + d05);
        System.out.println("\n d06 -> " + d06);
        System.out.println("\n d07 -> " + d07);
        System.out.println("\n d08 -> " + d08);
    } 
}
