package com.sunny.demo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sunny.library.BaseApplication;
import com.sunny.library.activity.BaseActivity;
import com.sunny.library.router.Router;
import com.sunny.demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class XUtils3Activity extends BaseActivity {

    @BindView(R.id.btn_1)
    Button btn1;
    @BindView(R.id.btn_2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xutils3);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_1, R.id.btn_2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                Router.getInstance(this).routerUri().jumpToForgetPwdActivity(BaseApplication.urlKey);
                break;
            case R.id.btn_2:
                showActivity(aty, DBActivity.class);
                break;
        }
    }
}
