import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class test {

    To_do_list list1 = new To_do_list();

    @Test
    void test_to_do_list() {

        list1.add("get groceries");             // add new item

        list1.complete("get groceries");                     // test of deletion from list and add to completed list

        list1.add("go get chickens");           // add new item

        list1.add("feed goats");                 // add new item

        list1.complete("go get chickens");                     // remove from list and add to completed list

        assertEquals(list1.get_from_list(0), "get groceries");

        assertEquals(list1.get_from_list(1), "go get chickens");

        assertEquals(list1.get_from_recently_completed(2), "feed goats");

        assertEquals(list1.get_from_recently_completed(3), "get groceries");

    }

}