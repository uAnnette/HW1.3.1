import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        CreateDirectory createDirectory = new CreateDirectory();
        createDirectory.addDirectory("D://Games//src");
        createDirectory.addDirectory("D://Games//res");
        createDirectory.addDirectory("D://Games//savegames");
        createDirectory.addDirectory("D://Games//temp");
        createDirectory.addDirectory("D://Games//src//main");
        createDirectory.addDirectory("D://Games//src//test");

        CreateFile createFile = new CreateFile();
        createFile.addFile("D://Games//src//main//Main.java");
        createFile.addFile("D://Games//src//main//Utils.java");

        createDirectory.addDirectory("D://Games//res//drawables");
        createDirectory.addDirectory("D://Games//res//vectors");
        createDirectory.addDirectory("D://Games//res//icons");

        createFile.addFile("D://Games//temp//temp.txt");

        try (FileWriter log = new FileWriter("D://Games//temp//temp.txt", false)) {
            log.write(createFile.getBuilder().toString());
            log.write(createDirectory.getBuilder().toString());
            log.flush();
        } catch (IOException ex) {
            System.out.println("Ошибка записи лога");
        }
    }
}