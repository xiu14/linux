package com.bytedance.android.input.common.t.a.d;

import com.bytedance.android.input.basic.IAppGlobals;
import com.mammon.audiosdk.SAMICore;
import java.io.File;

/* loaded from: classes.dex */
public final class b implements com.bytedance.android.input.common.asr.sdkImpl.i.b {
    private String a = "";
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2217c;

    private final void f(String str) {
        IAppGlobals.a.x("Asr-Flow-OfflineModelHandle", str);
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.b
    public boolean a() {
        return new File(this.a).exists();
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.b
    public void b() {
        long currentTimeMillis = System.currentTimeMillis();
        f("install model start");
        c();
        boolean exists = new File(this.a).exists();
        boolean z = false;
        if (exists && SAMICore.LoadOfflineAsrModel(this.a) == 0) {
            z = true;
        }
        this.b = z;
        this.f2217c = exists;
        StringBuilder M = e.a.a.a.a.M("install model end cost time = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        M.append(" success ? ");
        M.append(this.b);
        M.append(", preload ? ");
        M.append(this.f2217c);
        f(M.toString());
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.b
    public void c() {
        IAppGlobals.a aVar = IAppGlobals.a;
        String valueOf = String.valueOf(aVar.u().getString("asr_offline_model_path", ""));
        StringBuilder M = e.a.a.a.a.M("mOfflineModePreLoad = ");
        M.append(this.f2217c);
        M.append(", mOfflineModeLoadSuccess = ");
        M.append(this.b);
        M.append(", currentModelPath ");
        M.append(valueOf);
        aVar.j("Asr-Flow-OfflineModelHandle", M.toString());
        if (!(this.f2217c && this.b) && e.a.a.a.a.R0(valueOf)) {
            this.a = valueOf;
            f("refresh OfflineModel success");
        }
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.b
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        f("uninstall model start");
        SAMICore.UnloadOfflineAsrModel();
        IAppGlobals.a.p();
        this.f2217c = false;
        StringBuilder M = e.a.a.a.a.M("uninstall model end cost time = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        f(M.toString());
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.b
    public String e() {
        return this.a;
    }
}
