package com.bytedance.android.input.common.asr.sdkImp;

import com.bytedance.android.input.common.asr.api.IAsr;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class h implements e {
    private String a = "";
    private boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SdkImpl f2189c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IAsr.a f2190d;

    h(SdkImpl sdkImpl, IAsr.a aVar) {
        this.f2189c = sdkImpl;
        this.f2190d = aVar;
    }

    @Override // com.bytedance.android.input.common.asr.sdkImp.e
    public void a(boolean z, String str) {
        AtomicBoolean atomicBoolean;
        l.f(str, DBDefinition.TASK_ID);
        SdkImpl sdkImpl = this.f2189c;
        StringBuilder sb = new StringBuilder();
        sb.append("onSuccess back ");
        sb.append(this);
        sb.append(" mStart = ");
        atomicBoolean = this.f2189c.f2178g;
        sb.append(atomicBoolean);
        sb.append(", createHandle = ");
        sb.append(z);
        sb.append(", taskId = ");
        sb.append(str);
        sb.append(", mHandleStarted = ");
        sb.append(this.b);
        sdkImpl.z(sb.toString());
        this.a = str;
        if (z) {
            this.f2190d.a(true, str);
        } else if (this.b) {
            this.f2190d.a(false, str);
            this.b = false;
        }
    }

    @Override // com.bytedance.android.input.common.asr.sdkImp.e
    public void b(String str) {
        l.f(str, DBDefinition.TASK_ID);
        SdkImpl sdkImpl = this.f2189c;
        StringBuilder U = e.a.a.a.a.U("innerStart ListenerAsr#onFinished taskId = ", str, ", mTaskId = ");
        U.append(this.a);
        sdkImpl.y(U.toString());
        if (!l.a(this.a, str)) {
            if (!(str.length() == 0)) {
                return;
            }
        }
        this.f2190d.b();
    }

    @Override // com.bytedance.android.input.common.asr.sdkImp.e
    public void c(String str, boolean z, String str2, long j, boolean z2, boolean z3, boolean z4) {
        l.f(str, "text");
        l.f(str2, DBDefinition.TASK_ID);
        this.f2189c.y("innerStart ListenerAsr#onText text = " + str + ", isFinish = " + z + ", taskId = " + str2 + ", startTime = " + j + ", isVad = " + z2 + ", isOffline = " + z3);
        if (!l.a(this.a, str2)) {
            if (!(str2.length() == 0)) {
                return;
            }
        }
        this.f2190d.c(str, z, j, z2, z3, z4);
    }

    @Override // com.bytedance.android.input.common.asr.sdkImp.e
    public void d(IAsr.ErrorType errorType, int i, String str) {
        l.f(errorType, "errorType");
        l.f(str, DBDefinition.TASK_ID);
        this.f2189c.z("onFail " + this);
        if (!l.a(this.a, str)) {
            if (!(str.length() == 0)) {
                return;
            }
        }
        this.f2190d.d(errorType, i);
    }
}
