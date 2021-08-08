package com.abdsul.strings.formatters;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Locale;

public class DataFormatter {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        Instant instant = Instant.ofEpochMilli(millis);
        System.out.println(instant);


        Locale locale = Locale.getDefault();
        System.out.println("locale = " + locale);

        LocalDateTime localDateTime = LocalDateTime.now();

        Formatter formatter = new Formatter();
        formatter.format("Год - %tY ", localDateTime);
        formatter.format("или %ty, ", localDateTime);
        formatter.format("Месяц - %tB ", localDateTime);
        formatter.format("или %tb, ", localDateTime);
        formatter.format("час %tH - ", localDateTime);
        formatter.format("%tI, ", localDateTime);
        formatter.format("\n day of week - %tA ", localDateTime);
        System.out.println(formatter);

        System.out.printf("256 = %x, в 16-ой\n", 256);
        System.out.printf("256 = %o, в 8-ой\n", 256);





    }
}
