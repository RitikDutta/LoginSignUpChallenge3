package androidfingerprintauthentication.c.lco;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebHistoryItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int b = 0, t=0;
    TextView tvSwipDescription;
    final Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();

        tvSwipDescription.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
                Button b1 = (Button) findViewById(R.id.button2);
                Button b2 = (Button) findViewById(R.id.button3);
                EditText editText5 = (EditText) findViewById(R.id.editText5);
                EditText editText6 = (EditText) findViewById(R.id.editText6);
                EditText editText7 = (EditText) findViewById(R.id.editText7);
                EditText editText8 = (EditText) findViewById(R.id.editText8);
                EditText editText1 = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText4);
                ConstraintLayout mLinearLayout = (ConstraintLayout) findViewById(R.id.lay);
                mLinearLayout.setBackgroundResource(R.drawable.office2);
                editText1.setHintTextColor(Color.BLACK);
                editText2.setHintTextColor(Color.BLACK);
                editText5.setHintTextColor(Color.BLACK);
                editText6.setHintTextColor(Color.BLACK);
                editText7.setHintTextColor(Color.BLACK);
                editText8.setHintTextColor(Color.BLACK);
                editText1.setTextColor(Color.BLACK);
                editText2.setTextColor(Color.BLACK);
                editText5.setTextColor(Color.BLACK);
                editText6.setTextColor(Color.BLACK);
                editText7.setTextColor(Color.BLACK);
                editText8.setTextColor(Color.BLACK);

            }
            public void onSwipeBottom() {
                Button b1 = (Button) findViewById(R.id.button2);
                Button b2 = (Button) findViewById(R.id.button3);
                EditText editText5 = (EditText) findViewById(R.id.editText5);
                EditText editText6 = (EditText) findViewById(R.id.editText6);
                EditText editText7 = (EditText) findViewById(R.id.editText7);
                EditText editText8 = (EditText) findViewById(R.id.editText8);
                EditText editText1 = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText4);
                ConstraintLayout mLinearLayout = (ConstraintLayout) findViewById(R.id.lay);
                mLinearLayout.setBackgroundResource(R.drawable.office3);
                editText1.setHintTextColor(Color.WHITE);
                editText2.setHintTextColor(Color.WHITE);
                editText5.setHintTextColor(Color.WHITE);
                editText6.setHintTextColor(Color.WHITE);
                editText7.setHintTextColor(Color.WHITE);
                editText8.setHintTextColor(Color.WHITE);
                editText1.setTextColor(Color.WHITE);
                editText2.setTextColor(Color.WHITE);
                editText5.setTextColor(Color.WHITE);
                editText6.setTextColor(Color.WHITE);
                editText7.setTextColor(Color.WHITE);
                editText8.setTextColor(Color.WHITE);

            }
        });
    }
    private void initializeView() {
        tvSwipDescription=(TextView) findViewById(R.id.tvSwipDescription);
    }
    public void sendMessage(View view)
    {
        Button b1 = (Button) findViewById(R.id.button2);
        Button b2 = (Button) findViewById(R.id.button3);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        EditText editText6 = (EditText) findViewById(R.id.editText6);
        EditText editText7 = (EditText) findViewById(R.id.editText7);
        EditText editText8 = (EditText) findViewById(R.id.editText8);
        EditText editText1 = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText4);
        if (b==0) {
            b = 1;
            t = 1;
            editText1.setVisibility(View.VISIBLE);
            editText2.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);



        }
        else{
            b = 0;
            editText1.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            editText5.setVisibility(View.INVISIBLE);
            editText6.setVisibility(View.INVISIBLE);
            editText7.setVisibility(View.INVISIBLE);
            editText8.setVisibility(View.INVISIBLE);

        }
        //Intent intent = new Intent(MainActivity.this, ToActivity.class);
        //startActivity(intent);
    }
    public void logsign(View view){
        EditText editText1 = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        EditText editText6 = (EditText) findViewById(R.id.editText6);
        EditText editText7 = (EditText) findViewById(R.id.editText7);
        EditText editText8 = (EditText) findViewById(R.id.editText8);
        Button b2 = (Button) findViewById(R.id.button3);

        if (t==0) {
            t = 1;
            editText1.setVisibility(View.VISIBLE);
            editText2.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.INVISIBLE);
            editText6.setVisibility(View.INVISIBLE);
            editText7.setVisibility(View.INVISIBLE);
            editText8.setVisibility(View.INVISIBLE);

        }
        else{
            t = 0;
            editText1.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
        }
    }

}
