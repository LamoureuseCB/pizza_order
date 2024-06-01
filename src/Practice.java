import java.util.HashMap;
import java.util.Map;

public class Practice {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practice pizzeria = new Practice();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        if (orders.containsKey(clientName)) {
            orders.put(clientName, orders.get(clientName) + 1);
        } else {
            orders.put(clientName, 1);
        }
    }

    private void printStatistics() {
        int count = 0;
        for (Map.Entry<String, Integer> order : orders.entrySet()) {
            System.out.println("Заказов от " + order.getKey() + ": " + order.getValue());
            count += order.getValue();
        }
        System.out.println();
        System.out.println("Всего заказов: " + count);
    }
}