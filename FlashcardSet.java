import java.util.*;
// class written by Roj

public class FlashcardSet { // class that maintains a set of flashcards user creates/uses/owns

    int setID; // unique id for database
    String name; // name of set
    String description; // description of set
    ArrayList<Flashcard> setList = new ArrayList<>(); // arraylist of individual flashcards in set

    public FlashcardSet() {
        this.setID = (int) (Math.random() * 1000000) % 10000; // (placeholder assignment --> final product will ensure a unique id)
        this.name = "Unnamed Set";
        this.description = "No description";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSetID() {
        return setID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addFlashcard() {
        Flashcard card = new Flashcard();
        this.setList.add(card);
    }

    public void removeFlashcard(int index) {
        this.setList.remove(index);
    }

    public void viewSet() {
        if (setList.isEmpty())
            System.out.println("No flashcards are currently in set.");
        else
        {
            for (int i = 0; i < setList.size(); i++)
            {
                System.out.print(i + 1);
                System.out.println(". Term: " + setList.get(i).getTerm() + " | Definition: " + setList.get(i).getDefinition() + "\n");
            }
        }
    }
    public static class Flashcard { // class for individual flashcard

        String term;
        String definition;

        public Flashcard() {
            this.term = "Unnamed";
            this.definition = "Undefined";
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public String getTerm() {
            return term;
        }

        public String getDefinition() {
            return definition;
        }
    }


    /*
    Test case one (Gaurav): Updating a flashcard by
    When creating a new flashcard, the term and definition are defaulted to unnamed/undefined.
    Users should be able to update the flashcard.
    Output should correctly correspond to what user inputted.
    Updating a flashcard is only possible if set has existing flashcards, denying users the option if set is empty.
     */

    /*
    Test case two (Gaurav): Removing a flashcard by
    Removing a flashcard is only possible if set has existing flashcards, denying users the option if set is empty.
    Users should be able to remove a flashcard based on the card number.
    Set should be updated correctly based on the user's choice.
     */

    // testing FlashcardSet & Flashcard classes
    public static void main(String[] args) {
        System.out.println("Creating a flashcard set...\n");
        FlashcardSet testSet = new FlashcardSet(); // creating a set object

        Scanner in = new Scanner(System.in); // scanner for user input testing

        loop: while (true) // loop of options
        {
            System.out.println("1. Update set description");
            System.out.println("2. Update set name");
            System.out.println("3. Add a flashcard");
            System.out.println("4. Update a flashcard");
            System.out.println("5. View all cards");
            System.out.println("6. View set details");
            System.out.println("7. Remove a flashcard");
            System.out.println("8. Exit");

            int choice = in.nextInt();

            switch (choice)
            {
                case 1: // user types a description and should update the set's description
                    System.out.println("Type a description: ");
                    in.useDelimiter("\\n");
                    String description = in.next();
                    testSet.setDescription(description);
                    break;
                case 2: // user types a name and should update the set's name
                    System.out.println("Type a name: ");
                    in.useDelimiter("\\n");
                    String name = in.next();
                    testSet.setName(name);
                    break;
                case 3: // adds an undefined flashcard to the set
                    System.out.println("Adding flashcard...\n");
                    testSet.addFlashcard();
                    break;
                case 4: // user chooses to update a flashcard's term and definition
                    if (testSet.setList.isEmpty()) // checks if set is empty
                        System.out.println("Set has no flashcards...\n");
                    else
                    {
                        testSet.viewSet();
                        System.out.println("\nWhich flashcard to update?");
                        int cardNum = in.nextInt();
                        while (cardNum > testSet.setList.size() || cardNum <= 0) // checks if user types valid card number
                        {
                            System.out.println("Not a valid flashcard. Try again.\n");
                            cardNum = in.nextInt();
                        }

                        System.out.println("Type a term: ");
                        in.useDelimiter("\\n");
                        String term = in.next();
                        testSet.setList.get(cardNum-1).setTerm(term);

                        System.out.println("Type a definition: ");
                        in.useDelimiter("\\n");
                        String definition = in.next();
                        testSet.setList.get(cardNum-1).setDefinition(definition);
                    }
                    break;
                case 5: // outputs all flashcards (terms and definitions) if any exists
                    testSet.viewSet();
                    break;
                case 6: // outputs the set's name and description
                    System.out.println("Set name: " + testSet.getName());
                    System.out.println("Set description: " + testSet.getDescription());
                    System.out.println();
                    break;
                case 7: // user chooses to remove a flashcard
                    if (testSet.setList.isEmpty()) // checks if set is empty
                        System.out.println("Set has no flashcards...\n");
                    else {
                        testSet.viewSet();
                        System.out.println("\nWhich flashcard to remove?");
                        int cardNum = in.nextInt();
                        while (cardNum > testSet.setList.size() || cardNum <= 0) { // checks if user inputs a valid card number
                            System.out.println("Not a valid flashcard. Try again.\n");
                            cardNum = in.nextInt();
                        }
                        testSet.removeFlashcard(cardNum-1);
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break loop;
                default: // when user inputs a wrong choice
                    System.out.println("Not an option. Try again.\n");
            }

        }

    }

}
