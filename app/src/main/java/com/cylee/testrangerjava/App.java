package com.cylee.testrangerjava;

import android.app.Application;

import com.bytedance.applog.AppLog;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.util.UriConstants;

public class App extends Application {

   @Override
   public void onCreate() {
      super.onCreate();


      InitConfig config = new InitConfig("{{APPID}}", "{{CHANNEL}}");
      // 设置数据上送地址
      config.setUriConfig(UriConstants.DEFAULT);
      config.setImeiEnable(false);//建议关停获取IMEI（出于合规考虑）
      config.setAutoTrackEnabled(true); // 全埋点开关，true开启，false关闭
      config.setLogEnable(false); // true:开启日志，参考4.3节设置logger，false:关闭日志
      AppLog.setEncryptAndCompress(true); // 加密开关，true开启，false关闭
      AppLog.init(this, config);
   }
}
