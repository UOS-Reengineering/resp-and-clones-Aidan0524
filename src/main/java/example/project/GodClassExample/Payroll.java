package example.project.GodClassExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Payroll {

    Map<String, PaySchedule> staffCategoryPaySchedule;

    public Payroll(Map<String, PaySchedule> staffCategoryPaySchedule) {
        this.staffCategoryPaySchedule = staffCategoryPaySchedule;
    }

    public PaySchedule getStaffCategoryPaySchedule(String staffCategory) {
        return staffCategoryPaySchedule.get(staffCategory);
    }

    //Task 3 remove navigation code
    public void changePayDay(String staffCategory, String date){
        PaySchedule paySchedule = staffCategoryPaySchedule.get(staffCategory);
        paySchedule.setPayDay(date);
    }

    //Task 3 remove navigation code
    public String getPayDay(String staffCategory){
        PaySchedule paySchedule = staffCategoryPaySchedule.get(staffCategory);
        return paySchedule.getPayDay();
    }
}
