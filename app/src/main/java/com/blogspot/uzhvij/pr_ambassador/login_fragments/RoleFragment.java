package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.blogspot.uzhvij.pr_ambassador.R;

public class RoleFragment extends BaseFragment{

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        thisView = inflater.inflate(R.layout.fragment_role, container, false);

        activateToolbar();

        FloatingActionButton buttonCustomerRole = thisView.findViewById(R.id.buttonCustomerRole);
        FloatingActionButton buttonAmbassadorRole = thisView.findViewById(R.id.buttonAmbassadorRole);
        buttonAmbassadorRole.setOnClickListener(this);
        buttonCustomerRole.setOnClickListener(this);

        return thisView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonAmbassadorRole:
                Toast.makeText(context, "Next ambassador activity", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCustomerRole:
                Toast.makeText(context, "Next customer activity", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
