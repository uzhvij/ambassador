package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.blogspot.uzhvij.pr_ambassador.DataWorker;
import com.blogspot.uzhvij.pr_ambassador.R;

public class AuthorizationFragment extends BaseFragment {
    private EditText editTextPhoneNumber;

    public AuthorizationFragment() {
        nextFragmentTag = FragmentsTags.AUTHORIZATION;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_authorization, container, false);
        editTextPhoneNumber = view.findViewById(R.id.editTextPhoneNumber);
        Button buttonLogin = view.findViewById(R.id.buttonLogin);
        Button buttonRegister = view.findViewById(R.id.buttonRegister);
        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonLogin:
                setNextFragmentTag(FragmentsTags.LOGIN);
                break;
            case R.id.buttonRegister:
                setNextFragmentTag(FragmentsTags.REGISTRATION);
                break;
        }
        super.onClick(view);
    }

}
