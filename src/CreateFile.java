import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreateFile {

    private StringBuilder builder = new StringBuilder();

    public void addFile(String name) {

        File myFile = new File(name);
        Date date = new Date();

        try {
            if (myFile.createNewFile())
                builder.append("\nФайл " + myFile.getName() + " добавлен" + "\n"
                        + "в папку " + myFile.getParent() + "\n"
                        + "путь: " + name + "\n"
                        + "время: " + date + "\n");
        } catch (IOException ex) {
            builder.append("\nФайл " + name + " добавить не удалось" + "\n"
                        + "время: " + date + "\n");
        }
    }

    public StringBuilder getBuilder() {
        return builder;
    }
}
