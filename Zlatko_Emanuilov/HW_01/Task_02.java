package HW_01;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 Task_02 Print the Current Date and Time
 Create a simple Java program CurrentDateTime.java to print the current date and time.
 Submit the Java class CurrentDateTime as part of your homework.
 */
public class Task_02 {


    public static void main (String[] args) throws IOException, ParseException {

     //   Task_01.task2();

        System.out.println ("--------------- Task 02 ------------------");
       //System.out.println(LocalDateTime);



        //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today);

        //Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("     Specific Date="+firstDay_2014);


        //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid date 'February 29' as '2014' is not a leap year

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("     Current Date in IST="+todayKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("     365th day from base date= "+dateFromBase);

        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("     100th day of 2014="+hundredDay2014);

// --------------------------------------------------------------------------------------------
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);

        //Creating LocalTime by providing input arguments
        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("     Specific Time of Day="+specificTime);


        //Try creating time by providing invalid inputs
        //LocalTime invalidTime = LocalTime.of(25,20);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid value for HourOfDay (valid values 0 - 23): 25

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("     Current Time in IST="+timeKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));

        //Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("     10000th second time= "+specificSecondTime);

        System.out.println("-------------------");

        //Date API to Legacy classes
        Date dt = Date.from(Instant.now());
        System.out.println(dt);



        System.out.println("-------------------");
        System.out.println("-------------------");

        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("dayOfWeek - " + dayOfWeek);

        System.out.println("-------------------");
        System.out.println("-------------------");


        Date now = new Date();

        System.out.println("--------- E ----------");

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));

        System.out.println("--------- EE ----------");

        simpleDateformat = new SimpleDateFormat("EE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));

        System.out.println("--------- EEE ----------");

        simpleDateformat = new SimpleDateFormat("EEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));

        System.out.println("--------- EEEE ----------");

        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));

        System.out.println("-------------------");
        System.out.println("-------------------");

        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely

        Date dat = now;
        System.out.println(dat);

        System.out.println(simpleDateformat.format(dat));


        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");

        System.out.println("--------- Форматиране ----------");



        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
     String data = "01.03.2016";
        Date daaa = formatter.parse(data);

        System.out.println("data = " + daaa);

        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy - EEEE");

        System.out.println("Форматирано - " + formater.format(daaa));

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");

        System.out.println("--------- calendar ----------");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format

//        (see complete list of Patterns for Formatting and Parsing DateFormatter)

//        Symbol  Meaning                     Presentation      Examples
//        ------  -------                     ------------      -------
//                G       era                         text              AD; Anno Domini; A
//        u       year                        year              2004; 04
//        y       year-of-era                 year              2004; 04
//        D       day-of-year                 number            189
//        M/L     month-of-year               number/text       7; 07; Jul; July; J
//        d       day-of-month                number            10
//
//        Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
//        Y       week-based-year             year              1996; 96
//        w       week-of-week-based-year     number            27
//        W       week-of-month               number            4
//        E       day-of-week                 text              Tue; Tuesday; T
//        e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
//        F       week-of-month               number            3
//
//        a       am-pm-of-day                text              PM
//        h       clock-hour-of-am-pm (1-12)  number            12
//        K       hour-of-am-pm (0-11)        number            0
//        k       clock-hour-of-am-pm (1-24)  number            0
//
//        H       hour-of-day (0-23)          number            0
//        m       minute-of-hour              number            30
//        s       second-of-minute            number            55
//        S       fraction-of-second          fraction          978
//        A       milli-of-day                number            1234
//        n       nano-of-second              number            987654321
//        N       nano-of-day                 number            1234000000
//
//        V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
//        z       time-zone name              zone-name         Pacific Standard Time; PST
//        O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
//        X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
//        x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
//        Z       zone-offset                 offset-Z          +0000; -0800; -08:00;
//
//        p       pad next                    pad modifier      1
//
//        '       escape for text             delimiter
//        ''      single quote                literal           '
//                [       optional section start
//        ]       optional section end
//        #       reserved for future use
//        {       reserved for future use
//        }       reserved for future use
    }
}
