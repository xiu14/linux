package com.bumptech.glide;

import com.bumptech.glide.l;

/* loaded from: classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private com.bumptech.glide.request.l.c<? super TranscodeType> a = com.bumptech.glide.request.l.a.a();

    public final CHILD a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    final com.bumptech.glide.request.l.c<? super TranscodeType> b() {
        return this.a;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return com.bumptech.glide.util.j.b(this.a, ((l) obj).a);
        }
        return false;
    }

    public int hashCode() {
        com.bumptech.glide.request.l.c<? super TranscodeType> cVar = this.a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
