package ObjectsAndClasses.Articles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in));

        String[] data = reader.readLine().split(", ");
        Article article = new Article(data[0], data[1], data[2]);

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0){
            String[] commands = reader.readLine().split(": ");

            switch (commands[0]){
                case "Edit":
                    article.edit(commands[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commands[1]);
                    break;
                case "Rename":
                    article.rename(commands[1]);
                    break;
            }
        }

        System.out.println(article);
    }
}
