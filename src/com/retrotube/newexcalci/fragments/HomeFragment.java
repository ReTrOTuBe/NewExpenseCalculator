package com.retrotube.newexcalci.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.retrotube.newexcalci.R;

public class HomeFragment extends Fragment {
		
	private View view = null;
	
	private FragmentManager fm = null;
	private FragmentTransaction ft = null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
			view = inflater.inflate(R.layout.home_layout, null);
			
			initializeTopFragment();
		return view;
	}
	
	/***
	 * Here the top fragment will get initialized
	 */
	private void initializeTopFragment() {
		
		fm = getActivity().getSupportFragmentManager();
		
		ft = fm.beginTransaction();
		
		Fragment topFragment = new TopBarFragment();
		
		ft.add(R.id.home_top_bar, topFragment);
		ft.commit();
		
		
	}

}
