import java.time.LocalTime;
import java.time.LocalDateTime;
public class DailyTask implements Task{

    public String name;
    public boolean isComplete;
    public int[] lastCompleted = new int[5];
    public int hourDone;
    public int minuteDone;
    public int[] dueDate = new int[5];

    Task(String name, int[] dueDate){

    }


    public void setLastCompleted(DailyTask task, int hour, int minute, int day, int month, int year){
        task.lastCompleted = {hour, minute, day, month, year};
    };

    public int[] getLastCompleted(DailyTask task)[
            
            ]


}
