package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.uzhvij.pr_ambassador.R;

public class LoginRegistrationFragment extends BaseFragment {

    public LoginRegistrationFragment() {
        nextFragmentTag = FragmentsTags.LOGIN_REGISTRATION;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_registration, container, false);
    }

}
