package com.example.loc.appforblinder.model;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;

import static android.R.attr.data;


/**
 * Created by LOC on 9/17/2017.
 */

public class ImageCapture {
    private ImageFilter imageFilter;
    private static final int CAMERA_REQUEST = 1;

    public void requestCapture() {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
        }
    private void startActivityForResult(Intent cameraIntent, int cameraRequest) {
    }
    //Nhan du lieu tu Camera
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            //Goi den phuong thuc Filter
            imageFilter.imageFilter(photo);
        }
    }


}
