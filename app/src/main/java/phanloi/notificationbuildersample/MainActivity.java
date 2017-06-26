package phanloi.notificationbuildersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSendNormal)
    Button btnSendNormal;
    @BindView(R.id.btnSendLarge)
    Button btnSendLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnSendNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationBuilder.showNormalNotification(MainActivity.this);
            }
        });

        btnSendLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationBuilder.showLargeNotification(MainActivity.this);
            }
        });
    }
}
