package com.example.android.sunshine.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by yacinebadiss on 04/04/2016.
 */
public class Preferences {
    private SharedPreferences mPrefs;
    private Context mContext;

    public Preferences(Context context) {
        mContext = context;
        mPrefs = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    public String getLocation() {
        return mPrefs.getString(
                mContext.getString(R.string.pref_location_key),
                mContext.getString(R.string.pref_location_default));
    }

    public String getUnit() {
        return mPrefs.getString(
                mContext.getString(R.string.pref_unit_key),
                mContext.getString(R.string.pref_unit_default));
    }

    public String getPreference(String key) {
        return mPrefs.getString(key, "");
    }
}
