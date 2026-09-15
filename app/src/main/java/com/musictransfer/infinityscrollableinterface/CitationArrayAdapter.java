package com.musictransfer.infinityscrollableinterface;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class CitationArrayAdapter extends ArrayAdapter {
    public CitationArrayAdapter(Context context, List<Citation> cl){
        super(context, 0, cl);
    }
}
