package com.bytedance.crash.dumper;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.Serializable;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class LocaleInfo implements Serializable {
    private static final String FILE_NAME = "locale.inf";
    private static final String KEY_LOC_NETWORK_ACCESS = "access";
    private static final String KEY_LOC_TIMEZONE = "timezone";
    private static final String UNKNOWN = "unknown";
    private static final long serialVersionUID = 1;
    public final String mNetworkAccessType = getNetworkAccessType();
    public final int mTimeZone = getTimeZone();

    private LocaleInfo() {
    }

    public static void dump(File file) {
        com.bytedance.crash.util.a.w(new File(file, FILE_NAME), new LocaleInfo());
    }

    @NonNull
    public static String getNetworkAccessType() {
        String a = com.bytedance.crash.util.d.a();
        return TextUtils.isEmpty(a) ? "unknown" : a;
    }

    public static int getTimeZone() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            return -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static LocaleInfo load(File file) {
        return (LocaleInfo) com.bytedance.crash.util.a.n(new File(file, FILE_NAME));
    }

    public static void putTo(JSONObject jSONObject) {
        putTo(jSONObject, null);
    }

    public static void putTo(JSONObject jSONObject, File file) {
        LocaleInfo load = file != null ? load(file) : new LocaleInfo();
        if (load != null) {
            try {
                jSONObject.put(KEY_LOC_NETWORK_ACCESS, load.mNetworkAccessType);
                jSONObject.put(KEY_LOC_TIMEZONE, load.mTimeZone);
            } catch (JSONException unused) {
            }
        }
    }
}
