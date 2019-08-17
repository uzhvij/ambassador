package com.blogspot.uzhvij.pr_ambassador.login_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blogspot.uzhvij.pr_ambassador.R;

public class InfoFragment extends BaseFragment {

    public InfoFragment() {
        nextFragmentTag = FragmentsTags.AUTHORIZATION;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        Button buttonNextFragment = view.findViewById(R.id.buttonNextFragment);
        buttonNextFragment.setOnClickListener(this);
        return view;
    }
}
