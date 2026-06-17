package com.ss.ugc.effectplatform.util;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class g {
    private static final HashMap<String, float[]> a;
    private static final SparseArray<float[]> b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f8535c;

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.e f8536d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f8537e = new g();

    private static final class a {

        /* renamed from: d, reason: collision with root package name */
        private int f8539d;

        /* renamed from: e, reason: collision with root package name */
        private int f8540e;
        private String a = "unknown";
        private String b = "unknown";

        /* renamed from: c, reason: collision with root package name */
        private String f8538c = "unknown";

        /* renamed from: f, reason: collision with root package name */
        private double f8541f = -1.0d;

        /* renamed from: g, reason: collision with root package name */
        private String f8542g = "unknown";

        public final String a() {
            return this.f8542g;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.f8538c;
        }

        public final String d() {
            return this.b;
        }

        public final void e(double d2) {
            this.f8541f = d2;
        }

        public final void f(String str) {
            kotlin.s.c.l.g(str, "<set-?>");
            this.f8542g = str;
        }

        public final void g(int i) {
            this.f8539d = i;
        }

        public final void h(int i) {
            this.f8540e = i;
        }

        public final void i(String str) {
            kotlin.s.c.l.g(str, "<set-?>");
            this.a = str;
        }

        public final void j(String str) {
            kotlin.s.c.l.g(str, "<set-?>");
            this.f8538c = str;
        }

        public final void k(String str) {
            kotlin.s.c.l.g(str, "<set-?>");
            this.b = str;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("GPUInfo{renderer='");
            e.a.a.a.a.K0(M, this.a, "'", ", version='");
            e.a.a.a.a.K0(M, this.b, "'", ", vendor='");
            e.a.a.a.a.K0(M, this.f8538c, "'", ", maxFreq=");
            M.append(this.f8539d);
            M.append(", minFreq=");
            e.a.a.a.a.F0(M, this.f8540e, ", glVer=", -1, ", alusOrThroughput=");
            M.append(this.f8541f);
            M.append("}");
            return M.toString();
        }
    }

    static final class b extends m implements kotlin.s.b.a<a> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public a invoke() {
            return g.a(g.f8537e);
        }
    }

    static {
        HashMap<String, float[]> hashMap = new HashMap<>();
        a = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        b = sparseArray;
        f8535c = Pattern.compile("\\d+$");
        f8536d = kotlin.a.c(b.a);
        hashMap.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        hashMap.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        hashMap.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        hashMap.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        hashMap.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        hashMap.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(200, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(203, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(205, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(TypedValues.CycleType.TYPE_EASING, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(TypedValues.PositionType.TYPE_SIZE_PERCENT, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(TypedValues.PositionType.TYPE_PERCENT_X, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(TypedValues.PositionType.TYPE_CURVE_FIT, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(TypedValues.PositionType.TYPE_POSITION_TYPE, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(512, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    private g() {
    }

    public static final a a(g gVar) {
        Collection collection;
        a aVar = new a();
        try {
            c cVar = new c();
            cVar.c(16, 16);
            GL10 d2 = cVar.d();
            if (d2 != null) {
                String glGetString = d2.glGetString(7936);
                kotlin.s.c.l.b(glGetString, "it.glGetString(GL10.GL_VENDOR)");
                aVar.j(glGetString);
                String glGetString2 = d2.glGetString(7938);
                kotlin.s.c.l.b(glGetString2, "it.glGetString(GL10.GL_VERSION)");
                aVar.k(glGetString2);
                String glGetString3 = d2.glGetString(7937);
                kotlin.s.c.l.b(glGetString3, "it.glGetString(GL10.GL_RENDERER)");
                aVar.i(glGetString3);
                String glGetString4 = d2.glGetString(7939);
                kotlin.s.c.l.b(glGetString4, "it.glGetString(GL10.GL_EXTENSIONS)");
                aVar.f(glGetString4);
            }
            cVar.b();
            String d3 = aVar.d();
            if (kotlin.text.a.K(d3, "OpenGL ES", false, 2, null)) {
                String substring = d3.substring(9);
                kotlin.s.c.l.b(substring, "(this as java.lang.String).substring(startIndex)");
                d3 = kotlin.text.a.U(substring).toString();
                List<String> f2 = new kotlin.text.i(" ").f(d3, 0);
                if (!f2.isEmpty()) {
                    ListIterator<String> listIterator = f2.listIterator(f2.size());
                    while (listIterator.hasPrevious()) {
                        if (!(listIterator.previous().length() == 0)) {
                            collection = kotlin.collections.g.Z(f2, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kotlin.collections.l.a;
                Object[] array = collection.toArray(new String[0]);
                if (array == null) {
                    throw new kotlin.l("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                if (!(strArr.length == 0)) {
                    d3 = strArr[0];
                }
            }
            aVar.k(d3);
            aVar.g(gVar.f(aVar.b(), "max"));
            aVar.h(gVar.f(aVar.b(), "min"));
            aVar.e(gVar.c(aVar.b()));
        } catch (Throwable th) {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("get gpu info error:");
            M.append(th.getMessage());
            bVar.b("GPUUtils", M.toString(), null);
        }
        return aVar;
    }

    private final int b(String str) {
        Matcher matcher = f8535c.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(0);
            kotlin.s.c.l.b(group, "serial");
            if (group.length() > 0) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    private final a e() {
        return (a) f8536d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int f(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.g.f(java.lang.String, java.lang.String):int");
    }

    public final double c(String str) {
        kotlin.s.c.l.g(str, "renderer");
        if (str.length() > 0) {
            String lowerCase = str.toLowerCase();
            kotlin.s.c.l.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            float[] fArr = null;
            if (kotlin.text.a.K(lowerCase, "mali", false, 2, null)) {
                fArr = a.get(str);
            } else {
                String lowerCase2 = str.toLowerCase();
                kotlin.s.c.l.b(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (kotlin.text.a.d(lowerCase2, "adreno", false, 2, null)) {
                    fArr = b.get(b(str));
                }
            }
            if (fArr != null) {
                return fArr[2];
            }
        }
        return -1;
    }

    public final String d() {
        return e().a();
    }

    public final String g() {
        return e().b();
    }

    public final String h() {
        return e().c();
    }

    public final String i() {
        return e().d();
    }
}
