package com.example.loc.appforblinder.model;

import android.graphics.Bitmap;

/**
 * Created by LOC on 9/17/2017.
 */

public interface CallbackModel {
    void sendImage(Bitmap photo);
    void recieveData(String data);
}
