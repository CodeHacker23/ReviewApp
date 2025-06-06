package org.example;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class GetDate {
    private static LocalDate  localDate = LocalDate.now();

    public static LocalDate getLocalDate() {
        return localDate;
    }
}
