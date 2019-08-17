package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.uzhvij.pr_ambassador.FragmentSwitch;

public class BaseFragment extends Fragment implements View.OnClickListener {
    protected FragmentSwitch mainActivityListener;
    protected FragmentsTags nextFragmentTag;
    protected Context context;
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

    public void setNextFragmentTag(FragmentsTags tag) {
        nextFragmentTag = tag;
    }

    @Override
    public void onClick(View v) {
        if (mainActivityListener != null) {
            mainActivityListener.setFragmentToActivity();
        }
    }
}
