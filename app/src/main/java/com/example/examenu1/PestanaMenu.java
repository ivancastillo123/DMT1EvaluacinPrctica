package com.example.examenu1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class PestanaMenu extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);

        tabLayout = findViewById(R.id.tab1);
        viewPager = findViewById(R.id.Vpager1);

        tabLayout.setupWithViewPager(viewPager);

        VPAclass vpAclass =new VPAclass(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAclass.addFragment(new Pestana0(), "   ");
        vpAclass.addFragment(new Pestana1(), "Hora");
        vpAclass.addFragment(new Pestana2(),"Progressive bar");
        vpAclass.addFragment(new Pestana3(),"Ubicacion");
        viewPager.setAdapter(vpAclass);
    }
}