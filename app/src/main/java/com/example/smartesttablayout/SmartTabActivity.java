package com.example.smartesttablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class SmartTabActivity extends AppCompatActivity {

SmartTabLayout viewpagertab;
ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_tab);
        viewpagertab=findViewById(R.id.viewpagertab);
        viewpager=findViewById(R.id.viewpager);
        setTab();
    }
    private void setTab() {
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
              getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Full Match", HomeFragment.class)
                .add("Scorecard", HomeFragment.class)
                .add("Commentary",HomeFragment.class)
                .create());
        viewpager.setAdapter(adapter);
        viewpagertab.setViewPager(viewpager);
        viewpagertab.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("dfdfsdfdsf","true");
            }

            @Override
            public void onPageSelected(int position) {
                int count = adapter.getCount();
                for (int i = 0; i < count; i++) {
                    TextView view = (TextView) viewpagertab.getTabAt(i);
                    view.setTextColor(getResources().getColor(R.color.unselected_tab_text_color));
                }
                TextView view = (TextView) viewpagertab.getTabAt(position);
                view.setTextColor(getResources().getColor(R.color.selected_tab_text_color));
                Log.e("stadfdfdtechange","true");
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("statechange","true");

            }
        });
        TextView view = (TextView) viewpagertab.getTabAt(0);
        view.setTextColor(getResources().getColor(R.color.selected_tab_text_color));

    }

}