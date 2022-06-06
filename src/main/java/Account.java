import lombok.Data;

//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
@Data
public class Account {

    private final String name;

    public Account(String name ) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return !(name.length() < 3) && !(name.length() > 19) && name.contains(" ") && !(name.startsWith(" ") && !(name.endsWith(" ")));
    }

    public boolean onlyOneSpace(String input, String subStr) {
        return input.indexOf(subStr) == input.lastIndexOf(subStr);
    }

    }