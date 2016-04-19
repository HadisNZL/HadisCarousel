package com.hadis.hadiscarousel;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * 全局初始化app
 *
 * @author hadis on 16.4.5.
 */
public class BaseApplication extends Application {
    public static BaseApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        x.Ext.init(this);//初始化xutils3.x
        x.Ext.setDebug(true);// 是否输出debug日志
    }


    public static BaseApplication getInstance() {
        return app;
    }


    /**
     * 此方法描述的是： 复制内容到剪贴板
     */
    public static void copyContent(String content, Context context) {
        ClipboardManager cmb = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        cmb.setText(content.trim());
        Toast.makeText(context, "已复制到剪贴板", Toast.LENGTH_SHORT).show();
    }

}
