import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WeeklyTask implements Task{

    public String name;
    public boolean isComplete;
    public int[] lastCompletedTime;
    String lastCompletedDay;
    public int hourDone;
    public int minuteDone;
    public int[] dueTime = new int[2];
    String dueDay;

    WeeklyTask(String nameNew, int[] dueTimeNew, String dueDayNew){
        name = nameNew;
        dueTime = dueTimeNew;
        dueDay = dueDayNew;
        isComplete = false;
        lastCompletedTime = new int[]{23, 59};
    }

    @Override
    public String getName(){return this.name;}

    @Override
    public void setLastCompletedTime(int hr, int min) {
        int thisTime[] = new int[] {hr, min};
        this.lastCompletedTime = thisTime;
        //if (this.checkIfComplete() == true){ isComplete = true;};
        //this.isComplete = true;
    }

    @Override
    public int[] getLastCompletedTime() {
        return this.lastCompletedTime;
    }

    public void setLastCompleted(int hr, int min, String day){
        this.setLastCompletedTime(hr, min);
        this.lastCompletedDay = day;
        this.isComplete = true;
    }

    public String getLastCompletedDay() {
        return this.lastCompletedDay;

    }
    @Override
    public void setDueTime(int hr, int min) {
        int[] newTime = new int[] {hr, min};
        this.dueTime = newTime;
        this.checkIfComplete();
    }

    @Override
    public int[] getDueTime() {
        return this.dueTime;
    }

    public void setDueDay(String day){
        this.dueDay = day;
    }

    public String getDueDay(){
        return this.dueDay;
    }

    @Override
    public boolean checkIfComplete() {
        /*int compHr = this.getLastCompletedTime()[0];
        int compMin = this.getLastCompletedTime()[1];
        int dueHr = this.getDueTime()[0];
        int dueMin = this.getDueTime()[1];

        if (compHr < dueHr){
            this.isComplete = true;
            return true;

        }
        if ((compHr == dueHr) && (compMin <= dueMin)){
            this.isComplete = true;
            return true;

        }
        return false;*/

        return this.isComplete;
    }

    @Override
    public boolean checkIfPastDue() {
        LocalDateTime now = LocalDateTime.now();
        final String[] days = new String[] {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        boolean dayIsPastDue = false;
        int dayNumber = 0;
        int dueDayNumber = 0;

        DayOfWeek day = now.getDayOfWeek();
        for (int i = 0; i < days.length; i++){
            if (i == day.getValue()) {
                dayNumber = i;
            }
        }
        for (int i = 0; i < days.length; i++){
            if (this.dueDay == days[i]){
                dueDayNumber = i;
            }
        }

        if (dayNumber <= dueDayNumber){
            dayIsPastDue = false;
        }

        if (this.checkIfComplete() == false && now.getHour() <= this.getLastCompletedTime()[0] && now.getMinute() < this.getLastCompletedTime()[1] && !dayIsPastDue){
            return true;
        }
        return false;
    }
}
