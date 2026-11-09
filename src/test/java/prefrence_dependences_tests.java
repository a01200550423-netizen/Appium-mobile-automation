import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prefrence_dependences_tests  extends Baseclass{
    Homepage myhomepage;
    Preference myprefrencepage;
    prerefrence_dependenses my_prerefrence_dependenses;

    @BeforeMethod
    public void precondition(){
        myhomepage =  new Homepage(mydriver);
        myhomepage.click_one_element(9);
        myprefrencepage =  new Preference(mydriver);
        myprefrencepage.click_one_prrefrence(2);
        my_prerefrence_dependenses =  new prerefrence_dependenses(mydriver);

    }

    @Test
    public void  add_wifi_setting(){
        my_prerefrence_dependenses.click_checkbox();
        my_prerefrence_dependenses.click_wifi_setting();
        my_prerefrence_dependenses.send_data("vodafone");
        my_prerefrence_dependenses.click_okay();
    }
}
