package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class p extends Thread {
    private Context a;
    private o b;

    public p(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    private static Intent a(Context context, o oVar) {
        if (oVar == null) {
            return null;
        }
        Intent b = e.b(context, oVar.c());
        if (oVar.m() == null) {
            if (oVar.a() != null) {
                Intent intent = new Intent(oVar.a());
                if (e.a(context, oVar.c(), intent).booleanValue()) {
                    b = intent;
                }
            }
            b.setPackage(oVar.c());
            return b;
        }
        try {
            Intent parseUri = Intent.parseUri(oVar.m(), 0);
            parseUri.setSelector(null);
            if (parseUri.getClipData() == null) {
                parseUri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
            }
            HMSLog.d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + parseUri.getAction());
            return e.a(context, oVar.c(), parseUri).booleanValue() ? parseUri : b;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("intentUri error,");
            M.append(e2.toString());
            HMSLog.w("PushSelfShowLog", M.toString());
            return b;
        }
    }

    private boolean b(Context context) {
        if ("cosa".equals(this.b.h())) {
            return a(context);
        }
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.i("PushSelfShowLog", "enter run()");
        try {
            if (!b(this.a) || b(this.a, this.b)) {
                return;
            }
            n.a(this.a, this.b);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", e2.toString());
        }
    }

    private boolean b(Context context, o oVar) {
        if (!"cosa".equals(oVar.h()) || a(context, oVar) != null) {
            return false;
        }
        HMSLog.d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    private boolean a(Context context) {
        return e.c(context, this.b.c());
    }
}
