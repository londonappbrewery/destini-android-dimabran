package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button ans1Button;
    Button ans2Button;
    TextView storyTextView;
    int mIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        ans1Button = findViewById(R.id.buttonTop);
        ans2Button = findViewById(R.id.buttonBottom);
        storyTextView = findViewById(R.id.storyTextView);
        mIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        ans1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    ans1Button.setText(R.string.T3_Ans1);
                    ans2Button.setText(R.string.T3_Ans2);
                    mIndex = 3;
                } else if (mIndex == 3) {
                    storyTextView.setText(R.string.T6_End);
                    ans1Button.setVisibility(View.INVISIBLE);
                    ans2Button.setVisibility(View.INVISIBLE);
                    mIndex = 6;
                } else if (mIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);
                    ans1Button.setText(R.string.T3_Ans1);
                    ans2Button.setText(R.string.T3_Ans2);
                    mIndex = 3;
                } else if (mIndex == 4) {
                    storyTextView.setText(R.string.T6_End);
                    ans1Button.setVisibility(View.INVISIBLE);
                    ans2Button.setVisibility(View.INVISIBLE);
                    mIndex = 6;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        ans2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    ans1Button.setText(R.string.T2_Ans1);
                    ans2Button.setText(R.string.T2_Ans2);
                    mIndex = 2;
                } else if (mIndex == 2) {
                    storyTextView.setText(R.string.T4_End);
                    ans1Button.setVisibility(View.INVISIBLE);
                    ans2Button.setVisibility(View.INVISIBLE);
                    mIndex = 4;
                } else if (mIndex == 3) {
                    storyTextView.setText(R.string.T5_End);
                    ans1Button.setVisibility(View.INVISIBLE);
                    ans2Button.setVisibility(View.INVISIBLE);
                    mIndex = 5;
                }
            }
        });

    }
}
