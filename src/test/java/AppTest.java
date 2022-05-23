import com.sparta.jh.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Check that we can return Good Morning!")
    void checkReturnMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }
    @Test
    @DisplayName("Check that we can return Good Afternoon!")
    void checkReturnAfternoon() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(15));
    }
    @Test
    @DisplayName("Check that we can return Good Evening!")
    void checkReturnEvening() {
        Assertions.assertEquals("Good Evening!", App.greeting(22));
    }
    @Test
    @DisplayName("Check if bed time")
    void checkReturnBedTime() {
        Assertions.assertEquals("Go to bed!", App.greeting(2));
    }
    @Test
    @DisplayName("Check that the time is valid")
    void checkReturnValidTime() {
        Assertions.assertEquals("This is not a valid time of day!", App.greeting(-7));
    }
}
