package com.obric.appstore.autoupdate;

import android.os.Process;
import android.view.View;
import com.obric.appstore.autoupdate.g;

/* loaded from: classes2.dex */
class f implements View.OnClickListener {
    final /* synthetic */ g a;

    f(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar;
        int i;
        e.e().j(this.a.a, this.a.b);
        bVar = this.a.f7520d;
        bVar.removeCallbacksAndMessages(null);
        this.a.f();
        i = this.a.f7519c;
        if (i == 2) {
            Process.killProcess(Process.myPid());
        }
    }
}
