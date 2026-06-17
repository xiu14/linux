package com.vivo.push.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public final class p extends com.vivo.push.v {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f8795c;

    /* renamed from: d, reason: collision with root package name */
    private long f8796d;

    /* renamed from: e, reason: collision with root package name */
    private InsideNotificationItem f8797e;

    /* renamed from: f, reason: collision with root package name */
    private String f8798f;

    /* renamed from: g, reason: collision with root package name */
    private String f8799g;
    private Uri h;
    private String i;
    private Bundle j;

    public p(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.a = str;
        this.f8796d = j;
        this.f8797e = insideNotificationItem;
    }

    public final void a(Uri uri) {
        this.h = uri;
    }

    public final void b(String str) {
        this.f8798f = str;
    }

    public final void c(String str) {
        this.f8799g = str;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final String e() {
        return this.a;
    }

    public final long f() {
        return this.f8796d;
    }

    public final InsideNotificationItem g() {
        return this.f8797e;
    }

    public final String h() {
        return this.f8798f;
    }

    public final String i() {
        return this.f8799g;
    }

    public final String j() {
        return this.i;
    }

    public final Uri k() {
        return this.h;
    }

    public final Bundle l() {
        if (this.j == null) {
            return null;
        }
        Bundle bundle = new Bundle(this.j);
        try {
            bundle.remove("command_type");
            bundle.remove("security_avoid_pull");
            bundle.remove("security_avoid_pull_rsa");
            bundle.remove("security_avoid_rsa_public_key");
            bundle.remove("security_avoid_rsa_public_key");
            bundle.remove("notify_action");
            bundle.remove("notify_componet_pkg");
            bundle.remove("notify_componet_class_name");
            bundle.remove("notification_v1");
            bundle.remove(com.heytap.mcssdk.constant.b.y);
            bundle.remove(Constants.PACKAGE_NAME);
            bundle.remove("method");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bundle;
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "OnNotificationClickCommand";
    }

    private static Uri e(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a(Constants.PACKAGE_NAME, this.a);
        dVar.a("notify_id", this.f8796d);
        dVar.a("notification_v1", com.vivo.push.util.u.b(this.f8797e));
        dVar.a("open_pkg_name", this.b);
        dVar.a("open_pkg_name_encode", this.f8795c);
        dVar.a("notify_action", this.f8798f);
        dVar.a("notify_componet_pkg", this.f8799g);
        dVar.a("notify_componet_class_name", this.i);
        Uri uri = this.h;
        if (uri != null) {
            dVar.a("notify_uri_data", uri.toString());
        }
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.a = dVar.a(Constants.PACKAGE_NAME);
        this.f8796d = dVar.b("notify_id", -1L);
        this.b = dVar.a("open_pkg_name");
        this.f8795c = dVar.b("open_pkg_name_encode");
        this.f8798f = dVar.a("notify_action");
        this.f8799g = dVar.a("notify_componet_pkg");
        this.i = dVar.a("notify_componet_class_name");
        String a = dVar.a("notification_v1");
        if (!TextUtils.isEmpty(a)) {
            this.f8797e = com.vivo.push.util.u.a(a);
        }
        InsideNotificationItem insideNotificationItem = this.f8797e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f8796d);
        }
        String a2 = dVar.a("notify_uri_data");
        if (!TextUtils.isEmpty(a2)) {
            this.h = e(a2);
        }
        this.j = dVar.b();
    }

    public p() {
        super(5);
    }
}
