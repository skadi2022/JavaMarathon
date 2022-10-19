package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();              //условная “база данных”, которая хранит все сообщения в соц. сети

    public static void addNewMessage(User u1, User u2, String text) {       //“отправляет” новое сообщение от u1 пользователю u2 с текстом text (добавляет сообщения в нашу “базу данных”)
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {             //возвращает список всех сообщений в “базе данных”
        return messages;
    }

    public static void showDialog(User u1, User u2) {       //этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2

        for (Message message : messages) {
            if (u1.equals(message.getSender()) && u2.equals(message.getReceiver()) || u2.equals(message.getSender()) && u1.equals(message.getReceiver()))

//            if (message.getSender() == u1 && message.getReceiver() == u2
//            || message.getSender() == u2 && message.getReceiver() == u1);

                System.out.println(message.getSender() + ": " + message.getText());
        }
    }
}
