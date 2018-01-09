package ke.co.sombo.apps.scores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetAll(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    public void threePointsTeamA(View view) {
        scoreTeamA += 3;
        displayTeamA(scoreTeamA);
    }

    public void threePointsTeamB(View view) {
        scoreTeamB += 3;
        displayTeamB(scoreTeamB);
    }

    public void twoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayTeamA(scoreTeamA);
    }

    public void twoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayTeamB(scoreTeamB);
    }

    public void onePointTeamA(View view) {
        scoreTeamA += 1;
        displayTeamA(scoreTeamA);
    }

    public void onePointTeamB(View view) {
        scoreTeamB += 1;
        displayTeamB(scoreTeamB);
    }

    public void displayTeamA(int score){
        TextView textView = findViewById(R.id.score_team_a);
        textView.setText(String.valueOf(score));
    }

    public void displayTeamB(int score){
        TextView textView = findViewById(R.id.score_team_b);
        textView.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("scoreTeamA",scoreTeamA);
        outState.putInt("scoreTeamB",scoreTeamB);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);

        super.onRestoreInstanceState(savedInstanceState);
    }
}
