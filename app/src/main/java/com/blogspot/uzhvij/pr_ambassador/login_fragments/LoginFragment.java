package com.blogspot.uzhvij.pr_ambassador.login_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.blogspot.uzhvij.pr_ambassador.DataWorker;
import com.blogspot.uzhvij.pr_ambassador.R;
import com.blogspot.uzhvij.pr_ambassador.User;
import com.blogspot.uzhvij.pr_ambassador.api_classes.RequestTypes;

public class LoginFragment extends BaseFragment {
    private EditText editTextPhoneNumber;
    private EditText editTextPassword;

    public LoginFragment() {
        nextFragmentTag = FragmentsTags.SMS;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        editTextPhoneNumber = view.findViewById(R.id.editTextPhoneNumber);
        editTextPassword = view.findViewById(R.id.editTextPassword);
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

    @Override
    public void onClick(View view) {
        User.getInstance().setPhoneNumber(editTextPhoneNumber.getText().toString());
        User.getInstance().setPassword(editTextPassword.getText().toString());
        DataWorker.getInstance(context).makeRequest(RequestTypes.LOGIN);
        super.onClick(view);
    }

    private void forgotPassword(View view) {

    }
}
