package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.l;

/* loaded from: classes2.dex */
public abstract class e {

    static final class a extends e implements Serializable {
        private final l a;

        a(l lVar) {
            this.a = lVar;
        }

        @Override // org.threeten.bp.zone.e
        public l a(org.threeten.bp.d dVar) {
            return this.a;
        }

        @Override // org.threeten.bp.zone.e
        public d b(org.threeten.bp.f fVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.e
        public List<l> c(org.threeten.bp.f fVar) {
            return Collections.singletonList(this.a);
        }

        @Override // org.threeten.bp.zone.e
        public boolean d(org.threeten.bp.d dVar) {
            return false;
        }

        @Override // org.threeten.bp.zone.e
        public boolean e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.e() && this.a.equals(bVar.a(org.threeten.bp.d.f10802c));
        }

        @Override // org.threeten.bp.zone.e
        public boolean f(org.threeten.bp.f fVar, l lVar) {
            return this.a.equals(lVar);
        }

        public int hashCode() {
            return ((((this.a.hashCode() + 31) ^ 1) ^ 1) ^ (this.a.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("FixedRules:");
            M.append(this.a);
            return M.toString();
        }
    }

    e() {
    }

    public static e g(l lVar) {
        org.apache.http.conn.ssl.d.k(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return new a(lVar);
    }

    public abstract l a(org.threeten.bp.d dVar);

    public abstract d b(org.threeten.bp.f fVar);

    public abstract List<l> c(org.threeten.bp.f fVar);

    public abstract boolean d(org.threeten.bp.d dVar);

    public abstract boolean e();

    public abstract boolean f(org.threeten.bp.f fVar, l lVar);
}
