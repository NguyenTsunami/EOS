/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import model.Answer;
import model.Question;

/**
 *
 * @author thuy
 */
public class QuestionDAO {
    public ArrayList<Question> getQuestionList() {
        ArrayList<Question> questionList = new ArrayList<>();
        
        Question q1 = new Question();
        q1.setId(1);
        q1.setContent("Who is the most beauty in the school?");
        Answer q1_a1 = new Answer();
        q1_a1.setContent("Tsunami");
        q1_a1.setCorrect(true);
        q1.getAnswerList().add(q1_a1);
        Answer q1_a2 = new Answer();
        q1_a2.setContent("Paper Paperr");
        q1_a2.setCorrect(false);
        q1.getAnswerList().add(q1_a2);
        Answer q1_a3 = new Answer();
        q1_a3.setContent("Jewel");
        q1_a3.setCorrect(false);
        q1.getAnswerList().add(q1_a3);
        questionList.add(q1);
        
        Question q2 = new Question();
        q2.setId(2);
        q2.setContent("Do you love me?");
        Answer q2_a1 = new Answer();
        q2_a1.setContent("Yes");
        q2_a1.setCorrect(true);
        q2.getAnswerList().add(q2_a1);
        Answer q2_a2 = new Answer();
        q2_a2.setContent("Can't say no");
        q2_a2.setCorrect(true);
        q2.getAnswerList().add(q2_a2);
        questionList.add(q2);
        
        Question q3 = new Question();
        q3.setId(3);
        q3.setContent("What is my favorite animals?");
        Answer q3_a1 = new Answer();
        q3_a1.setContent("Cat");
        q3_a1.setCorrect(true);
        q3.getAnswerList().add(q3_a1);
        Answer q3_a2 = new Answer();
        q3_a2.setContent("Dog");
        q3_a2.setCorrect(true);
        q3.getAnswerList().add(q3_a2);
        Answer q3_a3 = new Answer();
        q3_a3.setContent("Fish");
        q3_a3.setCorrect(false);
        q3.getAnswerList().add(q3_a3);
        Answer q3_a4 = new Answer();
        q3_a4.setContent("Bird");
        q3_a4.setCorrect(false);
        q3.getAnswerList().add(q3_a4);
        Answer q3_a5 = new Answer();
        q3_a5.setContent("Snake");
        q3_a5.setCorrect(false);
        q3.getAnswerList().add(q3_a5);
        questionList.add(q3);
        
        Question q4 = new Question();
        q4.setId(4);
        q4.setContent("Things I love the most in my life?");
        Answer q4_a1 = new Answer();
        q4_a1.setContent("Cat");
        q4_a1.setCorrect(false);
        q4.getAnswerList().add(q4_a1);
        Answer q4_a2 = new Answer();
        q4_a2.setContent("Food");
        q4_a2.setCorrect(false);
        q4.getAnswerList().add(q4_a2);
        Answer q4_a3 = new Answer();
        q4_a3.setContent("Clothes");
        q4_a3.setCorrect(false);
        q4.getAnswerList().add(q4_a3);
        Answer q4_a4 = new Answer();
        q4_a4.setContent("You");
        q4_a4.setCorrect(true);
        q4.getAnswerList().add(q4_a4);
        questionList.add(q4);
        
        Question q5 = new Question();
        q5.setId(5);
        q5.setContent("Who is the girl I dont want you stand too close to?");
        Answer q5_a1 = new Answer();
        q5_a1.setContent("Paper Paperr");
        q5_a1.setCorrect(false);
        q5.getAnswerList().add(q5_a1);
        Answer q5_a2 = new Answer();
        q5_a2.setContent("Jewel");
        q5_a2.setCorrect(false);
        q5.getAnswerList().add(q5_a2);
        Answer q5_a3 = new Answer();
        q5_a3.setContent("Giang Giangg");
        q5_a3.setCorrect(false);
        q5.getAnswerList().add(q5_a3);
        Answer q5_a4 = new Answer();
        q5_a4.setContent("All the girls in the world except your mom and my mom");
        q5_a4.setCorrect(true);
        q5.getAnswerList().add(q5_a4);
        questionList.add(q5);
        
        Question q6 = new Question();
        q6.setId(6);
        q6.setContent("Which food I can cook?");
        Answer q6_a1 = new Answer();
        q6_a1.setContent("canh su hào");
        q6_a1.setCorrect(true);
        q6.getAnswerList().add(q6_a1);
        Answer q6_a2 = new Answer();
        q6_a2.setContent("thịt chiên xù");
        q6_a2.setCorrect(true);
        q6.getAnswerList().add(q6_a2);
        Answer q6_a3 = new Answer();
        q6_a3.setContent("cá hồi sốt cà chua");
        q6_a3.setCorrect(true);
        q6.getAnswerList().add(q6_a3);
        Answer q6_a4 = new Answer();
        q6_a4.setContent("canh cua");
        q6_a4.setCorrect(true);
        q6.getAnswerList().add(q6_a4);
        Answer q6_a5 = new Answer();
        q6_a5.setContent("cháo lưỡi");
        q6_a5.setCorrect(true);
        q6.getAnswerList().add(q6_a5);
        questionList.add(q6);
        
        return questionList;
    }
}
