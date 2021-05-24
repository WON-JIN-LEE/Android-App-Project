package my.examapp;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


//    private SetBluetooth btService = null;
//    private final Handler mHandler = new Handler() {
//        @Override public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//
//        }
//    };



 private TextView textView;
    static int num = 1;
    ImageButton button;
 TextView textView3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");


//
//        // BluetoothService 클래스 생성
//        if(btService == null) {
//            btService = new SetBluetooth(this, mHandler);
//        }








        textView=findViewById(R.id.textView);// 측정변수
        button =findViewById(R.id.btu_start);
        textView3=findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                textView3.setText("Measuring...");
//            textView.setText(mHandler.toString());

            }

        });

 }




    //////////////////////////////////////////// 뒤로가기 버튼 alertdialog뛰우는 메소드
    public boolean onKeyDown(int keyCode, KeyEvent event){
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                String alertTitle = getResources().getString(R.string.app_name);
                String buttonMessage = getResources().getString(R.string.alert_msg_exit);
                String buttonYes = getResources().getString(R.string.button_yes);
                String buttonNo = getResources().getString(R.string.button_no);

                AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
                alert.setTitle(alertTitle);
                alert.setMessage(buttonMessage);
                alert.setPositiveButton(buttonYes, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        moveTaskToBack(true);
                        finish();
                    }
                });
                alert.setNegativeButton(buttonNo, null);
                alert.show();
        }
        return true;

    }
//////////////////////////////////////////////////
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;

}


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()){

            case R.id.action_settings1:
                intent = new Intent(MainActivity.this, MainActivity.class);
                break;

            case R.id.action_settings2:
                intent = new Intent(MainActivity.this, Main1Activity.class);
                break;

            case R.id.action_settings3:
                intent = new Intent(MainActivity.this, SetBluetooth.class);
                break;

        }

        startActivity(intent);


        return true;

    }




}
