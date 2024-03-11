package app;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Provider {
     private List<User> users = new ArrayList<>();

     public void addUser(User user) {
         users.add(user);
     }

     public void processUsers(Consumer<User> consumer) {
         for (User user : users) {
             consumer.accept(user);
         }
     }
 }

