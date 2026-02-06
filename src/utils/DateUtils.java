package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    // Define format
    private static final String DATE_PATTERN = "dd/MM/yyyy";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    /**
     * Returns today's date in dd/MM/yyyy format.
     */
    public static String getTodayDate() {
        return LocalDate.now().format(FORMATTER);
    }

    /**
     * Returns the date 7 days from now in dd/MM/yyyy format.
     */
    public static String getDatePlusSevenDays() {
        return LocalDate.now().plusDays(7).format(FORMATTER);
    }

    /**
     * A flexible version to get any date in the future or past.
     * Use a negative number for past dates.
     */
    public static String getOffsetDate(int days) {
        return LocalDate.now().plusDays(days).format(FORMATTER);
    }
}