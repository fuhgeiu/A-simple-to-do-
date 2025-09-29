

public class main {

    public static void main(String[] args) {

        /*
            create new user

            loop {

                display current list and give options

                get user choice

                get user input and modify user data

            }

         */

        Interface new_user_interface = new Interface();                     // create new interface

        To_do_list new_user_list = new To_do_list();                        // new user data

        new_user_list.add("Buy milk");
        new_user_list.add("Buy eggs");
        new_user_list.add("Prepare a lesson for CSC 122");
        new_user_list.add("Sow beet seeds");

        new_user_list.complete("Buy eggs");

        // Pretty prints a list of each of the four tasks above
        new_user_list.all();

        // Pretty prints the task "Buy eggs"
        new_user_list.complete("buy milk");

        // Pretty prints the tasks "Buy milk",
        // "Prepare a lesson for CSC 122", and "Sow beet seeds"
        new_user_list.complete("");

        // Clears the to-do list
        new_user_list.clear();

        // Pretty prints a message saying that the list is empty
        new_user_list.all();



//        while () {
//
//            // display current list and recently removed list and options
//
//            // prompt for user input
//
//            // choices
//
//            // execute choices
//
//
//        }

    }



}