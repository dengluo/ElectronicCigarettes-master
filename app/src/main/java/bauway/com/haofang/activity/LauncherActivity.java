package bauway.com.haofang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

import bauway.com.haofang.R;
import bauway.com.haofang.base.BaseActivity;
import bauway.com.haofang.bean.User;

/**
 * Created by zhaotaotao on 2017/8/10.
 * 启动界面
 */

public class LauncherActivity extends BaseActivity {
    @Override
    protected int getLayoutRes() {
        return R.layout.launcher_activity;
    }

    @Override
    protected void initComplete(Bundle savedInstanceState) {
        //延时后执行
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity();
            }
        }, 2 * 1000);
    }

    private void startActivity() {
        User user = getUserEntity();
        if (user != null
                && !TextUtils.isEmpty(user.getEmail())
                && !TextUtils.isEmpty(user.getUsername())
                ) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, LoginActivity.class));
        }
        this.finish();
    }


    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }
}