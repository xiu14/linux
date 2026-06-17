package ms.bd.c;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class g3 {
    public final Context a;

    public g3(Context context) {
        this.a = context;
    }

    public final String a() {
        Bundle call;
        if (Build.VERSION.SDK_INT <= 28) {
            return null;
        }
        try {
            ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient(Uri.parse((String) y2.a(16777217, 0, 0L, "bdea0a", new byte[]{112, 105, 24, 1, 10, 120, 117, 31, 123, 126, 112, 104, 88, 27, 26, 116, 104, 68, 122, 56, 119, 99, 24, 1, 6, 98, 120, 10, 61, 53, 118, 104, 2, 28, 27, 111})));
            call = acquireContentProviderClient.call((String) y2.a(16777217, 0, 0L, "211849", new byte[]{36, 54, 86, 99, 42, 7, 21}), null, null);
            acquireContentProviderClient.close();
        } catch (Exception unused) {
        }
        if (call == null) {
            return null;
        }
        if (call.getInt((String) y2.a(16777217, 0, 0L, "ef2aee", new byte[]{119, 107, 69, 16}), -1) == 0) {
            return call.getString((String) y2.a(16777217, 0, 0L, "8b0f07", new byte[]{32, 100}));
        }
        call.getString((String) y2.a(16777217, 0, 0L, "8d7aac", new byte[]{36, 99, 87, 6, 95, 115, 62}));
        return null;
    }
}
