package hooks;

import driverfactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    Driverfactory driverfactory= new Driverfactory();

    @Before

   public void openbrowser(){driverfactory.setupbrowser();}

    @After

    public void quite(){driverfactory.teardown();}
}
