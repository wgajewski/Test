package Vodafon.Backoffice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Vodafon.TestPattern;

class BO extends TestPattern{




    @Test
    private void BackOfficeCase() throws Exception {
        Login log = new Login();

        log.LogInEnglish("admin","nimda");
    }
}
