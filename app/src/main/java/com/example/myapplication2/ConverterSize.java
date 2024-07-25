package com.example.myapplication2;

import android.content.Context;
import android.util.DisplayMetrics;

public class ConverterSize {
    public static float pxToDp(float px, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return px / ((float) displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
    public static float dpToPx(float dp, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return dp * ((float) displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}
