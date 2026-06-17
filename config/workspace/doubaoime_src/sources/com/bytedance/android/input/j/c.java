package com.bytedance.android.input.j;

import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c {
    private final String a;
    private final int b;

    public static final class a {
        private String a;
        private int b;

        public a(c cVar) {
            l.f(cVar, "request");
            this.a = cVar.a();
            this.b = cVar.b();
        }

        public final c a() {
            return new c(this.a, this.b);
        }

        public final a b(String str) {
            l.f(str, PushLog.KEY_VALUE);
            this.a = str;
            return this;
        }
    }

    public c(String str, int i) {
        l.f(str, "commitStr");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.a, cVar.a) && this.b == cVar.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImeCommitRequest(commitStr=");
        M.append(this.a);
        M.append(", type=");
        return e.a.a.a.a.C(M, this.b, ')');
    }
}
