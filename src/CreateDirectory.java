import java.io.File;
import java.util.Date;

public class CreateDirectory {

    private StringBuilder builder = new StringBuilder();

    public void addDirectory(String name) {

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

    public StringBuilder getBuilder() {
        return builder;
    }
}
