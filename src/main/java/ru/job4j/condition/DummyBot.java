package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl;
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later.";
        } else {
            rsl = "I don't know, Please, ask another question.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Hi");
        System.out.println(rsl);
    }
}