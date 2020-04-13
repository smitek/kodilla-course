import java.io.Console;

public class FirstClass {
    public static void main(String[] agrs){
        Notebook notebook = new Notebook(600, 1500, 2020, true);
        System.out.println(notebook.weight + " " + notebook.price+" "+notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.chceckAll();

        Notebook oldNotebook = new Notebook(1200, 1000, 2005, true);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price+" "+oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.chceckAll();

        Notebook heavyNotebook = new Notebook(2000, 500, 2015, true);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price+" "+heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.chceckAll();

        // sprawdzenie roku przestępnego
        LeapYear leap = new LeapYear(2012, false);
        System.out.println();
        leap.checkLeapYear();
}

}