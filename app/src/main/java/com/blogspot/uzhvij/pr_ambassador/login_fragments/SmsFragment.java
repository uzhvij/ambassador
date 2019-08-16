package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blogspot.uzhvij.pr_ambassador.R;

public class SmsFragment extends BaseFragment{

    public SmsFragment() {
        nextFragmentTag = FragmentsTags.ROLE_CHOICE;    }

        @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_sms, container, false);
            Button buttonContinue = view.findViewById(R.id.buttonContinue);
            Button buttonGetCode = view.findViewById(R.id.buttonGetCode);
            buttonContinue.setOnClickListener(this);
            buttonGetCode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getCodeAgain(view);
                }
            });
            return view;
        }

    private void getCodeAgain(View view){

    }
}
