package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;               //пользователи, на которых подписан пользователь

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe (User user) {                     //подписывает пользователя на user
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {                //true - если пользователь подписан на user и false если нет
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {                    //true - если пользователь user является другом и false если нет
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {       //отправляет сообщение text пользователю
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
