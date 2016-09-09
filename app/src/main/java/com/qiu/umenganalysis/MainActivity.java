package com.qiu.umenganalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

/**
 * 增加注释
 */
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        MobclickAgent.onProfileSignIn ("qiuqiu");

        findViewById (R.id.test_crash).setOnClickListener (new View.OnClickListener ()
        {
            @Override
            public void onClick (View view)
            {
                System.out.println (1 / 0);
            }
        });
    }

    @Override
    protected void onResume ()
    {
        super.onResume ();
        MobclickAgent.onResume (this);
    }

    @Override
    protected void onPause ()
    {
        super.onPause ();
        MobclickAgent.onPause (this);
    }

    @Override
    protected void onDestroy ()
    {
        MobclickAgent.onProfileSignOff ();
        super.onDestroy ();
    }
}
