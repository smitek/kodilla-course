public class User {
    public String userName;
    public int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public static void main(String[] args) {
        User tomek = new User("Tomek", 31);
        User bartek = new User("Bartek", 18);
        User magda = new User("Magda", 19);
        User szymon = new User("Szymon", 6);
        User karol = new User("Karol", 3);
        User[] users = {tomek, bartek, magda, szymon, karol};

        int result = 0;
        for (int i=0; i<5; i++){
            result = result + users[i].age;

        }
        int avg = result / users.length;

        /*jeżeli wiek usera jest mniejszy od średniej wyświetl
                users[0].age<avg ----- w for
       */


//Sring[] User = new String[] {"SA", "DF", "LL"};
    }
}
