package Vodafon.Backoffice;

import org.testng.annotations.Test;
import Vodafon.TestPattern;

public class BOTest extends TestPattern{

    @Test
    private void BackOfficeCase() throws Exception {
        Login log = new Login();

        log.LogInEnglish("admin","nimda");
    }
}
