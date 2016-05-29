package myapplicationgit.com.example.jbt.myapplicationgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv=(TextView)findViewById(R.id.TvId);
        tv.setText("Yossi The King");

    }
}
