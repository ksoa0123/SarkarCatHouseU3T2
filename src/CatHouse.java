
public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    // MODIFY this so that the OLDEST Cat always introduces
    // themselves first!  If they have the same age, have them
    // introduce themselves alphabetically; if they have the same name AND
    // same age, then have cat1 go first
    public void rollCall() {
        if (cat1.getAge() > cat2.getAge()){ //When cat 1 is older than cat 2
            cat1.introduce();
            cat2.introduce();
        }
        else if (cat1.getAge() < cat2.getAge()){ //When cat 2 is older
            cat2.introduce();
            cat1.introduce();
        }

        else{ //When they are the same age
            String cat1Name = cat1.getName();
            String cat2Name = cat2.getName();

            if (cat1Name.compareTo(cat2Name) <= 0){ //compareTo() used to compare alphabetically
                cat1.introduce();
                cat2.introduce();
            }
            else{ //Otherwise it means cat2 comes before cat1 alpabetically
                cat2.introduce();
                cat1.introduce();
            }
        }
    }

    // IMPLEMENT this method!
    // this method causes each cat to speak by printing
    // each Cat's returned "speak()" string to the console
    public void catNoise() {
        System.out.println(cat1.speak());
        System.out.println(cat2.speak());
    }

    // MODIFY this so that it returns a string with each Cat's AGE next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String houseInfo() {
        String str = String.format("Welcome to %s's Cat House \n Cat's 1 Name: %s, Age: %s \n Cat 2's Name: %s, Age: %s", owner, cat1.getName(), cat1.getAge(), cat2.getName(), cat2.getAge());
        return str;
    }
}
