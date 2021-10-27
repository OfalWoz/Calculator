package pl.ofalwoz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
    }

    public void ResetButton(View view) {
        if (showCount != null){
            showCount.setText("");
        }
    }

    public void onClickNumber(View view) {
        if (showCount != null){
            showCount.append(((Button)view).getText());
        }
    }

    public void sumButton(View view) {
    }

    public void subButton(View view) {
    }

    public void mulButton(View view) {
    }

    public void divButton(View view) {
    }

    public void eqlButton(View view) {
    }
}