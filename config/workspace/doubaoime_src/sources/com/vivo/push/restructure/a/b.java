package com.vivo.push.restructure.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.u;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class b implements a {
    private Intent a;

    /* renamed from: c, reason: collision with root package name */
    private com.vivo.push.restructure.request.a.a f8872c;

    /* renamed from: e, reason: collision with root package name */
    private InsideNotificationItem f8874e;

    /* renamed from: f, reason: collision with root package name */
    private UnvarnishedMessage f8875f;
    private String b = "";

    /* renamed from: d, reason: collision with root package name */
    private String f8873d = "";

    public b(Intent intent) {
        this.a = intent;
    }

    private boolean n() {
        return j() == 4;
    }

    private boolean o() {
        return j() == 3;
    }

    private InsideNotificationItem p() {
        InsideNotificationItem insideNotificationItem = this.f8874e;
        if (insideNotificationItem != null) {
            return insideNotificationItem;
        }
        InsideNotificationItem insideNotificationItem2 = null;
        Intent intent = this.a;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("notification_v1");
                if (stringExtra != null && (insideNotificationItem2 = u.a(stringExtra)) != null) {
                    insideNotificationItem2.setMsgId(Long.parseLong(a()));
                }
            } catch (Exception e2) {
                e.a.a.a.a.h0(e2, new StringBuilder("getNotificationMessage "), "ReceivedMessageImpl");
            }
        }
        this.f8874e = insideNotificationItem2;
        return insideNotificationItem2;
    }

    private UnvarnishedMessage q() {
        UnvarnishedMessage unvarnishedMessage;
        Exception e2;
        String stringExtra;
        UnvarnishedMessage unvarnishedMessage2 = this.f8875f;
        if (unvarnishedMessage2 != null) {
            return unvarnishedMessage2;
        }
        UnvarnishedMessage unvarnishedMessage3 = null;
        Intent intent = this.a;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("msg_v1");
            } catch (Exception e3) {
                unvarnishedMessage = null;
                e2 = e3;
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                unvarnishedMessage = new UnvarnishedMessage(stringExtra);
                try {
                    unvarnishedMessage.setMsgId(Long.parseLong(a()));
                } catch (Exception e4) {
                    e2 = e4;
                    e.a.a.a.a.h0(e2, new StringBuilder("getTransmissionMessage "), "ReceivedMessageImpl");
                    unvarnishedMessage3 = unvarnishedMessage;
                    this.f8875f = unvarnishedMessage3;
                    return unvarnishedMessage3;
                }
                unvarnishedMessage3 = unvarnishedMessage;
            }
        }
        this.f8875f = unvarnishedMessage3;
        return unvarnishedMessage3;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String a() {
        Bundle extras;
        Intent intent = this.a;
        long j = (intent == null || (extras = intent.getExtras()) == null) ? 0L : extras.getLong("notify_id", 0L);
        return j != 0 ? String.valueOf(j) : "";
    }

    @Override // com.vivo.push.restructure.a.a
    public final Intent b() {
        return this.a;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String c() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = this.a.getStringExtra("req_id");
        }
        return this.b;
    }

    @Override // com.vivo.push.restructure.a.a
    public final long d() {
        Intent intent = this.a;
        if (intent != null) {
            return intent.getLongExtra("ipc_start_time", 0L);
        }
        return 0L;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean e() {
        Intent intent = this.a;
        if (intent != null) {
            return intent.getBooleanExtra("core_support_monitor", false);
        }
        return false;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean f() {
        Bundle extras;
        Intent intent = this.a;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return false;
        }
        return extras.getBoolean("client_collect_node", false);
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean g() {
        com.vivo.push.restructure.request.a.a h = h();
        return h != null && h.a() == 2018;
    }

    @Override // com.vivo.push.restructure.a.a
    public final com.vivo.push.restructure.request.a.a h() {
        String stringExtra;
        com.vivo.push.restructure.request.a.a.a aVar;
        if (this.f8872c == null && (stringExtra = this.a.getStringExtra("cf_content")) != null) {
            try {
                aVar = new com.vivo.push.restructure.request.a.a.a(stringExtra);
            } catch (JSONException unused) {
                aVar = null;
            }
            if (aVar != null) {
                this.f8872c = (com.vivo.push.restructure.request.a.a) com.vivo.push.restructure.request.a.a.a.a(aVar);
            }
        }
        return this.f8872c;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String i() {
        if (TextUtils.isEmpty(this.f8873d)) {
            this.f8873d = this.a.getStringExtra("content");
        }
        return this.f8873d;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int j() {
        Intent intent = this.a;
        if (intent == null) {
            return -1;
        }
        int intExtra = intent.getIntExtra(com.heytap.mcssdk.constant.b.y, -1);
        return intExtra < 0 ? this.a.getIntExtra("method", -1) : intExtra;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean k() {
        return j() == 5;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int l() {
        if (this.a == null) {
            return 0;
        }
        if (n() && p() != null) {
            return p().getTargetType();
        }
        if (!o() || q() == null) {
            return 0;
        }
        return q().getTargetType();
    }

    @Override // com.vivo.push.restructure.a.a
    public final String m() {
        return this.a == null ? "" : (!n() || p() == null) ? (!o() || q() == null) ? "" : q().getTragetContent() : p().getTargetContent();
    }
}
