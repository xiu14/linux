package com.bytedance.android.doubaoime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements Runnable {
    final /* synthetic */ ImeService a;

    p(ImeService imeService) {
        this.a = imeService;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        str = this.a.w;
        if (!kotlin.s.c.l.a(format, str)) {
            str2 = this.a.w;
            if (str2.length() > 0) {
                com.bytedance.android.input.r.j.i("ImeService", "New day has started!");
                com.obric.appstore.autoupdate.e.e().g();
                this.a.l = false;
            }
            ImeService imeService = this.a;
            kotlin.s.c.l.e(format, "currentDate");
            imeService.w = format;
        }
        this.a.b.postDelayed(this, com.heytap.mcssdk.constant.a.f6886d);
    }
}
