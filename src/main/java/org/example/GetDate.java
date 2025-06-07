package org.example;

import java.time.LocalDate;

public class GetDate {
    private static LocalDate  localDate = LocalDate.now();

    public static LocalDate getLocalDate() {
        return localDate;
    }
}
