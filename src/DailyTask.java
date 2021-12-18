import java.time.LocalDateTime;
import java.time.LocalTime;

public class DailyTask implements Task{

    public String name;
    public boolean isComplete;
    public int[] lastCompletedTime;
    String lastCompletedDay;
    public int hourDone;
    public int minuteDone;
    public int[] dueTime = new int[2];

    DailyTask(String nameNew, int[] dueTimeNew){
        name = nameNew;
        dueTime = dueTimeNew;
        isComplete = false;
        lastCompletedTime = new int[]{23, 59};
    }


      @Override
    public void setLastCompletedTime(int hr, int min) {
        int thisTime[] = new int[] {hr, min};
        this.lastCompletedTime = thisTime;
        //if (this.checkIfComplete() == true){ isComplete = true;};
          this.isComplete = true;
    }

    @Override
    public int[] getLastCompletedTime() {
        return this.lastCompletedTime;
    }

    public void setLastCompletedDay(String day){
        this.lastCompletedDay = day;
        this.checkIfComplete();
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

        if (this.checkIfComplete() == false && now.getHour() <= this.getLastCompletedTime()[0] && now.getMinute() < this.getLastCompletedTime()[1]){
            return true;
        }
        return false;
    }
}
