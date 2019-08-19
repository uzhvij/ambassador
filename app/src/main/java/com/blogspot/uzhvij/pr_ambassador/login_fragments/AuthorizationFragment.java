package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.blogspot.uzhvij.pr_ambassador.R;

public class AuthorizationFragment extends BaseFragment {

    public AuthorizationFragment() {
        nextFragmentTag = FragmentsTags.LOGIN;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        thisView = inflater.inflate(R.layout.fragment_authorization, container, false);

        activateToolbar();

        Button buttonLogin = thisView.findViewById(R.id.buttonLogin);
        Button buttonRegister = thisView.findViewById(R.id.buttonRegister);
        Button buttonFacebook = thisView.findViewById(R.id.buttonFacebook);
        Button buttonYandex = thisView.findViewById(R.id.buttonYandex);
        Button buttonGoogle = thisView.findViewById(R.id.buttonGoogle);
        Button buttonVk = thisView.findViewById(R.id.buttonVk);

        buttonFacebook.setOnClickListener(new SocialNetClickListener());
        buttonYandex.setOnClickListener(new SocialNetClickListener());
        buttonGoogle.setOnClickListener(new SocialNetClickListener());
        buttonVk.setOnClickListener(new SocialNetClickListener());
        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);

        return thisView;
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

    class SocialNetClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonFacebook:
                    Toast.makeText(context, "Facebook", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonYandex:
                    Toast.makeText(context, "Yandex", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonGoogle:
                    Toast.makeText(context, "Google", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonVk:
                    Toast.makeText(context, "Vk", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}

