package com.bytedance.android.input.common;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 19)
/* loaded from: classes.dex */
public class n extends ContentObserver {
    private static final Uri b = Uri.parse("content://sms/");

    /* renamed from: c, reason: collision with root package name */
    private static n f2203c = null;
    private final Context a;

    public n(Handler handler, Context context) {
        super(handler);
        this.a = context;
    }

    public static void a(Context context) {
        if (f2203c != null) {
            return;
        }
        com.bytedance.android.input.r.j.i("SmsReadObserver", "registerContentObserver");
        try {
            f2203c = new n(new Handler(), context);
            context.getContentResolver().registerContentObserver(b, true, f2203c);
        } catch (SecurityException e2) {
            com.bytedance.android.input.r.j.k("SmsReadObserver", "Failed to register ContentObserver for sms", e2);
            f2203c = null;
        }
    }

    public static void b() {
        if (f2203c == null) {
            return;
        }
        com.bytedance.android.input.r.j.i("SmsReadObserver", "unregisterContentObserver()");
        f2203c.a.getContentResolver().unregisterContentObserver(f2203c);
        f2203c = null;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        onChange(z);
        com.bytedance.android.input.r.j.i("SmsReadObserver", "onChange: uri=" + uri.toString());
        if (uri.toString().startsWith("content://sms/raw")) {
            return;
        }
        m.b(this.a);
    }
}
