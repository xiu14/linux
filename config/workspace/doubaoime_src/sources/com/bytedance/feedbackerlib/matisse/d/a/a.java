package com.bytedance.feedbackerlib.matisse.d.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    public static String a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        if (!"content".equals(uri.getScheme())) {
            return uri.getPath();
        }
        try {
            Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static float b(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return Float.valueOf(decimalFormat.format((j / 1024.0f) / 1024.0f).replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SP, ".")).floatValue();
    }
}
