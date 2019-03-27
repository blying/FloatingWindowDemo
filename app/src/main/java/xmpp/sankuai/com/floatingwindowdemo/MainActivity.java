package xmpp.sankuai.com.floatingwindowdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button app1, app2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app1 = findViewById(R.id.button1);
        app2 = findViewById(R.id.button2);

        app1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, App1Activity.class);
                startActivity(intent);
            }
        });
        app2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, App2Activity.class);
                startActivity(intent);
            }
        });
    }
}
