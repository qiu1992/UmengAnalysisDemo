package com.qiu.umenganalysis;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.MobclickAgentJSInterface;

/**
 * Created by qiu on 2016/7/9 0009.
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate ()
    {
        super.onCreate ();

        initUmenAnalysis ();
    }

    /**
     * 初始化友盟统计
     */
    private void initUmenAnalysis ()
    {
        MobclickAgent.enableEncrypt(true);//6.0.0版本及以后
//        MobclickAgent.setCatchUncaughtExceptions (true);
        MobclickAgent.setScenarioType (this,MobclickAgent.EScenarioType.E_UM_NORMAL);
    }
}
