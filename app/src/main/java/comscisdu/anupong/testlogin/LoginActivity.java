package comscisdu.anupong.testlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText nameEditText1, nameEditText2;
    Button btn;
    String nameString,passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nameEditText1 = findViewById(R.id.edt1);
        nameEditText2 = findViewById(R.id.edt2);
        btn = findViewById(R.id.btLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText1.getText().toString().trim();
                passString = nameEditText2.getText().toString().trim();

                if((nameString.length() == 0) || (passString.length() == 0)) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                } else if (!passString.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                } else {
                    Intent startIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }

            }
        });
    }
    }

