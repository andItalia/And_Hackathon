package it.anditalia.robot.hackathon.and_hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.qihancloud.opensdk.base.TopBaseActivity;

public class MainActivity extends TopBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this line is mandatory for the robot framework
        register(MainActivity.class);
        // This line permits to keep alive your app on the screen of the robot.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onMainServiceConnected() {
        // This funzione is executed before onCreate (is mandatory)
    }
}
