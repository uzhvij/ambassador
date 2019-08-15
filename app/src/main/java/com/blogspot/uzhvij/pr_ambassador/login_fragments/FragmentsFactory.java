package com.blogspot.uzhvij.pr_ambassador.login_fragments;

public class FragmentsFactory {
    public static BaseFragment getFragment(FragmentsTags currentFragmentsTag) {
        BaseFragment fragment = null;
        switch (currentFragmentsTag) {
            case LOGO:
                fragment = new LogoFragment();
                break;
            case INFO:
                fragment = new InfoFragment();
                break;
            case AUTHORIZATION:
                fragment = new AuthorizationFragment();
                break;
            case ROLE_CHOICE:
                break;
        }
        return fragment;
    }
}
