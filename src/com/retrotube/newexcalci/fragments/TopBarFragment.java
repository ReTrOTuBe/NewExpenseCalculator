package com.retrotube.newexcalci.fragments;


import com.retrotube.newexcalci.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopBarFragment extends Fragment {

	private View view = null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate( R.layout.top_dashboard_fragment , null );
		return view;
	}
}
