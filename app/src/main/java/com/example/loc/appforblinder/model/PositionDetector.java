package com.example.loc.appforblinder.model;

import android.graphics.Bitmap;

/**
 * Created by LOC on 9/17/2017.
 */

public class PositionDetector {
    private CallbackModel listener;
    public  PositionDetector(CallbackModel listener){
        this.listener = listener;
    }
        public void detectPosition(Bitmap photo){
            lightCondition(photo);
            cropImage(photo);
            xoayManHinh(photo);
            listener.sendImage(photo);
    };
    void lightCondition(Bitmap photo){};
    void cropImage(Bitmap photo){};
    void xoayManHinh(Bitmap photo){};
    //void detectPosition(Bitmap photo){};



}
