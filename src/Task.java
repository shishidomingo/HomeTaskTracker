public interface Task {
    public void setLastCompleted();
    public int[] getLastCompleted();
    public void setDueDate();
    public int[] getDueDate();
    public boolean checkIfComplete();
    public boolean checkIfPastDue();

}
