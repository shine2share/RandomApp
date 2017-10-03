package come.wordpress.share2study.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnRandom;
    EditText edtNumber1;
    EditText edtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = (TextView) findViewById(R.id.txtNumber);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String text1 = edtNumber1.getText().toString().trim();
                    String text2 = edtNumber2.getText().toString().trim();
                if (text1.length()==0 || text2.length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "You must type a number.", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 1, 5);
                    toast.show();
                } else {
                    int number1 = Integer.parseInt(text1);
                    int number2 = Integer.parseInt(text2);
                    Random random = new Random();
                    int number = random.nextInt((number2 - number1) + 1) + number1;
                    //txtNumber.setText(number + "");
                    txtNumber.setText(String.valueOf(number));
                }
            }
        });

    }
}
