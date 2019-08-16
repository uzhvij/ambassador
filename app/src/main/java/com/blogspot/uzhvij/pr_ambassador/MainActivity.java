package com.blogspot.uzhvij.pr_ambassador;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.blogspot.uzhvij.pr_ambassador.login_fragments.BaseFragment;
import com.blogspot.uzhvij.pr_ambassador.login_fragments.FragmentsFactory;
import com.blogspot.uzhvij.pr_ambassador.login_fragments.FragmentsTags;


public class MainActivity extends AppCompatActivity implements FragmentSwitch {

    private static final String TAG = "myLogs";
    private static final String IS_LOGIN = "is_login";
    private static boolean userIsLogin = false;
    private FragmentsTags nextFragmentTag = FragmentsTags.LOGO;
    private BaseFragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragmentToActivity();
        defineNextFragment();
    }

    private void setFragmentToActivity() {
        Log.d(TAG, "setFragmentToActivity: start");
        currentFragment = FragmentsFactory.getFragment(nextFragmentTag);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_activity_frame_layout, currentFragment)
                .addToBackStack(null)
                .commit();
    }

    private void defineNextFragment() {
        userIsLogin = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(IS_LOGIN, false);
        nextFragmentTag = userIsLogin ? FragmentsTags.ROLE_CHOICE : FragmentsTags.INFO;
        currentFragment.setNextFragmentTag(nextFragmentTag);
    }

    @Override
    public void switchFragment() {
        nextFragmentTag = currentFragment.getNextFragmentTag();
        Log.d(TAG, "switchFragment: " + nextFragmentTag.toString());
        setFragmentToActivity();
    }
}
