package logging;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class SearchSmallest {
    static Logger logger;
    static {
        try(FileInputStream configFile = new FileInputStream("C:\\Users\\Walentin\\LoggerConfigs\\configuration.config")){
            LogManager.getLogManager().readConfiguration(configFile);
            logger = Logger.getLogger(SearchSmallest.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    private static int function(int x) {
        return (x * x - 9) * (x * x - 9) + 5;
    }

    public static void main (String[] args) {
        int a, b, t, M, R;
        a = -13;
        b = 13;
        M = a;
        R = function(a);
        for (t = a; t <= b; t++) {
            if (function(t) < R) {
                M = t;
                R = function(t);
            }
        }
        System.out.println(M + 7);

    }
}
