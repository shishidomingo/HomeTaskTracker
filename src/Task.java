public interface Task {
    //public void setLastCompleted();
    //public int[] getLastCompleted();
    //public void setDueDate();
    //public int[] getDueDate();
    //public boolean checkIfComplete();

    void setLastCompletedTime(int hr, int min);

    int[] getLastCompletedTime();

    //void setLastCompletedDay(String day);

    //String getLastCompletedDay();

    void setDueTime(int hr, int min);

    int[] getDueTime();

    String getName();

    //void setDueDay(String day);

    //void getDueDay();

    boolean checkIfComplete();

    public boolean checkIfPastDue();

}
