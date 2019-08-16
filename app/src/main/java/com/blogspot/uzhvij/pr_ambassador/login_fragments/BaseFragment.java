package com.blogspot.uzhvij.pr_ambassador.login_fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

import com.blogspot.uzhvij.pr_ambassador.FragmentSwitch;

public class BaseFragment extends Fragment implements View.OnClickListener {
    protected FragmentSwitch mainActivityListener;
    protected FragmentsTags nextFragmentTag;
    protected Context context;

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

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivityListener = null;
    }

    public void setNextFragmentTag(FragmentsTags tag) {
        nextFragmentTag = tag;
    }

    public FragmentsTags getNextFragmentTag() {
        return nextFragmentTag;
    }

    @Override
    public void onClick(View v) {
        if (mainActivityListener != null) {
            mainActivityListener.switchFragment();
        }
    }
}
