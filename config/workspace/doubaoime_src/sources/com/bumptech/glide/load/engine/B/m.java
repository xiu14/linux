package com.bumptech.glide.load.engine.B;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
/* loaded from: classes.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f1599d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f1600e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f1601f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f1602g;
    private static final Bitmap.Config[] h;
    private final c a = new c();
    private final g<b, Bitmap> b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f1603c = new HashMap();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    static final class b implements l {
        private final c a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f1604c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.B.l
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.f1604c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && com.bumptech.glide.util.j.b(this.f1604c, bVar.f1604c);
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.f1604c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.b, this.f1604c);
        }
    }

    @VisibleForTesting
    static class c extends com.bumptech.glide.load.engine.B.c<b> {
        c() {
        }

        @Override // com.bumptech.glide.load.engine.B.c
        protected b a() {
            return new b(this);
        }

        public b d(int i, Bitmap.Config config) {
            b b = b();
            b.b(i, config);
            return b;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f1599d = configArr;
        f1600e = configArr;
        f1601f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f1602g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f1603c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1603c.put(config, treeMap);
        return treeMap;
    }

    @Nullable
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d2 = com.bumptech.glide.util.j.d(config) * i * i2;
        b b2 = this.a.b();
        b2.b(d2, config);
        int i3 = 0;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f1600e;
        } else {
            int i4 = a.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : h : f1602g : f1601f : f1599d;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d2));
            if (ceilingKey == null || ceilingKey.intValue() > d2 * 8) {
                i3++;
            } else if (ceilingKey.intValue() != d2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.a.c(b2);
                b2 = this.a.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a2 = this.b.a(b2);
        if (a2 != null) {
            a(Integer.valueOf(b2.b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    public String e(Bitmap bitmap) {
        return c(com.bumptech.glide.util.j.c(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b d2 = this.a.d(com.bumptech.glide.util.j.c(bitmap), bitmap.getConfig());
        this.b.b(d2, bitmap);
        NavigableMap<Integer, Integer> d3 = d(bitmap.getConfig());
        Integer num = (Integer) d3.get(Integer.valueOf(d2.b));
        d3.put(Integer.valueOf(d2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Nullable
    public Bitmap g() {
        Bitmap c2 = this.b.c();
        if (c2 != null) {
            a(Integer.valueOf(com.bumptech.glide.util.j.c(c2)), c2);
        }
        return c2;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SizeConfigStrategy{groupedMap=");
        M.append(this.b);
        M.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f1603c.entrySet()) {
            M.append(entry.getKey());
            M.append('[');
            M.append(entry.getValue());
            M.append("], ");
        }
        if (!this.f1603c.isEmpty()) {
            M.replace(M.length() - 2, M.length(), "");
        }
        M.append(")}");
        return M.toString();
    }
}
