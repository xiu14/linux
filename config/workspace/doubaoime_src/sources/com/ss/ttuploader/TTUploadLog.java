package com.ss.ttuploader;

import android.util.Log;

/* loaded from: classes2.dex */
public class TTUploadLog {
    public static final String FORMAT = "<%s>%s";
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 6;
    public static final int LOG_INFO = 2;
    public static final int LOG_KILL = 4;
    public static final int LOG_TRACK = 3;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARN = 5;
    public static int LogTurnOn = 112;
    private static final String TAG = "TTUploadLog";

    public static final void d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            Log.d(TAG, String.format(FORMAT, str, str2));
        }
    }

    public static void e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            Log.e(TAG, String.format(FORMAT, str, str2));
        }
    }

    public static final void i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            Log.i(TAG, String.format(FORMAT, str, str2));
        }
    }

    public static final void k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            Log.i(TAG, String.format(FORMAT, str, str2));
        }
    }

    public static final void t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            Log.i(TAG, String.format(FORMAT, str, str2));
        }
    }

    public static final void turnOn(int i, int i2) {
        int i3 = (~(1 << i)) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }

    public static final void w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            Log.w(TAG, String.format(FORMAT, str, str2));
        }
    }
}
