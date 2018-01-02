package com.example.android.americanfootballcounter;

import android.app.ActionBar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] cities = {"Philadelphia", "Dallas", "Washington", "NY", //NFC East
                        "GB", "Minnesota", "Detroit", "Chicago", //NFC North
                        "NO", "Carolina", "Atlanta", "TB", // NFC South
                        "LA", "Seattle", "Arizona", "SF", //NFC West
                        "NE", "Buffalo", "Miami", "NY", //AFC East
                        "Pittsburgh", "Baltimore", "Cincinnati", "Cleveland", //AFC North
                        "Jacksonville", "Tennessee", "Houstan", "Indianapolis", //AFC South
                        "KC", "LA", "Oakland", "Denver"}; //AFC West

    String [] teams = {"Eagles", "Cowboys", "Redskins", "Giants", //NFC East
            "Packers", "Vikings", "Lions", "Bears", //NFC North
            "Saints", "Panthers", "Falcons", "Buccaneers", // NFC South
            "Rams", "Seahawks", "Cardinals", "49ers", //NFC West
            "Patriots", "Bills", "Dolphins", "Jets", //AFC East
            "Steelers", "Ravens", "Bengals", "Browns", //AFC North
            "Jaguars", "Titans", "Texans", "Colts", //AFC South
            "Chiefs", "Chargers", "Raiders", "Broncos"}; //AFC West

    int indexTeamA = -1;
    int indexTeamB = -1;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    // Increase index of Team A
    public void increaseIndexTeamA (View v){
        indexTeamA += 1;
        if (indexTeamA > (cities.length-1)){
            indexTeamA = 0;
        }
        displayTeamA(cities[indexTeamA]);
        displayTeamA2(teams[indexTeamA]);
    }

    // Decrease index for Team A
    public void decreaseIndexTeamA (View v){
        indexTeamA -= 1;
        if (indexTeamA < 0){
            indexTeamA = cities.length-1;
        }
        displayTeamA(cities[indexTeamA]);
        displayTeamA2(teams[indexTeamA]);
    }

    // Increase index for Team B
    public void increaseIndexTeamB (View v){
        indexTeamB += 1;
        if (indexTeamB > (cities.length-1)){
            indexTeamB = 0;
        }
        displayTeamB(cities[indexTeamB]);
        displayTeamB2(teams[indexTeamB]);
    }

    // Decrease index for Team B
    public void decreaseIndexTeamB (View v){
        indexTeamB -= 1;
        if (indexTeamB < 0){
            indexTeamB = cities.length-1;
        }
        displayTeamB(cities[indexTeamB]);
        displayTeamB2(teams[indexTeamB]);
    }

    // Touchdown for Team A
    public void touchdownTeamA (View v) {
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    // Point-after-touchdown for Team A
    public void patTeamA (View v) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    // Fieldgoal for TeamA
    public void fieldgoalTeamA (View v) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    // Two-point-conversion for Team A
    public void tpcTeamA (View v) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    // Safety for Team A
    public void safetyTeamA (View v) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    // Touchdown for Team B
    public void touchdownTeamB (View v) {
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    // Point-after-touchdown for Team B
    public void patTeamB (View v) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }


    // Fieldgoal for Team B
    public void fieldgoalTeamB (View v) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    // Two-point-conversion for Team B
    public void tpcTeamB (View v) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    // Safety for Team B
    public void safetyTeamB (View v) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    // Resets scores to 0
    public void reset (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        indexTeamA = -1;
        indexTeamB = -1;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayTeamA("Team");
        displayTeamB("Team");
        displayTeamA2("A");
        displayTeamB2("B");
    }

    // Displays city Team A
    public void displayTeamA (String i) {
        TextView t = (TextView) findViewById(R.id.teamA);
        t.setText(""+i);
    }

    // Displays city of Team B
    public void displayTeamB (String i) {
        TextView t = (TextView) findViewById(R.id.teamB);
        t.setText(""+i);
    }

    // Displays team name of Team A
    public void displayTeamA2 (String i) {
        TextView t = (TextView) findViewById(R.id.teamA2);
        t.setText(""+i);
    }

    // Displays team name of Team B
    public void displayTeamB2 (String i) {
        TextView t = (TextView) findViewById(R.id.teamB2);
        t.setText(""+i);
    }

    // Displays score for Team A
    public void displayScoreTeamA (int i) {
        TextView t = (TextView) findViewById(R.id.score_teamA);
        t.setText(""+i);
    }

    // Displays score for Team B
    public void displayScoreTeamB (int i) {
        TextView t = (TextView) findViewById(R.id.score_teamB);
        t.setText(""+i);
    }
}
