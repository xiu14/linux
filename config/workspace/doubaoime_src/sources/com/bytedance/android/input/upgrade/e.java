package com.bytedance.android.input.upgrade;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.android.input.h.b;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.upgrade.DownloadClient;
import com.obric.common.upgrade.VersionCheckResponse;

/* loaded from: classes.dex */
public final class e implements ServiceConnection {
    final /* synthetic */ DownloadClient a;

    e(DownloadClient downloadClient) {
        this.a = downloadClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        DownloadClient.c cVar;
        VersionCheckResponse versionCheckResponse;
        com.bytedance.android.input.h.b bVar;
        d dVar;
        j.m("ImeDownload", "服务绑定上了");
        this.a.f3213c = b.a.d(iBinder);
        this.a.f3214d = true;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.a, 0);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        bVar = this.a.f3213c;
        if (bVar != null) {
            dVar = this.a.j;
            bVar.K(dVar);
        }
        cVar = this.a.h;
        if (cVar != null) {
            cVar.a();
        }
        versionCheckResponse = this.a.f3215e;
        if (versionCheckResponse != null) {
            this.a.u(versionCheckResponse);
        }
        this.a.f3215e = null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        j.r("ImeDownload", "Service disconnected unexpectedly.");
        this.a.f3214d = false;
        this.a.f3213c = null;
    }
}
