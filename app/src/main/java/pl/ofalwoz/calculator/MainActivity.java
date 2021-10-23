package pl.ofalwoz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
    }

    public void CountUpButton(View view) {
        count++;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void CountDownButton(View view) {
        count--;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void ResetButton(View view) {
        count = 0;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void oneButton(View view) {
    }

    public void twoButton(View view) {
    }

    public void threeButton(View view) {
    }

    public void sumButton(View view) {
    }

    public void fourButton(View view) {
    }

    public void fiveButton(View view) {
    }

    public void sixButton(View view) {
    }

    public void subButton(View view) {
    }

    public void sevenButton(View view) {
    }

    public void eightButton(View view) {
    }

    public void nineButton(View view) {
    }

    public void mulButton(View view) {
    }

    public void zeroButton(View view) {
    }

    public void divButton(View view) {
    }

    public void eqlButton(View view) {
    }
}