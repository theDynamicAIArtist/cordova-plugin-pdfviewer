package com.pdf.viewer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PdfViewerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String path = getIntent().getStringExtra("pdfPath");

        // Placeholder – just show file path for now
        TextView textView = new TextView(this);
        textView.setText("PDF Path: " + path);
        textView.setTextSize(18);
        setContentView(textView);

        // Later: Use Android's PdfRenderer or MuPDF here
    }
}
