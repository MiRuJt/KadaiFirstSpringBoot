package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day) {
        String year = day.substring(0, 4);
        String month = day.substring(4, 6);
        String date = day.substring(6, 8);
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(date);
        LocalDate dates = LocalDate.of(y, m, d);
        DayOfWeek week = dates.getDayOfWeek(); 
    
    return "実行結果：" + week.toString();

}
    
    
    
}


