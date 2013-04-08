package com.retrotube.newexcalci;

import com.retrotube.newexcalci.fragments.HomeFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainCalciActivity extends FragmentActivity {
	private FragmentManager fManager = null;
	private FragmentTransaction fTransaction = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calci);
        
        Fragment homeFragment = new HomeFragment();
        fManager = getSupportFragmentManager();
        fTransaction = fManager.beginTransaction();
        fTransaction.add(R.id.container, homeFragment);
        fTransaction.commit();
        
    }
}
