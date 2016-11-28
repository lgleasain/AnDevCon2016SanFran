package com.polyglotprogramminginc.andevcon2016sanfrancisco;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lance Gleason of Polyglot Programming LLC. on 11/27/16.
 * http://www.polyglotprogramminginc.com
 * https://github.com/lgleasain
 * Twitter: @lgleasain
 */

public class MWScannerFragment extends DialogFragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mwscanner, container, false);
    }
}
