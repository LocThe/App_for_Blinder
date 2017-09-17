package com.example.loc.appforblinder.model;

import android.graphics.Bitmap;

/**
 * Created by LOC on 9/17/2017.
 */

public class ImageFilter {
    private PositionDetector positionDetector;
    public void imageFilter(Bitmap photo){
    //Thuc hien ham loc
        positionDetector.detectPosition(photo);
    };
}
