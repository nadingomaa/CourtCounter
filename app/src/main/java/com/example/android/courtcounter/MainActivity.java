package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0,scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



   private void display(int score1,int score2){
       TextView scoreTeam1=findViewById(R.id.scoreTeam1);
        TextView scoreTeam2=findViewById(R.id.scoreTeam2);
        scoreTeam1.setText(""+score1);
        scoreTeam2.setText(""+score2);
    }

    public void increase2PointsTeamA(View view) {
        scoreTeamA=scoreTeamA+2;
        display(scoreTeamA,scoreTeamB);
    }
    public void increase2PointTeamB(View view) {
        scoreTeamB=scoreTeamB+2;
        display(scoreTeamA,scoreTeamB);
    }

    public void increase3PointTeamA(View view) {
        scoreTeamA=scoreTeamA+3;
        display(scoreTeamA,scoreTeamB);
    }
    public void increase3PointTeamB(View view) {
        scoreTeamB=scoreTeamB+3;
      display(scoreTeamA,scoreTeamB);
    }
    public void freeThrowTeamA(View view) {
        scoreTeamA=scoreTeamA+1;
        display(scoreTeamA,scoreTeamB);
    }
    public void freeThrowTeamB(View view) {
        scoreTeamB=scoreTeamB+1;
       display(scoreTeamA,scoreTeamB);
    }
    public void reset(View view) {
        scoreTeamB=0;
        scoreTeamA=0;
        display(scoreTeamA,scoreTeamB);

    }

}
