package org.threeten.bp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: org.threeten.bp.a$a, reason: collision with other inner class name */
    static final class C0489a extends a implements Serializable {
        private final k a;

        C0489a(k kVar) {
            this.a = kVar;
        }

        public k a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0489a) {
                return this.a.equals(((C0489a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 1;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SystemClock[");
            M.append(this.a);
            M.append("]");
            return M.toString();
        }
    }

    protected a() {
    }
}
