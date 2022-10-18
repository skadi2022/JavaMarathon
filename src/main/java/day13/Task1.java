package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Ivan");
        User u2 = new User("Anna");
        User u3 = new User("Marina");

//        u1.subscribe(u2);                               //u1 подписался на u2
//        u2.subscribe(u1);                               //u2 подписался на u1
//
//        System.out.println(u1.isSubscribed(u2));        //подписан ли u1 на u2?
//        System.out.println(u1.getSubscriptions());      //список подписок u1
//
//        System.out.println(u2.isSubscribed(u1));        //подписан ли u2 на u1?
//        System.out.println(u2.getSubscriptions());      //список подписок u2
//
//        System.out.println("u1 and u2 are friends? " + u1.isFriend(u2));    //u1 и u2 друзья (взаимная подписка)?

        u1.sendMessage(u2, "u1 -> u2 msg1");        //Отправить 2 сообщения от пользователя 1 пользователю 2
        u1.sendMessage(u2, "u1 -> u2 msg2");

        u2.sendMessage(u1, "u2 -> u1 msg1");        //Отправить 3 сообщения от пользователя 2 пользователю 1
        u2.sendMessage(u1, "u2 -> u1 msg2");
        u2.sendMessage(u1, "u2 -> u1 msg3");

        u3.sendMessage(u1, "u3 -> u1 msg1");        //Отправить 3 сообщения от пользователя 3 пользователю 1
        u3.sendMessage(u1, "u3 -> u1 msg2");
        u3.sendMessage(u1, "u3 -> u1 msg3");

        u1.sendMessage(u3, "u1 -> u3 msg1");        //Отправить 3 сообщения от пользователя 1 пользователю 3
        u1.sendMessage(u3, "u1 -> u3 msg2");
        u1.sendMessage(u3, "u1 -> u3 msg3");

        u3.sendMessage(u1, "u3 -> u1 msg1");        //Отправить 1 сообщение от пользователя 3 пользователю 1

        MessageDatabase.showDialog(u1, u3);
    }
}

