package my.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;

public class LoadingAcitvity extends AppCompatActivity {
Intent intent;
    TextView loadText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_acitvity);
        loadText = (TextView) findViewById(R.id.textView3 );

        /////////////////////////// 로딩화면 텍스트 애니메이션
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1200); //You can manage the time of the blink with this parameter
        anim.setStartOffset(0);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        loadText.startAnimation(anim);
        ///////////////////////////////////////////

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:

            intent=new Intent(LoadingAcitvity.this,MainActivity.class);
            startActivity(intent);
                break;


        }
        return true;
    }
}
