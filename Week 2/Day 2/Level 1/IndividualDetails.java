//Create a class Individual to show the person details
class Individual {

    //Create instance variables fullName, yearsOld, and stature to store values
    String fullName;
    int yearsOld;
    double stature;

    //Default Constructor
    public Individual() {
        fullName = "Aman Sharma";
        yearsOld = 32;
        stature = 5.6;
    }

    //Clone Constructor
    public Individual(Individual existingIndividual) {
        this.fullName = existingIndividual.fullName;
        this.yearsOld = existingIndividual.yearsOld;
        this.stature = existingIndividual.stature;
    }

    //Create a method showInfo to show the details
    public void showInfo() {
        //Print the result
        System.out.println("Individual Name: " + fullName + "\nIndividual's Age: " + yearsOld + "\nIndividual's Height: " + stature);
    }
}

public class IndividualDetails {
    public static void main(String[] args) {

        //Create an object of the Individual class
        Individual detailsObj1 = new Individual();

        //Create another object for clone constructor
        Individual detailsObj2 = new Individual(detailsObj1);

        //Print the result using detailsObj1
        detailsObj1.showInfo();

        System.out.println("\nUsing Clone Constructor: ");

        //Print the result using detailsObj2
        detailsObj2.showInfo();
    }
}
