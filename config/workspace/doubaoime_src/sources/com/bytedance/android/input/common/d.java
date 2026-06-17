package com.bytedance.android.input.common;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.ContactsContract;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class d extends ContentObserver {
    private static d a;
    private static Context b;

    public d(Handler handler, Context context) {
        super(handler);
        b = context;
    }

    public static boolean a(Context context) {
        int checkSelfPermission = ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS");
        if (checkSelfPermission == -1) {
            com.bytedance.android.input.r.j.i("ContactsContentObserver", "PERMISSION_DENIED");
            return false;
        }
        if (checkSelfPermission == 0) {
            com.bytedance.android.input.r.j.i("ContactsContentObserver", "PERMISSION_GRANTED");
            return true;
        }
        com.bytedance.android.input.r.j.i("ContactsContentObserver", "PERMISSION_NEVER_ASK");
        return false;
    }

    public static boolean b() {
        return a != null;
    }

    public static void c(Context context) {
        if (a(context) && a == null) {
            com.bytedance.android.input.r.j.i("ContactsContentObserver", "registerContentObserver");
            a = new d(new Handler(), context);
            try {
                b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, false, a);
            } catch (SecurityException e2) {
                com.bytedance.android.input.r.j.k("ContactsContentObserver", "Failed to register ContentObserver for contacts", e2);
                a = null;
            }
        }
    }

    public static void d() {
        if (a == null) {
            return;
        }
        com.bytedance.android.input.r.j.i("ContactsContentObserver", "unregisterObjserver()");
        b.getContentResolver().unregisterContentObserver(a);
        a = null;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        StringBuilder M = e.a.a.a.a.M("onChange: uri=");
        M.append(ContactsContract.Contacts.CONTENT_URI.toString());
        com.bytedance.android.input.r.j.i("ContactsContentObserver", M.toString());
        e.a(true);
    }
}
