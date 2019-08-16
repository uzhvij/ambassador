package com.blogspot.uzhvij.pr_ambassador.login_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.blogspot.uzhvij.pr_ambassador.R;

public class LoginFragment extends BaseFragment {

    public LoginFragment() {
        nextFragmentTag = FragmentsTags.SMS;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        Button buttonContinue = view.findViewById(R.id.buttonEnter);
        TextView textViewForgotPassword = view.findViewById(R.id.textViewForgotPassword);
        buttonContinue.setOnClickListener(this);
        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotPassword(view);
            }
        });
        return view;
    }

    private void forgotPassword(View view){

    }
}
