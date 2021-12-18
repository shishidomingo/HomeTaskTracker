import java.util.Scanner;

public class Tracker {

    public static void main(String[] args) {
        int[] dueTime = new int[] {8,30};
        Scanner scanner = new Scanner(System.in);


        Task feedTheDog = new DailyTask("feed the dog", dueTime);

        System.out.println("Last completed time:");
        System.out.print(feedTheDog.getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(feedTheDog.getLastCompletedTime()[1]);
        System.out.println();
        System.out.println("Due time:");
        System.out.print(feedTheDog.getDueTime()[0]);
        System.out.print(':');
        System.out.print(feedTheDog.getDueTime()[1]);
        System.out.println();
        System.out.println("Is it completed?");
        System.out.println(feedTheDog.checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(feedTheDog.checkIfPastDue());

        feedTheDog.setLastCompletedTime(20, 50);
        System.out.println("Completing Task 20:50");


        System.out.println("Last completed time:");
        System.out.print(feedTheDog.getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(feedTheDog.getLastCompletedTime()[1]);
        System.out.println();
        System.out.println("Is it completed?");
        System.out.println(feedTheDog.checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(feedTheDog.checkIfPastDue());


    }


}
