package bopihui.rxjavasimple;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import bopihui.rxjavasimple.Bean.Bean;
import bopihui.rxjavasimple.serapi.MyModel;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

/**
 * 第二次提交
 */

public class MainActivity extends Activity {
    private Button   testBtn;   //测试按钮
    private TextView result;    //测试结果
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyModel.getModel().getService().getIndex("1","1").observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Bean>() {
                    @Override
                    public void onNext(Bean user) {
                        result.setText(user.getCity_name());
                    }
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable error) {
                        Toast.makeText(MainActivity.this,"出错了",Toast.LENGTH_LONG).show();
                        // Error handling
                    }
                });
            }
        });
    }
    private void InitView() {
        testBtn = (Button) findViewById(R.id.testBtn);
        result  = (TextView) findViewById(R.id.result);
    }
}
