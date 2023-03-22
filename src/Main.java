import java.io.File;

public class Main {
    public static StringBuilder stringBuilder;

    public static void main(String[] args) {
        createDir(dir1, "D://Games/src");
//         dir1, "D://Games/src"
//         dir2, "D://Games/res"
//         dir3, "D://Games/savegames"
//         dir4, "D://Games/temp"
//         dir5, "D://Games/src/main"
//         dir6, "D://Games/src/test"
//         dir7, "D://Games/res/drawables"
//         dir8, "D://Games/res/vectors"
//         dir9, "D://Games/res/icons"



    }

    public static String createDir (String name, String pathname) {
        File name = new File(pathname);
        if (dir1.mkdir())
                stringBuilder.append("Папка D://Games/src создана\n");
            else
                stringBuilder.append("Папка D://Games/src не создана\n");

    }
}