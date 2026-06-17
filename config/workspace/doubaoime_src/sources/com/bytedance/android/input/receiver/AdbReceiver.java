package com.bytedance.android.input.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import d.a.b.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class AdbReceiver extends BroadcastReceiver {
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public void a() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        String c2 = a.c(aVar);
        if (c2 == "daily_debug" || c2 == "local_test" || c2 == "auto_test" || c2 == "auto_test_debug") {
            IntentFilter intentFilter = new IntentFilter("ADB_INPUT_TEXT");
            intentFilter.addAction("ADB_INPUT_CODE");
            intentFilter.addAction("ADB_INPUT_B64");
            intentFilter.addAction("com.bytedance.android.autoinput");
            KeyboardJni.getService().registerReceiver(this, intentFilter);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0.equals("ADB_INPUT_TEXT") == false) goto L26;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.receiver.AdbReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
