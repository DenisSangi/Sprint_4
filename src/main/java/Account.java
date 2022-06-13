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
        if (name.length() > 2 && name.length() <= 19)  if (isSingleSpace(name)) return true;
        return false;
    }

    public boolean isSingleSpace(String name){
        int spaces = 0;
        for(char element : name.toCharArray()){
            if (element == ' ')
                spaces++;
        }
        if (name.startsWith(" ")) {return false;}
        else if (name.endsWith(" ")) {return false;}
        else if (spaces == 1) {return true;}
        return false;
    }
    }