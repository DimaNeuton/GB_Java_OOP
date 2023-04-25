package HomeTask04_3;

import java.awt.*;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Task {
    String id;
    String date;
    String time;
    String deadLine;
    String author;
    String taskDescription;
    String priority;
//    boolean executionStatus;


    public Task(String id, String date, String time, String deadLine, String author, String taskDescription, String priority) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.deadLine = deadLine;
        this.author = author;
        this.taskDescription = taskDescription;
        this.priority = priority;
    }

    public Task() {
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getTime(String time) {
        return time;
    }

    public String getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
    public String getDeadLine() {
        return deadLine;
    }
    public String getAuthor() {
        return author;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public String getPriority() {
        return priority;
    }
    public String getTime() {
        return time;
    }

    static Task taskBuilder(String[] taskElementList) {
        Task task = new Task();
        task.id = taskElementList[0];
        task.date = taskElementList[1];
        task.time = taskElementList[2];
        task.deadLine = taskElementList[3];
        task.author = taskElementList[4];
        task.taskDescription = taskElementList[5];
        task.priority = taskElementList[6];
        return task;
    }

    static String input() {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        return inputText;
    }
    static void showTasks(List<Task> tasks) {
        for (Task element : tasks) {
            System.out.printf("id - %s\tdate - %s\ttime - %s\tdeadLine - %s\tauthor - %s\ttaskDescription - %s\tpriority - %s\n",
                    element.getId(), element.getDate(), element.getTime(), element.getDeadLine(), element.getAuthor(),
                    element.getTaskDescription(), element.getPriority());
        }
    }
    static void taskListCreator(List<Task> tasks, Scanner scan) {
        while (scan.hasNextLine()) {
            tasks.add(Task.taskBuilder(scan.nextLine().split(" ")));
        }
    }
    static void newTask(List<Task> tasks) {
        String[] taskInput = new String[7];
        Date date = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        taskInput[0] = Integer.toString(tasks.size() + 1);
        taskInput[1] = date1.format(date);
        taskInput[2] = time.format(date);
        System.out.print("Введите срок выполнения в формате dd.MM.yyyy");
        taskInput[3] = input();
        System.out.print("Введите ФИО");
        taskInput[4] = input();
        System.out.print("Введите описание задачи");
        taskInput[5] = input();
        System.out.print("Введите приоритет задачи: Низкий, Средний или Высокий");
        taskInput[6] = input();
        tasks.add(taskBuilder(taskInput));
    }
    static void newTask(List<Task> tasks, Task task) {
        tasks.add(task);
    }

    static void taskSave(List<Task> tasks, PrintWriter tasksSaver) {
        StringBuilder stringTasks = new StringBuilder();
        for (Task task : tasks) {
            stringTasks.append(task.getId()).append(" ")
                    .append(task.getDate()).append(" ")
                    .append(task.getTime()).append(" ")
                    .append(task.getDeadLine()).append(" ")
                    .append(task.getAuthor()).append(" ")
                    .append(task.getTaskDescription()).append(" ")
                    .append(task.getPriority()).append("\n");
        }
        System.out.println(stringTasks);
        tasksSaver.print(stringTasks);
        tasksSaver.close();
    }
    static void checkId(List<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            if (!tasks.get(i).getId().equals(Integer.toString(i))) {
                tasks.get(i).setId(Integer.toString(i + 1));
            }
        }
    }
    static void taskReplace(List<Task> currTasks, List<Task> compTasks) {
        System.out.print("Введите id задачи, которую нужно пометить как выполненную: ");
        Scanner in = new Scanner(System.in);
        for (Task task : currTasks) {
            if (task.getId().equals(Integer.toString(in.nextInt()))) {
                Task.newTask(compTasks, task);
                currTasks.remove(task);
                Task.checkId(currTasks);
            }
        }
    }
    static void taskDelete(List<Task> tasks) {
        System.out.print("Введите id задачи, которую нужно удалить: ");
        Scanner in = new Scanner(System.in);
        for (Task task : tasks) {
            if (task.getId().equals(Integer.toString(in.nextInt()))) {
                tasks.remove(task);
                Task.checkId(tasks);
            }
        }
    }
}
