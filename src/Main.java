import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File dir = new File("/IdeaProjects/Java Core/3. File-potoki/Games");
        File dir1 = new File(dir, "src");
        File dir2 = new File(dir, "res");
        File dir3 = new File(dir, "savegames");
        File dir4 = new File(dir, "temp");

        File dir5 = new File(dir1, "main");
        File dir6 = new File(dir1, "test");

        File dir7 = new File(dir2, "drawables");
        File dir8 = new File(dir2, "vectors");
        File dir9 = new File(dir2, "icons");


        File file1 = new File(dir5, "Main.java");
        File file2 = new File(dir5, "Utils.java");
        File file3 = new File(dir4, "temp.txt");

        StringBuilder sb = new StringBuilder();

        if (dir1.mkdir())
            sb.append("Каталог: " + dir1.getName() + " создан \n");

        if (dir2.mkdir())
            sb.append("Каталог: " + dir2.getName() + " создан \n");

        if (dir3.mkdir())
            sb.append("Каталог: " + dir3.getName() + " создан \n");

        if (dir4.mkdir())
            sb.append("Каталог: " + dir4.getName() + " создан \n");
        if (dir5.mkdir())
            sb.append("Каталог: " + dir5.getName() + " создан \n");
        if (dir6.mkdir())
            sb.append("Каталог: " + dir6.getName() + " создан \n");
        if (dir7.mkdir())
            sb.append("Каталог: " + dir7.getName() + " создан \n");
        if (dir8.mkdir())
            sb.append("Каталог: " + dir8.getName() + " создан \n");
        if (dir9.mkdir())
            sb.append("Каталог: " + dir9.getName() + " создан \n");

        try {
            if (file1.createNewFile()) {
                sb.append("\nфайл: " + file1.getName() + " создан \n");
            }
            if (file2.createNewFile()) {
                sb.append("файл: " + file2.getName() + " создан \n");
            }
            if (file3.createNewFile()) {
                sb.append("файл: " + file3.getName() + " создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("/IdeaProjects/Java Core/3. File-potoki/Games/temp/temp.txt");
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
