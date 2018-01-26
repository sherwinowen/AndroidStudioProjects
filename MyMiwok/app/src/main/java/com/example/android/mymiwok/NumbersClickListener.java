package com.example.android.mymiwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by sherwin on 17/11/2017.
 */

public class NumbersClickListener implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
