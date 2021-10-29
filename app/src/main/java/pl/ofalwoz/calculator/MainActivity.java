package pl.ofalwoz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int count;
    TextView showCount;
    String oldNumber = "";
    String op = "+";
    boolean isNewOp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.editText);
    }

    public void ResetButton(View view) {
        showCount.setText("0");
        isNewOp = true;
    }

    public void onClickNumber(View view) {
        if(isNewOp)
            showCount.setText("");
        isNewOp = false;
        String number = showCount.getText().toString();
        switch (view.getId()){
            case R.id.oneButton: number +="1"; break;
            case R.id.twoButton: number +="2"; break;
            case R.id.threeButton: number +="3"; break;
            case R.id.fourButton: number +="4"; break;
            case R.id.fiveButton: number +="5"; break;
            case R.id.sixButton: number +="6"; break;
            case R.id.sevenButton: number +="7"; break;
            case R.id.eightButton: number +="8"; break;
            case R.id.nineButton: number +="9"; break;
            case R.id.zeroButton: number +="0"; break;
        }
        showCount.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = showCount.getText().toString();
        switch (view.getId()){
            case R.id.sumButton: op = "+"; break;
            case R.id.subButton: op = "-"; break;
            case R.id.mulButton: op = "*"; break;
            case R.id.divButton: op = "/"; break;
        }
    }

    public void eqlEvent(View view) {
        if(!isNewOp) {
            String newNumber = showCount.getText().toString();
            Double result = 0.0;
            switch (op) {
                case "+": result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);break;
                case "-": result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);break;
                case "*": result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);break;
                case "/": result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);break;
            }
            showCount.setText(result + "");
        }
    }
}