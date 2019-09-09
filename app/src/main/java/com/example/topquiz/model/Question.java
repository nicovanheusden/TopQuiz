package com.example.topquiz.model;

import java.util.List;

/**
 * Created by Nicolas Van Heusden on 2019-09-09.
 */
public class Question {

    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public Question(String question, List<String> choiceList, int answerIndex) {
        mQuestion = setQuestion(question);
        mChoiceList = setChoiceList(choiceList);
        mAnswerIndex = setAnswerIndex(answerIndex);
    }

    public String getQuestion() {
        return mQuestion;
    }

    public String setQuestion(String question) {
        if (!question.isEmpty()){
            mQuestion = question;
        }
        return mQuestion;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public List<String> setChoiceList(List<String> choiceList) {
        if (choiceList.size() == 3){
            mChoiceList = choiceList;
        }
        return mChoiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public int setAnswerIndex(int answerIndex) {

        if(answerIndex >= 0 || answerIndex <= 3 ){
            mAnswerIndex = answerIndex;
        }
        return mAnswerIndex;
    }
}
