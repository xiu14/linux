package com.obric.appstore.autoupdate;

import android.content.Context;
import android.os.Process;
import android.view.View;

/* loaded from: classes2.dex */
class b implements View.OnClickListener {
    final /* synthetic */ d a;

    b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        Context context;
        String str;
        i = this.a.f7513c;
        if (i == 2) {
            Process.killProcess(Process.myPid());
        } else {
            e e2 = e.e();
            context = this.a.a;
            str = this.a.b;
            e2.c(context, str, -1);
        }
        d.d(this.a);
    }
}
