public class DailyTask implements Task{

    public String name;
    public boolean isComplete;
    public int[] lastCompleted = new int[2];
    public int hourDone;
    public int minuteDone;
    public int[] dueDate = new int[2];

    DailyTask(String name, int[] dueDate){
        name = name;
        dueDate = dueDate;
        isComplete = false;
    }


      @Override
    public void setLastCompleted(int hr, int min) {
        this.lastCompleted = new int[]{hr,min};
        checkIfComplete(this);
    }

    @Override
    public int[] getLastCompleted() {
        return this.lastCompleted;
    }

    @Override
    public void setDueDate(DailyTask task, int hr, int min) {
        task.dueDate = new int[] {hr, min};
    }

    @Override
    public int[] getDueDate(DailyTask task) {
        return task.dueDate;
    }

    @Override
    public boolean checkIfComplete() {
        if (getLastCompleted()[0] < getDueDate(this)[0] && getLastCompleted()[1] < getDueDate(this)[1]){
            return true;
        }
        else{return false;};
    }

    @Override
    public boolean checkIfPastDue() {
        return false;
    }
}
