package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.manager.C;

/* loaded from: classes.dex */
class u implements C.d {
    final /* synthetic */ String a;
    final /* synthetic */ k b;

    u(k kVar, String str) {
        this.b = kVar;
        this.a = str;
    }

    @RequiresApi(api = 21)
    public void a(Uri uri) {
        F f2;
        if (uri != null) {
            this.b.C0(uri);
            return;
        }
        this.b.I0(this.a);
        Context context = this.b.x0;
        f2 = this.b.f4821f;
        Toast.makeText(context, f2.f("sdk31"), 0).show();
    }
}
