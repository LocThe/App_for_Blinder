package com.example.loc.appforblinder.presenter;

import android.graphics.Bitmap;

import com.example.loc.appforblinder.model.CallbackModel;
import com.example.loc.appforblinder.model.ImageCapture;
import com.example.loc.appforblinder.model.ImageFilter;
import com.example.loc.appforblinder.model.ModelInternet;
import com.example.loc.appforblinder.model.PositionDetector;
import com.example.loc.appforblinder.view.ViewTextToSpeech;

/**
 * Created by LOC on 9/17/2017.
 */

public class Presenter implements CallbackModel {
    private ImageCapture imageCapture;
    private ImageFilter imageFilter;
    private ModelInternet modelInternet;
    private PositionDetector positionDetector;
    private ViewTextToSpeech viewTextToSpeech;
    public Presenter (ViewTextToSpeech viewTextToSpeech){
        this.viewTextToSpeech = viewTextToSpeech;
        modelInternet = new ModelInternet();
        imageFilter = new ImageFilter();
        positionDetector = new PositionDetector(this);
        imageCapture = new ImageCapture();
    }
    //Yêu cầu chụp ảnh
    public void captureImage(){
        imageCapture.requestCapture();

    }
    //Gửi ảnh lên internet
    @Override
    public void sendImage(Bitmap photo) {
    modelInternet.sendImageInternet(photo);
    }
    //Nhận dữ liệu sau khi xử lý ảnh từ internet
    @Override
    public void recieveData(String data) {
    modelInternet.recieveDataForInternet(data);
    }
}
