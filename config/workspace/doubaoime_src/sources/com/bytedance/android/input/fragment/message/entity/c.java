package com.bytedance.android.input.fragment.message.entity;

import com.bytedance.android.input.fragment.message.entity.MessageState;
import com.bytedance.common.wschannel.WsConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c {

    @SerializedName("id")
    private final String a;

    @SerializedName("avatar")
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    private final String f2350c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("desc")
    private final String f2351d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("send_timestamp")
    private final String f2352e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("content")
    private final b f2353f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName(WsConstants.KEY_CONNECTION_STATE)
    private int f2354g;
    private transient boolean h;

    public c() {
        b bVar = new b(null, null, 3);
        int code = MessageState.UNREAD.getCode();
        l.f("", "id");
        l.f("", "avatar");
        l.f("", "title");
        l.f("", "desc");
        l.f("", "sendTimestamp");
        l.f(bVar, "content");
        this.a = "";
        this.b = "";
        this.f2350c = "";
        this.f2351d = "";
        this.f2352e = "";
        this.f2353f = bVar;
        this.f2354g = code;
        this.h = false;
    }

    public final String a() {
        return this.b;
    }

    public final b b() {
        return this.f2353f;
    }

    public final String c() {
        return this.f2351d;
    }

    public final String d() {
        return this.a;
    }

    public final MessageState e() {
        MessageState messageState;
        MessageState.a aVar = MessageState.Companion;
        int i = this.f2354g;
        Objects.requireNonNull(aVar);
        MessageState[] values = MessageState.values();
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                messageState = null;
                break;
            }
            messageState = values[i2];
            if (messageState.getCode() == i) {
                break;
            }
            i2++;
        }
        return messageState == null ? MessageState.UNREAD : messageState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && l.a(this.f2350c, cVar.f2350c) && l.a(this.f2351d, cVar.f2351d) && l.a(this.f2352e, cVar.f2352e) && l.a(this.f2353f, cVar.f2353f) && this.f2354g == cVar.f2354g && this.h == cVar.h;
    }

    public final String f() {
        return this.f2352e;
    }

    public final int g() {
        return this.f2354g;
    }

    public final String h() {
        return this.f2350c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = e.a.a.a.a.I(this.f2354g, (this.f2353f.hashCode() + e.a.a.a.a.p0(this.f2352e, e.a.a.a.a.p0(this.f2351d, e.a.a.a.a.p0(this.f2350c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        boolean z = this.h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return I + i;
    }

    public final boolean i() {
        return this.h;
    }

    public final void j(boolean z) {
        this.h = z;
    }

    public final void k(int i) {
        this.f2354g = i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MessageItemData(id=");
        M.append(this.a);
        M.append(", avatar=");
        M.append(this.b);
        M.append(", title=");
        M.append(this.f2350c);
        M.append(", desc=");
        M.append(this.f2351d);
        M.append(", sendTimestamp=");
        M.append(this.f2352e);
        M.append(", content=");
        M.append(this.f2353f);
        M.append(", state=");
        M.append(this.f2354g);
        M.append(", isExpanded=");
        return e.a.a.a.a.L(M, this.h, ')');
    }
}
