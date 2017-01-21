package tw.tw.tw.tw.gjun.db2017012101;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout _layout=new LinearLayout(this);
 //完全用程式寫Layout

        _layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(_layout);


        LinearLayout layout= (LinearLayout) findViewById(R.id.activity_main2);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1f);
        LinearLayout[] layouts=new LinearLayout[3];
        for(LinearLayout laytt:layouts) {
            laytt = new LinearLayout(Main2Activity.this);
            laytt.setOrientation(LinearLayout.VERTICAL);
            laytt.setLayoutParams(params);
            layout.addView(laytt);
            Button[] btns=new Button[3];
            for(Button b:btns) {
                b = new Button(Main2Activity.this);
                b.setText("按我");
                b.setLayoutParams(params);
                laytt.addView(b);

            }

        }


    }
}
