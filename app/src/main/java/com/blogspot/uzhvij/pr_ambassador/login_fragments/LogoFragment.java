package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.blogspot.uzhvij.pr_ambassador.R;

public class LogoFragment extends BaseFragment {
    public LogoFragment() {
        nextFragmentTag = FragmentsTags.INFO;
    }

    private static final String TAG = "myLogs";
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_logo, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        return view;
    }
}