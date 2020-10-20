package logging;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class SearchSmallest {
    private static Logger logger;
    static {
        try(FileInputStream configFile = new FileInputStream("C:\\Users\\Walentin\\IdeaProjects\\Software Design Instruments\\src\\logging\\loggerConfigurations\\logger.config")){
            LogManager.getLogManager().readConfiguration(configFile);
            logger = Logger.getLogger(SearchSmallest.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    private static int function(int x) {
        logger.log(Level.INFO, "Выполнение функции задачи");
        return (x * x - 9) * (x * x - 9) + 5;
    }

    public static void main (String[] args) {
        logger.log(Level.INFO, "Начало программы, инициализация переменных");
        int a, b, t, M, R;
        logger.log(Level.INFO, "Присваивание значении для переменных");
        a = -13;
        b = 13;
        M = a;
        R = function(a);
        logger.log(Level.INFO, "Вход в цикл программы");
        for (t = a; t <= b; t++) {
            logger.log(Level.INFO, "Проверка условия { function(t) < R} ");
            if (function(t) < R) {
                logger.log(Level.INFO, "Условие { function(t) < R} верно ");
                M = t;
                R = function(t);
            }
        }
        System.out.println(M + 7);
        logger.log(Level.INFO, "Конец программы");

    }
}
