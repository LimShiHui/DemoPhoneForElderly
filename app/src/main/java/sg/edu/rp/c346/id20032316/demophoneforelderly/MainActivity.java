package sg.edu.rp.c346.id20032316.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_Peter;
    Button btn_Mary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Peter = findViewById(R.id.btnPeter);
        btn_Mary = findViewById(R.id.btnMary);


        btn_Peter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + 92240336));
                startActivity(intentCall);
            }
        });

        btn_Mary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + 89675543));
                startActivity((intentCall));
            }
        });

    }




}