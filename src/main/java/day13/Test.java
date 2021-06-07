package day13;


public class Test {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Tom");
        User user3 = new User("Jack");

        user1.sendMessage(user2, "Hello" + user2.getUsername());
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello " + user1.getUsername());
        user2.sendMessage(user1, "I'm all good");
        user2.sendMessage(user1, "How are you?");

        user3.sendMessage(user1, "Hello " + user1.getUsername());
        user3.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "let's go to the movies");

        user1.sendMessage(user3, "Hello " + user3.getUsername());
        user1.sendMessage(user3, "I'm all good");
        user1.sendMessage(user3, "I can't go to the movies today");

        user3.sendMessage(user1, "Then we'll go to the movies tomorrow");

        //System.out.println(MessageDatabase.getMessages());
        MessageDatabase.showDialog(user1, user3);
    }
}
