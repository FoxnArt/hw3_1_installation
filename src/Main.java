import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String homeDir = "D://Games";
        String[] dirPathArr = {
                "/src",
                "/res",
                "/savegames",
                "/temp",
                "/src/main",
                "/src/test",
                "/res/drawables",
                "/res/vectors",
                "/res/icons"
        };
        String[] filePathArr = {
                "/src/main/Main.java",
                "/src/main/Utils.java",
                "/temp/temp.txt"
        };

        StringBuilder stringBuilder = new StringBuilder();
        for (String value : dirPathArr) {
            stringBuilder.append(createMyDir(homeDir + value));
        }
        for (String value : filePathArr) {
            stringBuilder.append(createMyFile(homeDir + value));
        }

        String log = stringBuilder.toString();
        String logPath = homeDir + "/temp/temp.txt";
        writeLog(logPath, log);
    }

    public static String createMyDir(String dirPath) {
        File dirName = new File(dirPath);
        if (dirName.mkdir()) {
            return (new Date() + " : " + dirPath + " : folder created successfully\n");
        } else {
            return (new Date() + " : " + dirPath + " : folder not created\n");
        }
    }

    public static String createMyFile(String filePath) {
        File fileName = new File(filePath);
        try {
            if (fileName.createNewFile())
                return (new Date() + " : " + filePath + " : file created successfully\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return (new Date() + " : " + filePath + " : file not created\n");
    }

    public static void writeLog(String logPath, String log) {
        try (FileWriter writer = new FileWriter(logPath)) {
            writer.write(log);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}