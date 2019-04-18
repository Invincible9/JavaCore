package ObjectsAndClasses.Articles2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in));


        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0){

            String[] data = reader.readLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articles.add(article);
        }

        String command = reader.readLine();
        String type = "get" + command.toUpperCase().charAt(0) + command.substring(1) + "";

        switch (command){

            case "title":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .forEach(System.out::println);
                break;
            case "content":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .forEach(System.out::println);
                break;
            case "author":
                articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(System.out::println);
                break;

        }




    }
}
