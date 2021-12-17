public interface Task {
    //public void setLastCompleted();
    public int[] getLastCompleted();
    //public void setDueDate();
    //public int[] getDueDate();
    //public boolean checkIfComplete();

    void setLastCompleted(int hr, int min);

    //int[] getLastCompleted(DailyTask task);

    void setDueDate(DailyTask task, int hr, int min);

    int[] getDueDate(DailyTask task);

    boolean checkIfComplete(DailyTask task);

    boolean checkIfComplete();

    public boolean checkIfPastDue();

}
