import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tts_72170102.R;


public class Activity_SplashScreen extends AppCompatActivity {
    private int waktu_loading=4000;


    //000=4 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(Activity_SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}