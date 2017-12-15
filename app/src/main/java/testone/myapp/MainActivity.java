package testone.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public String passw = "12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1;

        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText log = (EditText) findViewById(R.id.nameText);
                String login = log.getText().toString();
                EditText pass = (EditText) findViewById(R.id.passText);
                String password = pass.getText().toString();
//                Log.d("Test")

                if(userChecker(login) && password.equals(passw)) {
                        Toast.makeText(getApplication(), "Witaj " + login, Toast.LENGTH_LONG).show();
                        TextView pole = (TextView) findViewById(R.id.poleImie);
                        pole.setText("Zalogowany: " + login);
                }else {
                    Toast.makeText(getApplication(), "Błąd logowania", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public static boolean userChecker(String login){
       List<String> Users = new ArrayList<>();

        Users.add("Adam");
        Users.add("Dawid");
        Users.add("Tomek");

        if (Users.contains(login))
            return true;
        return false;
    }
}
