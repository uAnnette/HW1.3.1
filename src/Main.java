import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {

        createDirectory("D://Games//src");
        createDirectory("D://Games//res");
        createDirectory("D://Games//savegames");
        createDirectory("D://Games//temp");
        createDirectory("D://Games//src//main");
        createDirectory("D://Games//src//test");

        createFile("D://Games//src//main", "Main.java");
        createFile("D://Games//src//main", "Utils.java");

        createDirectory("D://Games//res//drawables");
        createDirectory("D://Games//res//vectors");
        createDirectory("D://Games//res//icons");

        createFile("D://Games//temp", "temp.txt");

        try (FileWriter log = new FileWriter("D://Games//temp//temp.txt", false)) {
            log.write(builder.toString());
            log.flush();
        } catch (IOException ex) {
            System.out.println("Ошибка записи лога");
        }
    }

    public static void createDirectory(String name) {

        File dir = new File(name);
        Date date = new Date();
        if (dir.mkdir())
            builder.append("\nПапка " + dir.getName() + " создана" + "\n"
                    + "в папке " + dir.getParent() + "\n"
                    + "путь: " + dir.getAbsolutePath() + "\n"
                    + "время: " + date + "\n");
        else {
            builder.append("\nПапку " + name + " добавить не удалось" + "\n"
                    + "время: " + date + "\n");
        }
    }

    public static void createFile(String path, String name) {

        File myFile = new File(path + "//" + name);
        Date date = new Date();

        try {
            if (myFile.createNewFile())
                builder.append("\nФайл " + myFile.getName() + " добавлен" + "\n"
                        + "в папку " + myFile.getParentFile() + "\n"
                        + "путь: " + myFile + "\n"
                        + "время: " + date + "\n");
        } catch (IOException ex) {
            builder.append("\nФайл " + name + " добавить не удалось" + "\n"
                    + "время: " + date + "\n");
        }
    }
}