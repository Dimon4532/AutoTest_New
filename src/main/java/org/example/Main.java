package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

    //    cycle( 10);

        // Используем TextSender
        TextSender textSender = new TextSender("example.com",  "/api", """
                Hellow, world!""");
        System.out.println(textSender.send());

        // Используем JsonSender
        JsonSender jsonSender = new JsonSender( "api.example.com",  "/users",
            "{\"name\":\"Json\",\"age\":30}");
        System.out.println(jsonSender.send());
        System.out.println("Pretty JSON:\n" + jsonSender.getPrettyJson());


    }

    // метод cycle_for
    private static List<Integer> cycle(int count) {
        List<Integer> listNumbers = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
  //          System.out.println("i = " + i);
            listNumbers.add(i);
 //           if (i % == 0) {
 //               System.out.println("even");
 //           }   else if (i % 2 ==1) {
 //               System.out.println("not-even");
 //           }   else {
 //               System.out.println("odd");
 //           }
 //           String result = (i % 2 == 0) ? "event" : "not-event";
 //           System.out.println(result);
        }
        System.out.println("listNumber = " + listNumbers);

        return listNumbers;
    }
}