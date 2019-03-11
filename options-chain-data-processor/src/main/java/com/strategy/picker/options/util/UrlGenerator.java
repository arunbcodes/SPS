package com.strategy.picker.options.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UrlGenerator {

    //https://www.nseindia.com/content/historical/DERIVATIVES/2019/MAR/fo08MAR2019bhav.csv.zip
    //generate this URL here based on today's date
    public static final String NSE_DERIVATIVES_URL = "https://www.nseindia.com/content/historical/DERIVATIVES/%d/%s/fo%sbhav.csv.zip";

    public static String generateFnOURL(){
        //TimeZone tz = TimeZone.getTimeZone("Asia/Calcutta");
        //Calendar.getInstance(tz)
        // calendar.get(Calendar.HOUR_OF_DAY) -> use this way if you want Indian Time Zone. this will give the current hour in India.
        Calendar calendar = Calendar.getInstance(); //Year.now().getValue(); this can also be used
        int year = calendar.get(Calendar.YEAR);

        SimpleDateFormat monthFormat = new SimpleDateFormat("MMM");
        String month = monthFormat.format(calendar.getTime()).toUpperCase();

        SimpleDateFormat fileNameFormat = new SimpleDateFormat("ddMMMYYYY");
        String fileName = fileNameFormat.format(calendar.getTime()).toUpperCase();
        return String.format(NSE_DERIVATIVES_URL, year, month, fileName);
    }

}
