package com.hadis.hadiscarousel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.hadis.hadiscarousel.bean.ADInfo;
import com.hadis.hadiscarousel.bean.HomePlayBean;
import com.hadis.hadiscarousel.cycleviewpager.CycleViewPager;
import com.hadis.hadiscarousel.cycleviewpager.ViewFactory;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ImageView> views = new ArrayList<ImageView>();
    private List<ADInfo> list = new ArrayList<ADInfo>();
    private CycleViewPager cycleViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);
        initData();
    }

    private void initData() {
        String url = "http://www.ubetween.cn/api/page/pictures/t/首页轮播图2016.03_";
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                HomePlayBean hahah = new Gson().fromJson(result, HomePlayBean.class);
                list.addAll(hahah.getData());
                if (list.size() == 0) {
                    return;
                }
                initialize();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }

            @Override
            public void onCancelled(CancelledException cex) {
            }

            @Override
            public void onFinished() {
            }
        });
    }

    private void initialize() {
        cycleViewPager = (CycleViewPager) getSupportFragmentManager().findFragmentById(R.id.fragment_cycle_viewpager_content);
        views.add(ViewFactory.getImageView(this, list.get(list.size() - 1).getIurl()));
        for (int i = 0; i < list.size(); i++) {
            views.add(ViewFactory.getImageView(this, list.get(i).getIurl()));
        }
        views.add(ViewFactory.getImageView(this, list.get(0).getIurl()));
        cycleViewPager.setCycle(true);
        cycleViewPager.setData(views, list, mAdCycleViewListener);
        cycleViewPager.setWheel(true);
        cycleViewPager.setTime(4 * 1000);
        //cycleViewPager.setIndicatorCenter();
    }

    //轮播的监听事件
    private CycleViewPager.ImageCycleViewListener mAdCycleViewListener = new CycleViewPager.ImageCycleViewListener() {
        @Override
        public void onImageClick(ADInfo info, int position, View imageView) {
            if (cycleViewPager.isCycle()) {
//                position = position - 1;
//                String url = info.getItarget();
//                Intent intent = new Intent(getApplicationContext(), ViewPointDetailsActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("webview_url", url);
//                intent.putExtras(bundle);
//                startActivity(intent);
            }
        }
    };

}
