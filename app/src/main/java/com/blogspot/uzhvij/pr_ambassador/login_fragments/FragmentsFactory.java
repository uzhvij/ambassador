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
            case LOGIN:
                fragment = new LoginFragment();
                break;
            case SMS:
                fragment = new SmsFragment();
                break;
            case REGISTRATION:
                fragment = new RegistrationFragment();
                break;
            case ROLE_CHOICE:
                fragment = new RoleFragment();
                break;
        }
        return fragment;
    }
}
