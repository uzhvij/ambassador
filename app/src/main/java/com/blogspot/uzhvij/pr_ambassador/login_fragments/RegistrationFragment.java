package com.blogspot.uzhvij.pr_ambassador.login_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blogspot.uzhvij.pr_ambassador.R;

public class RegistrationFragment extends BaseFragment {

    public RegistrationFragment() {
        nextFragmentTag = FragmentsTags.LOGIN;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registration, container, false);
        Button buttonLogin = view.findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        return view;
    }
}