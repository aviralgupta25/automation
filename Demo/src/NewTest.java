import org.testng.annotations.Test;


public class NewTest {

    @Test
    void setup(){
            System.out.println("This is the setup");
        }
    @Test
    void login(){
        System.out.println("This is the login");
    }
    @Test
    void teardown(){
        System.out.println("This is the TearDown");
    }
}

