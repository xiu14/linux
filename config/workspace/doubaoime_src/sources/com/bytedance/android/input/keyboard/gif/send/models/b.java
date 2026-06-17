package com.bytedance.android.input.keyboard.gif.send.models;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    private final MediaSendResultState a;
    private final MediaSendMode b;

    public b(MediaSendResultState mediaSendResultState, MediaSendMode mediaSendMode) {
        l.f(mediaSendResultState, "resultState");
        l.f(mediaSendMode, "mode");
        this.a = mediaSendResultState;
        this.b = mediaSendMode;
    }

    public final MediaSendMode a() {
        return this.b;
    }

    public final MediaSendResultState b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MediaSendResult(resultState=");
        M.append(this.a);
        M.append(", mode=");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
