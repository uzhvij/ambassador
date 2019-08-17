package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blogspot.uzhvij.pr_ambassador.R;

public class AuthorizationFragment extends BaseFragment {

    public AuthorizationFragment() {
        nextFragmentTag = FragmentsTags.LOGIN;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_authorization, container, false);
        Button buttonLogin = view.findViewById(R.id.buttonLogin);
        Button buttonRegister = view.findViewById(R.id.buttonRegister);
        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonLogin:
                setNextFragmentTag(FragmentsTags.LOGIN);
                break;
            case R.id.buttonRegister:
                setNextFragmentTag(FragmentsTags.REGISTRATION);
                break;
        }
        mainActivityListener.setNextFragmentTag(nextFragmentTag);
        super.onClick(view);
    }

}
