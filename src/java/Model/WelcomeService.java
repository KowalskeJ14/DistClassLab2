/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kowal_000
 */
public class WelcomeService { 
    
    int hour;
    String morning = "morning";
    String evening = "evening";
    String night = "night";
    String message;
        
    public String getTimeOfDay() {
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        hour = cal.get(Calendar.HOUR_OF_DAY);
            
        if(hour < 12) {
            return morning;
        }
        else if(hour > 20) {
            return evening;
        }
        else {
            return night;
        }    
    }
    
    public String getWelcome (String name, String time) {
        message = "Welcome" + name + ", good " + time + "!";
        return message;
    }
        
    
}
