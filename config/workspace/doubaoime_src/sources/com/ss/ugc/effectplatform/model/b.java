package com.ss.ugc.effectplatform.model;

import bytekn.foundation.io.file.g;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.huawei.hms.common.internal.RequestManager;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Exception f8496c;

    /* renamed from: d, reason: collision with root package name */
    private String f8497d;

    /* renamed from: e, reason: collision with root package name */
    private String f8498e;

    /* renamed from: f, reason: collision with root package name */
    private String f8499f;

    public b(int i) {
        this.a = -1;
        this.a = i;
        this.b = com.ss.ugc.effectplatform.b.a(i);
        this.f8496c = null;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public String toString() {
        if (this.f8496c == null) {
            StringBuilder M = e.a.a.a.a.M("ExceptionResult{errorCode=");
            M.append(this.a);
            M.append(", msg='");
            M.append(this.b);
            M.append(", requestUrl='");
            e.a.a.a.a.G0(M, this.f8497d, '\'', ", selectedHost='");
            e.a.a.a.a.G0(M, this.f8498e, '\'', ", remoteIp='");
            return e.a.a.a.a.H(M, this.f8499f, '\'', '}');
        }
        StringBuilder M2 = e.a.a.a.a.M("ExceptionResult{errorCode=");
        M2.append(this.a);
        M2.append(", msg='");
        e.a.a.a.a.G0(M2, this.b, '\'', ", requestUrl='");
        e.a.a.a.a.G0(M2, this.f8497d, '\'', ", selectedHost='");
        e.a.a.a.a.G0(M2, this.f8498e, '\'', ", remoteIp='");
        e.a.a.a.a.G0(M2, this.f8499f, '\'', ", exception=");
        Exception exc = this.f8496c;
        if (exc == null) {
            l.k();
            throw null;
        }
        M2.append(exc.getMessage());
        M2.append('}');
        return M2.toString();
    }

    public b(Exception exc) {
        this.a = -1;
        this.f8497d = null;
        this.f8498e = null;
        this.f8499f = null;
        this.f8496c = exc;
        if (exc instanceof com.ss.ugc.effectplatform.f.c) {
            this.a = ((com.ss.ugc.effectplatform.f.c) exc).a();
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof com.ss.ugc.effectplatform.f.d) {
            Objects.requireNonNull((com.ss.ugc.effectplatform.f.d) exc);
            this.a = 0;
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof com.ss.ugc.effectplatform.f.f) {
            this.a = 10015;
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof com.ss.ugc.effectplatform.f.e) {
            this.a = RequestManager.NOTIFY_CONNECT_SUSPENDED;
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof com.ss.ugc.effectplatform.f.b) {
            this.a = 10010;
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof g) {
            this.a = RequestManager.NOTIFY_CONNECT_FAILED;
            this.b = exc.getMessage();
            return;
        }
        if (exc instanceof com.ss.ugc.effectplatform.f.a) {
            this.a = 10021;
            this.b = exc.getMessage();
        } else {
            if (exc != null) {
                this.a = l.a("network unavailable", exc.getMessage()) ? RequestManager.NOTIFY_CONNECT_SUCCESS : DownloadRequest.ErrorCode.ERROR_MCS_NOT_SUPPORT_LIQUID;
                String message = exc.getMessage();
                this.b = message;
                if (message == null || message.length() == 0) {
                    this.b = exc.toString();
                    return;
                }
                return;
            }
            this.a = 1;
            this.b = com.ss.ugc.effectplatform.b.a(1);
        }
    }
}
