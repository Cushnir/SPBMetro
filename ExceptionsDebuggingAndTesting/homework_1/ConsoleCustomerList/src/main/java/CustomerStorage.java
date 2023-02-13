import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;
    public static final String regexNumer = "[+]?[7-8]?[0-9]{10}";
    public static final String regexEmail = "[_A-Za-z0-9-]{1,}[@][A-Za-z0-9-]{1,}[.][A-Za-z]{2,}";

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws WrongAmount{
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new WrongAmount("Wrong Format", "incorrect customer details");
        }
        if (components[INDEX_SURNAME].matches(regexEmail)) {
            throw new WrongAmount(components[INDEX_SURNAME], "Wrong format : you didn't enter your last name");
        }
        if (!components[INDEX_PHONE].matches(regexNumer)) {
            throw new WrongAmount(components[INDEX_PHONE], "Wrong namber");
        }
        if (!components[INDEX_EMAIL].matches(regexEmail)) {
            throw new WrongAmount(components[INDEX_EMAIL], "Wrong email");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        System.out.println("Data added");
    }

    public void listCustomers() throws WrongAmount{
        if (storage.isEmpty()) {
            throw new WrongAmount("Error", "the list is empty");
        }
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)  throws WrongAmount{
        if (!storage.containsKey(name)) {
            throw new WrongAmount("Wrong Format", "no such client");
        }
        storage.remove(name);
        System.out.println("client deleted");
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}
