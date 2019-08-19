package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blogspot.uzhvij.pr_ambassador.DataWorker;
import com.blogspot.uzhvij.pr_ambassador.R;
import com.blogspot.uzhvij.pr_ambassador.api_classes.RequestTypes;

public class SmsFragment extends BaseFragment {

    public SmsFragment() {
        nextFragmentTag = FragmentsTags.ROLE_CHOICE;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        thisView = inflater.inflate(R.layout.fragment_sms, container, false);

        activateToolbar();

        Button buttonContinue = thisView.findViewById(R.id.buttonContinue);
        Button buttonGetCode = thisView.findViewById(R.id.buttonGetCode);
        buttonContinue.setOnClickListener(this);
        buttonGetCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCodeAgain(view);
            }
        });
        return thisView;
    }

    private void getCodeAgain(View view) {
        DataWorker.getInstance(context).makeRequest(RequestTypes.SMS);
    }
}
