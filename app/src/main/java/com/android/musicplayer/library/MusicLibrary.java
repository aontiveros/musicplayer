package com.android.musicplayer.library;

import android.content.Context;

/**
 * Created by Tony on 7/30/16.
 */
public class MusicLibrary {
    private static MusicLibrary sMusicLibrary;
    private Context mContext;

    private MusicLibrary(Context context){
        mContext = context;
    }

    public static MusicLibrary getMusicLibrary(Context context){
        if(sMusicLibrary == null)
            sMusicLibrary = new MusicLibrary(context);
        return sMusicLibrary;
    }
}
