package net.fredericosilva.showtipsviewsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import net.frederico.showtipsview.ShowTipsBuilder;
import net.frederico.showtipsview.ShowTipsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_one = (Button) findViewById(R.id.button1);
        Button btn_two = (Button) findViewById(R.id.button2);

        // ShowTipsView
        ShowTipsView showtips = new ShowTipsBuilder(this)
                .setTarget(btn_one).setTitle("A magnific button")
                .setDescription("This button do nothing very well")
                .setDelay(1000)
                .setBackgroundAlpha(128)
                .setCloseButtonColor(Color.RED)
                .setCloseButtonTextColor(Color.GREEN)
                .build();

        showtips.show(this);


    }

}
