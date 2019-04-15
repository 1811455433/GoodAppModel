package com.seven.goodappmodel.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;

import com.seven.goodappmodel.R;


public class Model1 extends AppCompatActivity {
    EditText e1, e2;
    ImageView m1, m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_1);
        getSupportActionBar().hide();
        init();
    }

    private void init() {
        // TODO Auto-generated method stub
        e1 = (EditText) findViewById(R.id.phonenumber);
        e2 = (EditText) findViewById(R.id.password);
        m1 = (ImageView) findViewById(R.id.del_phonenumber);
        m2 = (ImageView) findViewById(R.id.del_password);
        // 添加清楚监听器大气
        EditTextClearTools.addclerListener(e1, m1);
        EditTextClearTools.addclerListener(e2, m2);

    }
}

class EditTextClearTools {
    static void addclerListener(final EditText e1, final ImageView m1) {

        e1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                // TODO Auto-generated method stub

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
                // 监听如果输入串长度大于0那么就显示clear按钮。
                String s1 = s + "";
                if (s.length() > 0) {
                    m1.setVisibility(View.VISIBLE);
                } else {
                    m1.setVisibility(View.INVISIBLE);
                }

            }
        });

        m1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // 清空输入框
                e1.setText("");
            }
        });

    }

}
