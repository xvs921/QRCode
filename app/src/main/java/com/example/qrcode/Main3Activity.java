package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class Main3Activity extends AppCompatActivity {

    private Button buttonGenerate;
    private EditText editTextBemenet;
    private ImageView imageViewQRCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiFormatWriter multiFormatWriter=new MultiFormatWriter();
                try
                {
                    BitMatrix bitMatrix=multiFormatWriter.encode(editTextBemenet.getText().toString(), BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder=new BarcodeEncoder();
                    Bitmap bitmap=barcodeEncoder.createBitmap(bitMatrix);
                    imageViewQRCode.setImageBitmap(bitmap);
                }
                catch(WriterException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    public void init()
    {
        buttonGenerate=findViewById(R.id.buttonGenerate);
        editTextBemenet=findViewById(R.id.editTextBemenet);
        imageViewQRCode=findViewById(R.id.imageViewQRCode);
    }
}
