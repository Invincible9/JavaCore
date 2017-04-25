package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 2/6/2017.
 */
public class TeroristsWinTests1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(text);

        int lastIndex = -1;
        while (true) {
            int firstIndex = text.indexOf("|", lastIndex + 1);

            if (firstIndex == -1) {
                break;
            }

            lastIndex = text.indexOf("|", firstIndex + 1);

            String searchingText = text.substring(firstIndex + 1, lastIndex);

            int bomb = 0;

            for (int i = 0; i < searchingText.length(); i++) {
                bomb += searchingText.charAt(i);
            }

            int bombLen = bomb % 10;

            int leftSide = Math.max(0, firstIndex - bombLen);
            int rightSide = Math.min(lastIndex + bombLen, text.length() - 1);

//            while (leftSide <= rightSide) {
//                sb.setCharAt(leftSide, '.');
//                leftSide++;
//            }

            for (int i = leftSide; i <= rightSide; i++) {
                sb.setCharAt(i, '.');
            }

        }

        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }

    }


    public static String newString(char symbol, int count) {
        String word = "";
        for (int i = 0; i < count; i++) {
            word += symbol;
        }
        return word;
    }


}


//    Scanner input = new Scanner(System.in);
//
//    String text = input.nextLine();
//    List<String> res = new ArrayList<>();
//
//    int startIndex = text.indexOf("|");
//
//        while(startIndex != -1){
//                int endIndex = text.indexOf("|", startIndex + 1);
//
//                if (endIndex == -1) {
//                break;
//                }
//
//                String snippet = text.substring(startIndex + 1, endIndex);
//                res.add(snippet);
//
//                startIndex = text.indexOf("|", endIndex + 1);
//                }
//
//                for (String re : res) {
//                System.out.println(re + " ");
//                }