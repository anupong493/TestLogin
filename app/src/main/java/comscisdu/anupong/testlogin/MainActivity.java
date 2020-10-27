package comscisdu.anupong.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameTextView;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.btName);
        nameString = getIntent().getStringExtra("Name");
        nameTextView.setText(nameString);
    }
    public void  clickFB(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/anupong.wingnak/"));
        startActivity(fbIntent);
    }
}