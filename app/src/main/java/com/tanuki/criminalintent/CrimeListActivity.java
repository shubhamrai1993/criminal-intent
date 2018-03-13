package com.tanuki.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shubham_rai on 07/03/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
