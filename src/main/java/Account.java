//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
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
        return name.length()>=3
                && name.length() <=19
                && !name.startsWith(" ")
                && !name.endsWith(" ")
                && isSingleSpace(name);
    }

    public boolean isSingleSpace(String name){
        int spaces = 0;
        for(char element : name.toCharArray()){
            if (element == ' ')
                spaces++;
        }
        return spaces == 1;
    }
    }