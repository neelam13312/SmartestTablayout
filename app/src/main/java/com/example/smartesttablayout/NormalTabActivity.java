package com.example.smartesttablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class NormalTabActivity extends AppCompatActivity {
    BankAcc_ViewpagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    TabLayout tblayout;
    ArrayList<BankAcc_List_Model> bankAcc_list_models;
    ArrayList<UPi_idList_Model> uPiIdListModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_tab);
        init_ViewPager();
    }

    private void init_ViewPager() {
        viewPager = findViewById(R.id.viewPager);
        tblayout=findViewById(R.id.tblayout);
        viewPagerAdapter=new BankAcc_ViewpagerAdapter(getSupportFragmentManager(),bankAcc_list_models,uPiIdListModels);
//           viewPagerAdapter.add();
        viewPager.setAdapter(viewPagerAdapter);
        viewPagerAdapter.notifyDataSetChanged ();
        viewPager.setCurrentItem(0);
        tblayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.e("position",""+position);
                // Toast.makeText(SeeAllTodayExamActivity.this, "page :"+position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}