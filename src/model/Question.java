/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author thuy
 */
public class Question {
    private int id;
    private String content;
    private ArrayList<Answer> answerList = new ArrayList();
    
    public boolean isMultiChoice() {
        int count = 0;
        for (Answer a: answerList) {
            if (a.isCorrect()) count++;
        }
        return count>1;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(ArrayList<Answer> answerList) {
        this.answerList = answerList;
    }
    
    
}
