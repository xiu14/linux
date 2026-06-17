package com.vivo.push.b;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class y extends com.vivo.push.v {
    private HashMap<String, String> a;
    private long b;

    public y() {
        super(2012);
    }

    public final void a(HashMap<String, String> hashMap) {
        this.a = hashMap;
    }

    @Override // com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        dVar.a("ReporterCommand.EXTRA_PARAMS", this.a);
        dVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        this.a = (HashMap) dVar.d("ReporterCommand.EXTRA_PARAMS");
        this.b = dVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    public final void e() {
        if (this.a == null) {
            com.vivo.push.util.t.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("report message reportType:");
        sb.append(this.b);
        sb.append(",msgId:");
        String str = this.a.get(com.heytap.mcssdk.constant.b.f6895c);
        if (TextUtils.isEmpty(str)) {
            str = this.a.get("message_id");
        }
        sb.append(str);
        com.vivo.push.util.t.d("ReporterCommand", sb.toString());
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return e.a.a.a.a.F(new StringBuilder("ReporterCommand（"), this.b, ")");
    }

    public y(long j) {
        this();
        this.b = j;
    }
}
