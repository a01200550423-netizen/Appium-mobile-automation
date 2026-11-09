import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class view_tests extends Baseclass {
    Homepage myhomepage;
    views myview_page;
    drag_drop my_drag_drop;


    @BeforeMethod
    public void precondition_view(){
        myhomepage =  new Homepage(mydriver);
        myhomepage.click_one_element(11);
        myview_page =  new views(mydriver);
        myview_page.click_one_view(7);
        my_drag_drop = new drag_drop(mydriver);


    }

    @Test
    public void testdrag(){
        my_drag_drop.drag_drop_test();
    }
}
