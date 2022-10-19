package day13;

import java.util.Date;

public class Message {
    private User sender;        //отправитель сообщения
    private User receiver;      //получатель сообщения
    private String text;        //текст сообщения
    private Date date;          //дата отправки сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\n" +
                "TO: " + receiver + "\n" +
                "ON: " + date + "\n" +
                text + "\n";
    }
}
