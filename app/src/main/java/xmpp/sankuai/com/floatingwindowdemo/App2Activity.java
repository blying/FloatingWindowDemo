package xmpp.sankuai.com.floatingwindowdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class App2Activity extends AppCompatActivity {
    private Button addFloatWindow;
    private boolean isFloating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);
        addFloatWindow = findViewById(R.id.button1);
        addFloatWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
