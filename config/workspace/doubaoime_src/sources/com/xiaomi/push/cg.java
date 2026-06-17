package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.xiaomi.push.cj;

/* loaded from: classes2.dex */
public class cg extends cj.e {
    private String a;

    public cg(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.a = "MessageInsertJob";
        this.a = str2;
    }

    public static cg a(Context context, String str, hy hyVar) {
        byte[] a = je.a(hyVar);
        if (a == null || a.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", hyVar.d());
        contentValues.put("messageItem", a);
        contentValues.put("appId", ca.a(context).b());
        contentValues.put(DBDefinition.PACKAGE_NAME, ca.a(context).m161a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new cg(str, contentValues, "a job build to insert message to db");
    }
}
