package com.example.bog_app_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.link.DefaultLinkHandler;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class PDFViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("lean-haandbog.pdf")
                .pageFitPolicy(FitPolicy.BOTH)
                .pageSnap(true)
                .linkHandler(new DefaultLinkHandler(pdfView))
                .swipeHorizontal(true)
                .load();


    }
}