package com.pdf.viewer;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class PdfViewer extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("openPDF")) {
            String filePath = args.getString(0);
            openPDF(filePath);
            callbackContext.success("Opening PDF: " + filePath);
            return true;
        }
        return false;
    }

    private void openPDF(String filePath) {
        Intent intent = new Intent(this.cordova.getActivity(), PdfViewerActivity.class);
        intent.putExtra("pdfPath", filePath);
        this.cordova.getActivity().startActivity(intent);
    }
}
