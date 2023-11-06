//Abhizeet Bomma
//Test cases provided by Sruti

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionSet {

  // Unique id for each QuestionSet
  private String setID;

  // Name of the question set
  private String name;

  // Description providing details
  private String description;

  // List to store QuestionObj objects
  private ArrayList<QuestionObj> questions;

  /*
  Constructor to initialize attributes
  Generate random ID, set default name and description
  Initialize empty questions list
  */
  public QuestionSet() {
    this.setID = generateID();
    this.name = "Unnamed Question Set";
    this.description = "No Description";
    this.questions = new ArrayList<QuestionObj>();
  }

  // Generate random id as placeholder
  private String generateID() {
    return "" + (int)(Math.random() * 10000);
  }

  /*
  Create new question set
  Update name and description
  */
  public void createQuestionSet(String name, String desc) {
    this.name = name;
    this.description = desc;
  }

  // View details of question set
  public void viewSet() {
    // Print name, description and questions
  }

  // Getter methods
  public String getSetID() {
    return setID; 
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public ArrayList<QuestionObj> getQuestions() {
    return questions;
  }

  // Add new question 
  public void addQuestion(QuestionObj q) {
    questions.add(q);
  }

  // TEST CASES

  // Test case 1: Create new question set
  // Tests whether users can create a new question set by entering the name and the description
  @Test
  public void testCreateQuestionSet() {

    Scanner scanner = new Scanner(System.in);

    // User input for new set's name and description
    System.out.print("Enter name: ");
    String name = scanner.nextLine();

    System.out.print("Enter description: ");
    String desc = scanner.nextLine();

    QuestionSet set = new QuestionSet();
    set.createQuestionSet(name, desc);

    // Verify name and description updated
    assertEquals(name, set.getName()); 
    assertEquals(desc, set.getDescription());

  }

  // Test case 2: Add new question
  // Tests whether the user can add a new question to a question set
  @Test
  public void testAddQuestion() {

    QuestionSet set = new QuestionSet();
    
    // Create new QuestionObj
    QuestionObj q1 = new QuestionObj();
    q1.setQuestion("Filler");
    q1.setAnswer("Filler");

    // Add question
    set.addQuestion(q1);

    // Verify question added
    assertEquals(1, set.getQuestions().size());
    assertEquals(q1, set.getQuestions().get(0));

  }

}

// QuestionObj class
class QuestionObj {

  private String question;
  private String answer;

  // Getters and setters 

}
