package com.example.android.chesscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.chesscounter.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Player A by 1 point.
     */
    public void addZeroForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 0;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 2 points.
     */
    public void addOneForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 3 points.
     */
    public void addThreeForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 3;
        displayForPlayerA(scorePlayerA);
    }
    /**
     * Increase the score for Player B by 1 point.
     */
    public void addZeroForPlayerB(View v){
        scorePlayerB = scorePlayerB +0;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Increase the score for Player B by 2 points.
     */
    public void addOneForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 3 points.
     */
    public void addThreeForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 3;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Resets the scores to 0.
     */
    public void resetScores(View v){
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Player_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}