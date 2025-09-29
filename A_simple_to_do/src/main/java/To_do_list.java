import java.util.ArrayList;

public class To_do_list {

    private ArrayList<String> action_list = new ArrayList<String>();                    // main data structure
    private ArrayList<String> recently_completed = new ArrayList<String>();             // main data structure


    public To_do_list() {};

    public To_do_list (ArrayList<String> list) {action_list = list;}


    public void add(String action) {

        try {
            action_list.add(action);
            System.out.println("Added task: " + action);

        } catch (IllegalArgumentException e) {System.out.println("Error: " + e.getMessage());}

        for (String s : action_list) {

            if (action == s) System.out.println("you have added a duplicate item \n");
        }
    }

    public void complete(int position) {

        action_list.remove(position);
        recently_completed.add(action_list.get(position));
    }

    public void complete(String action) {

        try {
            action_list.add(action);
            System.out.println("Added task: " + action);

        } catch (IllegalArgumentException e) {System.out.println("Error: " + e.getMessage());}

        for (int i = 0; i < action_list.size(); i++) {

            if (action == action_list.get(i)) {

                action_list.remove(i);
                recently_completed.add(action_list.get(i));
            }
        }
    }

    public String get_from_list(int i) {return action_list.get(i);}

    public String get_from_recently_completed (int i) {return recently_completed.get(i);}

    public int search (String id) {

        for(String i : action_list) { if (i.equals(id)) return action_list.indexOf(i); }

        return -1;
    }

    public void clear() {

        if (action_list.isEmpty()) System.out.println("Nothing to clear");
        if (recently_completed.isEmpty()) System.out.println("Nothing to clear");

        for (String i : action_list) { action_list.remove(i); }
        for (String i : recently_completed) { action_list.remove(i); }
    }

    public void complete () {

        if (action_list.isEmpty()) {System.out.println("No tasks to display.");}

        else {

            for (int i = 0; i < action_list.size(); i++) {

                System.out.println((i + 1) + ". " + action_list.get(i));
            }
        }
    }

    public void incomplete () {

        if (recently_completed.isEmpty()) {System.out.println("No completed tasks to display.");}

        else {

            for (int i = 0; i < action_list.size(); i++) {

                System.out.println((i + 1) + ". " + recently_completed.get(i));
            }
        }
    }

    public void all() {

        complete();
        incomplete();
    }

}