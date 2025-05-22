import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressBook {
    ArrayList persons;
    public AddressBook(){
        persons=new ArrayList();
        loadPersons();
    }

    public void loadPersons(){
        String name, address, phone;
        String[] tokens = null;
        try{
            FileReader fr = new FileReader("src/FileReadingProject/input.txt");
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();

            while(s!=null){
                tokens = s.split(",");
                name = tokens[0];
                address = tokens[1];
                phone = tokens[2];

                Person person = new Person(name,address,phone);
                persons.add(person);

                s = br.readLine();
            }

            fr.close();
            br.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public void savePersons(){
        try{
            FileWriter fw = new FileWriter("src/FileReadingProject/input.txt");
            PrintWriter pw = new PrintWriter(fw);
            String s = "";
            for(int i=0; i<persons.size(); i++)
            {
                Person person = (Person) persons.get(i);
                s = person.getName()+","+person.getAddress()+","+person.getMobile();
                pw.println(s);
            }

            pw.close();
            fw.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void addPerson(){
        String name = JOptionPane.showInputDialog("Enter name of person: ");
        String address = JOptionPane.showInputDialog("Enter address: ");
        String mobile = JOptionPane.showInputDialog("Enter mobile number: ");

        Person p = new Person(name, address, mobile);
        persons.add(p);
    }
    public void searchPerson(String name){
        for(int i=0; i<persons.size(); i++){
            Person personInfo = (Person) persons.get(i);
            if(name.equals(personInfo.getName())){
                personInfo.displayInfo();
            }
        }
    }
    public void removePerson(String name){
        for(int i=0; i<persons.size(); i++){
            Person personInfo = (Person) persons.get(i);
            if(name.equals(personInfo.getName())){
                persons.remove(i);
            }
        }
    }
}
