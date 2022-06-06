//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() < 3) {
            System.out.println("To short");
            return false;
        } else if (name.length() > 19) {
            System.out.println("To long");
            return false;
        } else if (name.startsWith(" ")) {
            System.out.println("Starts with space");
            return false;
        } else if (name.endsWith(" ")) {
            System.out.println("Ends with space");
            return false;
        } else if (name.contains(" ")) {
            return true;
        }
        return false;
    }
    }