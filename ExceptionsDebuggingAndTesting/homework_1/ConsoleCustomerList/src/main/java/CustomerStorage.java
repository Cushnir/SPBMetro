import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;
    public static final String regexNumer = "[+]?[7-8]?[0-9]{10}";
    public static final String regexEmail = "[_A-Za-z0-9-]{1,}[@][A-Za-z0-9-]{1,}[.][A-Za-z]{2,}";

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws IllegalArgumentException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            System.out.println("Wrong Format");
            throw new IllegalArgumentException();
        }
        if (components[INDEX_SURNAME].matches(regexEmail)) {
            System.out.println("Wrong format : you didn't enter your last name");
            throw new IllegalArgumentException();
        }
        if (!components[INDEX_PHONE].matches(regexNumer)) {
            System.out.println("Wrong namber");
            throw new IllegalArgumentException();
        }
        if (!components[INDEX_EMAIL].matches(regexEmail)) {
            System.out.println("Wrong email");
            throw new IllegalArgumentException();
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        System.out.println("Data added");
    }

    public void listCustomers() {
        if (storage.isEmpty()) {
            System.out.println("the list is empty");
        }
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) throws IllegalArgumentException {
        if (!storage.equals(name)) {
            System.out.println("no such client");
            throw new IllegalArgumentException();
        }
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}
