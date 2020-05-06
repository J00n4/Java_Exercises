package com.example.helloworld;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView text;
    String change;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        input = (EditText) findViewById(R.id.editText2);
        input.setOnEditorActionListener(keyListener);

    }

    public void printHello(View v) {
        System.out.println("Vapaavalintainen teksti");
        //change = (String) input.getText().toString();
        //text.setText(change);
    }

    TextView.OnEditorActionListener keyListener = new TextView.OnEditorActionListener() {
        public boolean onEditorAction(TextView input, int actionId, KeyEvent event) {
            if(actionId == EditorInfo.IME_NULL && event.getAction() == KeyEvent.ACTION_DOWN) {
                change = (String) input.getText().toString();
                text.setText(change);
            }
            return true;
        }
    };

}
