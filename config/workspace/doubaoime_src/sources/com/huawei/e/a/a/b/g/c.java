package com.huawei.e.a.a.b.g;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class c extends AsyncTask<Context, Integer, Boolean> {
    private static final String a = c.class.getSimpleName();
    private static volatile boolean b = false;

    /* JADX WARN: Removed duplicated region for block: B:5:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            boolean r0 = com.huawei.e.a.a.b.g.c.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
        L6:
            r0 = r2
            goto L4a
        L8:
            android.content.Context r0 = com.huawei.e.a.a.b.g.b.f()
            if (r0 != 0) goto L16
            java.lang.String r0 = com.huawei.e.a.a.b.g.c.a
            java.lang.String r3 = "checkUpgradeBks, context is null"
            com.huawei.e.a.a.b.g.b.e(r0, r3)
            goto L6
        L16:
            com.huawei.e.a.a.b.g.c.b = r1
            r3 = 0
            android.content.SharedPreferences r5 = com.huawei.e.a.a.b.g.e.a(r0)
            java.lang.String r6 = "lastCheckTime"
            long r3 = r5.getLong(r6, r3)
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r7 - r3
            r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L42
            android.content.SharedPreferences r0 = com.huawei.e.a.a.b.g.e.a(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r7)
            r0.apply()
            r0 = r1
            goto L4a
        L42:
            java.lang.String r0 = com.huawei.e.a.a.b.g.c.a
            java.lang.String r3 = "checkUpgradeBks, ignore"
            com.huawei.e.a.a.b.g.b.d(r0, r3)
            goto L6
        L4a:
            if (r0 == 0) goto L65
            java.lang.String r0 = com.huawei.e.a.a.b.g.c.a
            java.lang.String r3 = "checkUpgradeBks, execute check task"
            com.huawei.e.a.a.b.g.b.d(r0, r3)
            com.huawei.e.a.a.b.g.c r0 = new com.huawei.e.a.a.b.g.c
            r0.<init>()
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            android.content.Context[] r1 = new android.content.Context[r1]
            android.content.Context r4 = com.huawei.e.a.a.b.g.b.f()
            r1[r2] = r4
            r0.executeOnExecutor(r3, r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.e.a.a.b.g.c.a():void");
    }

    @Override // android.os.AsyncTask
    protected Boolean doInBackground(Context[] contextArr) {
        InputStream inputStream;
        Context[] contextArr2 = contextArr;
        System.currentTimeMillis();
        try {
            inputStream = a.j(contextArr2[0]);
        } catch (Exception e2) {
            String str = a;
            StringBuilder M = e.a.a.a.a.M("doInBackground: exception : ");
            M.append(e2.getMessage());
            b.c(str, M.toString());
            inputStream = null;
        }
        System.currentTimeMillis();
        if (inputStream == null) {
            return Boolean.FALSE;
        }
        com.bytedance.feedbackerlib.a.a(inputStream);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            b.d(a, "onPostExecute: upate done");
        } else {
            b.c(a, "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Integer[] numArr) {
        b.d(a, "onProgressUpdate");
    }
}
