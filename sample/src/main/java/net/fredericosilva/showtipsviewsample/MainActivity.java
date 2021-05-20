package net.fredericosilva.showtipsviewsample;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import net.frederico.showtipsview.ShowTipsBuilder;
import net.frederico.showtipsview.ShowTipsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_one = (Button) findViewById(R.id.button1);
        Button btn_two = (Button) findViewById(R.id.button2);

        RelativeLayout.LayoutParams params =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        // ShowTipsView
        ShowTipsView showtips = new ShowTipsBuilder(this)
                .setTarget(btn_one).setTitle("A magnific button")
                .setDescription("This button do nothing very well")
                .setDelay(1000)
                .setBackgroundAlpha(128)
                .setCloseButtonColor(Color.RED)
                .setCloseButtonTextColor(Color.GREEN)
                .setRadius(700)
                .setButtonLayoutParams(params)
                .build();

        showtips.show(this);


    }

}
