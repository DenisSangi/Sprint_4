import org.jetbrains.annotations.Contract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Contract(value = " -> new", pure = true)
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
        {"Denis Sangi", true},
        {"Basic negative test when name.length() < 3", false},
        {"qwhuifhn8723y80ij rnfuhywg67dfwcsvasf", false},
        {" qwewd", false},
        {"qxw23 ", false},
        {"qwewqdwfwe", false},
        {"Denis Sangi", true},
        {"Denis San gi", false},
        {"Denis Sangi12345678", true},
        {"D S", true},
        {"", false},
        };
    }

    @Test
    public void isNamePrintable(){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}