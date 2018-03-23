package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class QuestionViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image);

        /*cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                int messageResId = 0;
                boolean answerIsTrue = questionCountry[].isAnswerTrue();

                if(answerIsTrue){

                    messageResId = R.string.true_toast;
                }
                else{
                    messageResId = R.string.false_toast;
                }

                Toast.makeText(context, questionCountry.getHint(), Toast.LENGTH_SHORT).show();
            }

        });

    }*/
    }
}