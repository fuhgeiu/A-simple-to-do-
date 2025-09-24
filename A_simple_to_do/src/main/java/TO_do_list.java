import java.util.ArrayList;

public class TO_do_list {

    ArrayList<String> action_list = new ArrayList<String>();                    // main data structure
    ArrayList<String> recently_completed = new ArrayList<String>();             // main data structure


    public TO_do_list() {};

    public TO_do_list (ArrayList<String> list) {action_list = list;}


    public void add(String action) {


        action_list.add(action);

    }

    public void completed(int position) {

        action_list.remove(position);
        recently_completed.add(action_list.get(position));
    }

    public String get(int i) {return action_list.get(i);}

    public int search (String id) {

        for(String i : action_list) { if (i.equals(id)) return action_list.indexOf(i); }

        return -1;
    }

    public void clear() {

        for (String i : action_list) { action_list.remove(i); }
    }

















}