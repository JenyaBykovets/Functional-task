package app;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider();
        provider.addUser(new User("Alice", "11111111"));
        provider.addUser(new User("Bob", "22222222"));
        provider.addUser(new User("Charlie", "33333333"));
        provider.addUser(new User("David", "44444444"));
        provider.addUser(new User("Eve", "55555555"));

        output((user) -> System.out.println("Name: " + user.getName() + ", Phone: " + user.getPhone()), provider);
    }

    public static void output(Consumer<User> consumer, Provider provider) {
        System.out.println("List:");
        provider.processUsers(consumer);
    }
}

