package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class QuestionsAdapter extends RecyclerView.Adapter<QuestionViewHolder> {

    private List<Question> questions;
    private Context context;

    public QuestionsAdapter(List<Question> questions, Context context) {

        this.questions = questions;
        this.context = context;
    }

    @Override
    public  QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_country, parent, false);
        return new QuestionViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.questionCountry.setText(question.getLocation());
        holder.countryQuestion.setText(question.getQuestion());
        holder.countryImage.setImageResource(question.getPhotoId());
        holder.questionAnswer = question.isTrue();
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

}
