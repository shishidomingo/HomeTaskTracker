import java.util.Scanner;

public class Tracker {

    public static void main(String[] args) {
        int[] dueTime = new int[]{8, 30};
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many daily tasks would you like to track?");
        int dailyTaskCount = scanner.nextInt();
        System.out.println("How many weekly tasks would you like to track?");
        int weeklyTaskCount = scanner.nextInt();
        scanner.nextLine(); // consume newline char prior to entering loop
        //System.out.println("How many ongoing tasks would you like to track?");
        Task[] myDailyTasks = new DailyTask[dailyTaskCount];
        for (int i = 0; i < dailyTaskCount; i++) {
            System.out.println("Enter name of task #" + (i + 1));
            String taskName = scanner.nextLine();
            System.out.println("Enter due hour of task #" + (i + 1));
            int taskDueHour = scanner.nextInt();
            System.out.println("Enter due minutes of task #" + (i + 1));
            int taskDueMinute = scanner.nextInt();
            scanner.nextLine();  //consume newline char prior to next loop
            int[] dueTimeNew = new int[]{taskDueHour, taskDueMinute};
            myDailyTasks[i] = new DailyTask(taskName, dueTimeNew);

            System.out.println(myDailyTasks[i].toString());
        }


        //Task feedTheDog = new DailyTask("feed the dog", dueTime);

        System.out.println("Task 1 name: ");
        System.out.println(myDailyTasks[0].getName());

        System.out.println("Last completed time:");
        System.out.print(myDailyTasks[0].getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(myDailyTasks[0].getLastCompletedTime()[1]);
        System.out.println();
        System.out.println("Due time:");
        System.out.print(myDailyTasks[0].getDueTime()[0]);
        System.out.print(':');
        System.out.print(myDailyTasks[0].getDueTime()[1]);
        System.out.println();
        System.out.println("Is it completed?");
        System.out.println(myDailyTasks[0].checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(myDailyTasks[0].checkIfPastDue());

        myDailyTasks[0].setLastCompletedTime(20, 50);
        System.out.println("Completing Task 20:50");


        System.out.println("Last completed time:");
        System.out.print(myDailyTasks[0].getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(myDailyTasks[0].getLastCompletedTime()[1]);
        System.out.println();
        System.out.println("Is it completed?");
        System.out.println(myDailyTasks[0].checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(myDailyTasks[0].checkIfPastDue());


        int[] weeklyDueTime = new int[]{8, 30};
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("How many daily tasks would you like to track?");
        //int dailyTaskCount = scanner.nextInt();
        //System.out.println("How many weekly tasks would you like to track?");
        //int weeklyTaskCount = scanner.nextInt();
        scanner.nextLine(); // consume newline char prior to entering loop
        //System.out.println("How many ongoing tasks would you like to track?");

        Task[] myWeeklyTasks = new WeeklyTask[weeklyTaskCount];
        for (int i = 0; i < weeklyTaskCount; i++) {
            System.out.println("Enter name of task #" + (i + 1));
            String taskName = scanner.nextLine();
            System.out.println("Enter due hour of task #" + (i + 1));
            int taskDueHour = scanner.nextInt();
            System.out.println("Enter due minutes of task #" + (i + 1));
            int taskDueMinute = scanner.nextInt();
            System.out.println("Enter due day of task #" + (i + 1));
            String taskDueDay = scanner.next();
            scanner.nextLine();  //consume newline char prior to next loop
            int[] dueTimeNew = new int[]{taskDueHour, taskDueMinute};
            myWeeklyTasks[i] = new WeeklyTask(taskName, dueTimeNew, taskDueDay);

            System.out.println(myDailyTasks[i].toString());
        }

        System.out.println("Weekly Task 1 name: ");
        System.out.println(myWeeklyTasks[0].getName());

        System.out.println("Last completed:");
        System.out.print(myWeeklyTasks[0].getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(myWeeklyTasks[0].getLastCompletedTime()[1]);
        System.out.println(" ");
        System.out.println(((WeeklyTask)myWeeklyTasks[0]).getLastCompletedDay());
        System.out.println();
        System.out.println("Due time:");
        System.out.print(myDailyTasks[0].getDueTime()[0]);
        System.out.print(':');
        System.out.print(myDailyTasks[0].getDueTime()[1]);
        System.out.println();
        System.out.println("Due day: ");
        System.out.println(((WeeklyTask)myWeeklyTasks[0]).getDueDay());
        System.out.println("Is it completed?");
        System.out.println(myDailyTasks[0].checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(myDailyTasks[0].checkIfPastDue());

        myDailyTasks[0].setLastCompletedTime(20, 50);
        System.out.println("Completing Task 20:50");


        System.out.println("Last completed time:");
        System.out.print(myDailyTasks[0].getLastCompletedTime()[0]);
        System.out.print(':');
        System.out.print(myDailyTasks[0].getLastCompletedTime()[1]);
        System.out.println();
        System.out.println("Is it completed?");
        System.out.println(myDailyTasks[0].checkIfComplete());
        System.out.println("Is it past due?");
        System.out.println(myDailyTasks[0].checkIfPastDue());

    }
}