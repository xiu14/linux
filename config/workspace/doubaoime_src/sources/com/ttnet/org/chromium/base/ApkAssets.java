package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ApkAssets {
    @CalledByNative
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context b = c.b();
                if (!TextUtils.isEmpty(str2)) {
                    BundleUtils.a(b, str2);
                }
                assetFileDescriptor = b.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (IOException e2) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e2);
                }
                return jArr;
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            if (!e4.getMessage().equals("") && !e4.getMessage().equals(str)) {
                Log.e("ApkAssets", "Error while loading asset " + str + ": " + e4);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e5) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e5);
                }
            }
            return jArr2;
        }
    }
}
