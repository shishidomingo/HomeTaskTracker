

public class Tracker {

    public static void main(String[] args) {
        int[] dueDate = new int[] {8,30};

        DailyTask feedTheDog = new DailyTask("feed the dog", dueDate);

        System.out.println(feedTheDog.getLastCompleted());


    }


}
