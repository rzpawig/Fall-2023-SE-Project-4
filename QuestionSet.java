import java.util.ArrayList;

public class QuestionSet {

  private int setID;
  private String name;
  private String description;
  private ArrayList<Question> questions = new ArrayList<>();

  public QuestionSet() {
    this.setID = (int)(Math.random() * 1000000) % 10000;
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

  public void addQuestion() {
    Question question = new Question();
    this.questions.add(question);
  }

  public void removeQuestion(int index) {
    this.questions.remove(index);
  }

  public void viewSet() {
    if (questions.isEmpty()) {
      System.out.println("No questions in set.");
    } else {
      for (int i = 0; i < questions.size(); i++) {
        System.out.println(i+1 + ". Question: " + questions.get(i).getText());
      }
    }
  }
  
  public class Question {
    private String text;
    private String answer;
  
    public Question() {
      this.text = "Unnamed";
      this.answer = "Undefined";
    }

    // getters and setters
  }

  // Test cases

  @Test
  
  public void testUpdateQuestion() {
    QuestionSet set = new QuestionSet();
    set.addQuestion();
    set.viewSet();

    // Update question
    set.questions.get(0).setText("Filler");
    set.questions.get(0).setAnswer("Filler");

    assertEquals("Filler", set.questions.get(0).getText());
    assertEquals("Filler", set.questions.get(0).getAnswer());
  }

  @Test
  
  public void testRemoveQuestion() {
    QuestionSet set = new QuestionSet();
    set.addQuestion();
    set.addQuestion();
   
    assertEquals(2, set.questions.size());

    set.removeQuestion(0);
    assertEquals(1, set.questions.size());
  }

}
