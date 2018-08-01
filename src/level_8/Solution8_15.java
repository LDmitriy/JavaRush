package level_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class Solution8_15 {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Shvarc", df.parse("JULY 2 1985"));
        map.put("Shvarc1", df.parse("AUGUST 2 1985"));
        map.put("Shvarc2", df.parse("NOVEMBER 2 1985"));
        map.put("Shvarc3", df.parse("NOVEMBER 2 1985"));
        map.put("Shvarc4", df.parse("NOVEMBER 2 1985"));
        map.put("Shvarc5", df.parse("NOVEMBER 2 1985"));
        map.put("Shvarc6", df.parse("NOVEMBER 2 1985"));
        map.put("Shvarc7", df.parse("JUNE 2 1985"));
        map.put("Shvarc8", df.parse("JULY 2 1985"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> map1 = new HashMap<>();
        for (HashMap.Entry<String, Date> s : map.entrySet()) {
            if (s.getValue().toString().contains("Jun") | s.getValue().toString().contains("Jul") | s.getValue().toString().contains("Aug")) {

            } else map1.put(s.getKey(), s.getValue());
        }
        map.clear();
        for (HashMap.Entry<String,Date> s: map1.entrySet()){
            map.put(s.getKey(),s.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
