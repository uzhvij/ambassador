package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.uzhvij.pr_ambassador.FragmentSwitch;
import com.blogspot.uzhvij.pr_ambassador.R;

public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    protected FragmentSwitch mainActivityListener;
    protected FragmentsTags nextFragmentTag;
    protected Context context;
    protected View thisView;
    private static final String TAG = "myLogs";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        if (context instanceof FragmentSwitch) {
            mainActivityListener = (FragmentSwitch) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mainActivityListener != null) {
            mainActivityListener.setNextFragmentTag(nextFragmentTag);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivityListener = null;
    }

    @Override
    public void onClick(View v) {
        if (mainActivityListener != null) {
            mainActivityListener.setFragmentToActivity();
        }
    }

    public void setNextFragmentTag(FragmentsTags tag) {
        nextFragmentTag = tag;
    }

    public void activateToolbar(){
        Toolbar toolbar = thisView.findViewById(R.id.toolbar);
        ((AppCompatActivity)context).getSupportActionBar();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).onBackPressed();
            }
        });
    }
}
