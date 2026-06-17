package e.c.h.j;

import com.facebook.imagepipeline.image.i;
import com.facebook.imagepipeline.image.k;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements e {
    private final c a = new b(null);

    private static class b implements c {
        b(a aVar) {
        }

        @Override // e.c.h.j.g.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // e.c.h.j.g.c
        public int b() {
            return 0;
        }
    }

    public interface c {
        List<Integer> a();

        int b();
    }

    @Override // e.c.h.j.e
    public k a(int i) {
        return i.d(i, i >= this.a.b(), false);
    }

    @Override // e.c.h.j.e
    public int b(int i) {
        List<Integer> a2 = this.a.a();
        if (a2 == null || a2.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (a2.get(i2).intValue() > i) {
                return a2.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
