package HomeTask04_3;

// С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
//Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
//
//Например:
//определить уровень приоритетов: низкий, средний, немедленное выполнение
//выделить компоненту для хранения данных
//выделить компоненту для организации импорта\экспорта данных
//Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
//данные хранятся в файле csv/jsom/xml
//другие компоненты

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskPlaner extends Menu {
    public static void main(String[] args) throws IOException {
        // Создаем путь к файлам
        String pathFileCurrentTasks = "D:\\GeekBrains\\1 четверть\\12. ООП\\Семинары\\GB_Java_OOP\\Java_OOP\\src\\main\\resources\\Files\\currentTasks.txt";
        String pathFileCompletedTasks = "D:\\GeekBrains\\1 четверть\\12. ООП\\Семинары\\GB_Java_OOP\\Java_OOP\\src\\main\\resources\\Files\\completedTasks.txt";

        // Создаем объект файл
        File currentTasks = new File(pathFileCurrentTasks);
        File complitedTasks = new File(pathFileCompletedTasks);

        // создаем считыватель потока из файла
        Scanner scanCurrentTasks = new Scanner(currentTasks);
        Scanner scanCompletedTasks = new Scanner(complitedTasks);

        // Создаем список из задач
        List<Task> currTasks = new ArrayList<>();
        Task.taskListCreator(currTasks, scanCurrentTasks);
        List<Task> compTasks = new ArrayList<>();
        Task.taskListCreator(compTasks,scanCompletedTasks);

        boolean flag = true;
        while (flag) {
            Menu();
            Scanner input = new Scanner(System.in);
            int command = input.nextInt();
            switch (command) {
                case 1 -> Task.showTasks(currTasks);                // Показывает текущие задачи
                case 2 -> Task.showTasks(compTasks);                // Показывает выполненные задачи
                case 3 -> Task.newTask(currTasks);                  // Создает новую задачу
                case 4 -> Task.taskReplace(currTasks, compTasks);   // Перемещает задачу из текущих в выполненные
                case 5 -> Task.taskDelete(currTasks);               // Удаляет задачу
                case 6 -> {
                    // создаем объекты для записи
                    PrintWriter currTasksSaver = new PrintWriter(currentTasks);
                    Task.taskSave(currTasks, currTasksSaver);
                    PrintWriter compTasksSaver = new PrintWriter(complitedTasks);
                    Task.taskSave(compTasks, compTasksSaver);
                }
                case 7 -> flag = false;
            }
        }
    }
}
