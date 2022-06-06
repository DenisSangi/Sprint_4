import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
public class AccountTest {

    @Test
    @DisplayName("Checking correct name")
    @Description("Basic positive test")
    public void correctNameTest(){
        Account account = new Account("Denis Sangi");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Checking short name")
    @Description("Basic negative test when name.length() < 3")
    public void toShortNameTest(){
        Account account = new Account("qw");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Checking long name")
    @Description("Basic negative test when name.length() > 19")
    public void toLongNameTest(){
        Account account = new Account("qwhuifhn8723y80ijrnfuhywg67dfwcsvasf");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Checking if space is a first symbol")
    @Description("Basic negative test when name starts with space")
    public void nameStartsWithSpaceTest(){
        Account account = new Account(" qwewd");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Checking if space is a last symbol")
    @Description("Basic negative test when name ends with space")
    public void nameEndsWithSpaceTest(){
        Account account = new Account("qw23 ");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Checking if there is no space")
    @Description("Basic negative test when name didn't includes any space")
    public void nameWithoutSpaceTest(){
        Account account = new Account("qwewqdwfwe");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse(actual);
    }

}