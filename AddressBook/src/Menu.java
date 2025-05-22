import javax.swing.*;

public class Menu {
    public static void main(String[] args){
        AddressBook add = new AddressBook();
        while(true){
            String input = JOptionPane.showInputDialog("Enter 1 to Add \nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Quit");
            char in = input.charAt(0);
            switch (in){
                case'1':
                    add.addPerson();
                    break;
                case'2':
                    String name = JOptionPane.showInputDialog(null, "Enter person name to search: ");
                    add.searchPerson(name);
                    break;
                case'3':
                    String name1 = JOptionPane.showInputDialog(null, "Enter person name to delete: ");
                    add.removePerson(name1);
                    break;
                case'4':
                    add.savePersons();
                    System.exit(0);
            }
        }
    }
}
