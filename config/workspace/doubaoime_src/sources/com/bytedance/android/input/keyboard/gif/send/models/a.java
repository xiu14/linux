package com.bytedance.android.input.keyboard.gif.send.models;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeMimeType;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private final Context a;
    private final MediaSendMode b;

    /* renamed from: c, reason: collision with root package name */
    private final ImeMimeType f2761c;

    /* renamed from: d, reason: collision with root package name */
    private final Uri f2762d;

    public a(Context context, MediaSendMode mediaSendMode, ImeMimeType imeMimeType, Uri uri) {
        l.f(context, "context");
        l.f(mediaSendMode, "mode");
        l.f(imeMimeType, "mediaType");
        l.f(uri, "mediaUri");
        this.a = context;
        this.b = mediaSendMode;
        this.f2761c = imeMimeType;
        this.f2762d = uri;
    }

    public final Context a() {
        return this.a;
    }

    public final Uri b() {
        return this.f2762d;
    }

    public final MediaSendMode c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && this.b == aVar.b && this.f2761c == aVar.f2761c && l.a(this.f2762d, aVar.f2762d);
    }

    public int hashCode() {
        return this.f2762d.hashCode() + ((this.f2761c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MediaSendRequest(context=");
        M.append(this.a);
        M.append(", mode=");
        M.append(this.b);
        M.append(", mediaType=");
        M.append(this.f2761c);
        M.append(", mediaUri=");
        M.append(this.f2762d);
        M.append(')');
        return M.toString();
    }
}
