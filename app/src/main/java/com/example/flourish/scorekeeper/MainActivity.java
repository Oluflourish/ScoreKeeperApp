package com.example.flourish.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int goalScoreTeamA = 0;
    int redScoreTeamA = 0;
    int yellowScoreTeamA = 0;

    int goalScoreTeamB = 0;
    int redScoreTeamB = 0;
    int yellowScoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForTeamA(0);
        displayGoalForTeamB(0);
    }

    /**
     * Display the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Display the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_score);
        scoreView.setText(String.valueOf(score));
    }


    /** Reset all Scores */
    public void resetScore (View v) {
        goalScoreTeamA = 0;
        redScoreTeamA = 0;
        yellowScoreTeamA = 0;

        goalScoreTeamB = 0;
        redScoreTeamB = 0;
        yellowScoreTeamB = 0;

        displayGoalForTeamA(goalScoreTeamA);
        displayRedForTeamA(redScoreTeamA);
        displayYellowForTeamA(yellowScoreTeamA);

        displayGoalForTeamB(goalScoreTeamB);
        displayRedForTeamB(redScoreTeamB);
        displayYellowForTeamB(yellowScoreTeamB);

    }


    /* Increment Goal, Red and Yellow scores for team A*/
    public void addGoalForTeamA (View v) {
        goalScoreTeamA++;
        displayGoalForTeamA(goalScoreTeamA);
    }

    public void addRedForTeamA (View v) {
        redScoreTeamA++;
        displayRedForTeamA(redScoreTeamA);
    }

    public void addYellowForTeamA (View v) {
        yellowScoreTeamA++;
        displayYellowForTeamA(yellowScoreTeamA);
    }

    /* Increment Goal, Red and Yellow scores for team B*/
    public void addGoalForTeamB (View v) {
        goalScoreTeamB++;
        displayGoalForTeamB(goalScoreTeamB);
    }

    public void addRedForTeamB (View v) {
        redScoreTeamB++;
        displayRedForTeamB(redScoreTeamB);
    }

    public void addYellowForTeamB (View v) {
        yellowScoreTeamB++;
        displayYellowForTeamB(yellowScoreTeamB);
    }

}
