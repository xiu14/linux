package com.airbnb.lottie.x;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class q {
    private static SparseArrayCompat<WeakReference<Interpolator>> b;
    private static final Interpolator a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static JsonReader.a f1443c = JsonReader.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static JsonReader.a f1444d = JsonReader.a.a("x", "y");

    q() {
    }

    private static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> weakReference;
        Interpolator create;
        pointF.x = com.airbnb.lottie.y.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.y.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.y.g.b(pointF2.x, -1.0f, 1.0f);
        float b2 = com.airbnb.lottie.y.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        int i = com.airbnb.lottie.y.h.f1458g;
        int i2 = f2 != 0.0f ? (int) (527 * f2) : 17;
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        if (f4 != 0.0f) {
            i2 = (int) (i2 * 31 * f4);
        }
        if (b2 != 0.0f) {
            i2 = (int) (i2 * 31 * b2);
        }
        synchronized (q.class) {
            if (b == null) {
                b = new SparseArrayCompat<>();
            }
            weakReference = b.get(i2);
        }
        Interpolator interpolator = weakReference != null ? weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                create = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                create = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = create;
            try {
                WeakReference<Interpolator> weakReference2 = new WeakReference<>(interpolator);
                synchronized (q.class) {
                    b.put(i2, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    static <T> com.airbnb.lottie.z.a<T> b(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f2, H<T> h, boolean z, boolean z2) throws IOException {
        Interpolator a2;
        T t;
        Interpolator interpolator;
        Interpolator a3;
        Interpolator a4;
        T t2;
        PointF pointF;
        com.airbnb.lottie.z.a<T> aVar;
        PointF pointF2;
        PointF pointF3;
        float f3;
        PointF pointF4;
        float f4;
        int i = 1;
        if (!z || !z2) {
            if (!z) {
                return new com.airbnb.lottie.z.a<>(h.a(jsonReader, f2));
            }
            jsonReader.h();
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            PointF pointF8 = null;
            boolean z3 = false;
            T t3 = null;
            float f5 = 0.0f;
            T t4 = null;
            while (jsonReader.r()) {
                switch (jsonReader.I(f1443c)) {
                    case 0:
                        f5 = (float) jsonReader.w();
                        break;
                    case 1:
                        t3 = h.a(jsonReader, f2);
                        break;
                    case 2:
                        t4 = h.a(jsonReader, f2);
                        break;
                    case 3:
                        pointF8 = p.b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointF5 = p.b(jsonReader, 1.0f);
                        break;
                    case 5:
                        if (jsonReader.x() != 1) {
                            z3 = false;
                            break;
                        } else {
                            z3 = true;
                            break;
                        }
                    case 6:
                        pointF6 = p.b(jsonReader, f2);
                        break;
                    case 7:
                        pointF7 = p.b(jsonReader, f2);
                        break;
                    default:
                        jsonReader.N();
                        break;
                }
            }
            jsonReader.o();
            if (z3) {
                a2 = a;
                t = t3;
            } else {
                a2 = (pointF8 == null || pointF5 == null) ? a : a(pointF8, pointF5);
                t = t4;
            }
            com.airbnb.lottie.z.a<T> aVar2 = new com.airbnb.lottie.z.a<>(gVar, t3, t, a2, f5, null);
            aVar2.o = pointF6;
            aVar2.p = pointF7;
            return aVar2;
        }
        jsonReader.h();
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        int i2 = 0;
        PointF pointF12 = null;
        T t5 = null;
        PointF pointF13 = null;
        PointF pointF14 = null;
        PointF pointF15 = null;
        float f6 = 0.0f;
        PointF pointF16 = null;
        T t6 = null;
        while (jsonReader.r()) {
            switch (jsonReader.I(f1443c)) {
                case 0:
                    pointF2 = pointF11;
                    pointF3 = pointF16;
                    f6 = (float) jsonReader.w();
                    pointF16 = pointF3;
                    pointF11 = pointF2;
                    i = 1;
                    break;
                case 1:
                    pointF2 = pointF11;
                    pointF3 = pointF16;
                    t5 = h.a(jsonReader, f2);
                    pointF16 = pointF3;
                    pointF11 = pointF2;
                    i = 1;
                    break;
                case 2:
                    pointF2 = pointF11;
                    pointF3 = pointF16;
                    t6 = h.a(jsonReader, f2);
                    pointF16 = pointF3;
                    pointF11 = pointF2;
                    i = 1;
                    break;
                case 3:
                    pointF2 = pointF11;
                    f3 = f6;
                    pointF3 = pointF16;
                    if (jsonReader.G() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.h();
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (jsonReader.r()) {
                            int I = jsonReader.I(f1444d);
                            if (I == 0) {
                                JsonReader.Token G = jsonReader.G();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (G == token) {
                                    f9 = (float) jsonReader.w();
                                    f7 = f9;
                                } else {
                                    jsonReader.d();
                                    f7 = (float) jsonReader.w();
                                    f9 = jsonReader.G() == token ? (float) jsonReader.w() : f7;
                                    jsonReader.l();
                                }
                            } else if (I != 1) {
                                jsonReader.N();
                            } else {
                                JsonReader.Token G2 = jsonReader.G();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (G2 == token2) {
                                    f10 = (float) jsonReader.w();
                                    f8 = f10;
                                } else {
                                    jsonReader.d();
                                    f8 = (float) jsonReader.w();
                                    f10 = jsonReader.G() == token2 ? (float) jsonReader.w() : f8;
                                    jsonReader.l();
                                }
                            }
                        }
                        PointF pointF17 = new PointF(f7, f8);
                        PointF pointF18 = new PointF(f9, f10);
                        jsonReader.o();
                        pointF14 = pointF17;
                        pointF15 = pointF18;
                        f6 = f3;
                        pointF16 = pointF3;
                        pointF11 = pointF2;
                        i = 1;
                        break;
                    } else {
                        f6 = f3;
                        pointF12 = p.b(jsonReader, f2);
                        pointF16 = pointF3;
                        pointF11 = pointF2;
                        i = 1;
                    }
                case 4:
                    if (jsonReader.G() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.h();
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (jsonReader.r()) {
                            PointF pointF19 = pointF16;
                            int I2 = jsonReader.I(f1444d);
                            if (I2 != 0) {
                                pointF4 = pointF11;
                                if (I2 != 1) {
                                    jsonReader.N();
                                } else {
                                    JsonReader.Token G3 = jsonReader.G();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (G3 == token3) {
                                        f12 = (float) jsonReader.w();
                                        f14 = f12;
                                    } else {
                                        jsonReader.d();
                                        f4 = f6;
                                        f12 = (float) jsonReader.w();
                                        f14 = jsonReader.G() == token3 ? (float) jsonReader.w() : f12;
                                        jsonReader.l();
                                    }
                                }
                                f4 = f6;
                            } else {
                                pointF4 = pointF11;
                                f4 = f6;
                                JsonReader.Token G4 = jsonReader.G();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (G4 == token4) {
                                    f11 = (float) jsonReader.w();
                                    f13 = f11;
                                } else {
                                    jsonReader.d();
                                    f11 = (float) jsonReader.w();
                                    f13 = jsonReader.G() == token4 ? (float) jsonReader.w() : f11;
                                    jsonReader.l();
                                }
                            }
                            pointF16 = pointF19;
                            f6 = f4;
                            pointF11 = pointF4;
                        }
                        pointF2 = pointF11;
                        f3 = f6;
                        pointF3 = pointF16;
                        PointF pointF20 = new PointF(f11, f12);
                        PointF pointF21 = new PointF(f13, f14);
                        jsonReader.o();
                        pointF10 = pointF21;
                        pointF9 = pointF20;
                        f6 = f3;
                        pointF16 = pointF3;
                        pointF11 = pointF2;
                        i = 1;
                        break;
                    } else {
                        pointF2 = pointF11;
                        pointF3 = pointF16;
                        pointF13 = p.b(jsonReader, f2);
                        pointF16 = pointF3;
                        pointF11 = pointF2;
                        i = 1;
                    }
                case 5:
                    if (jsonReader.x() != i) {
                        i2 = 0;
                        break;
                    } else {
                        i2 = i;
                        break;
                    }
                case 6:
                    pointF16 = p.b(jsonReader, f2);
                    break;
                case 7:
                    pointF11 = p.b(jsonReader, f2);
                    break;
                default:
                    pointF2 = pointF11;
                    pointF3 = pointF16;
                    jsonReader.N();
                    pointF16 = pointF3;
                    pointF11 = pointF2;
                    i = 1;
                    break;
            }
        }
        PointF pointF22 = pointF11;
        float f15 = f6;
        PointF pointF23 = pointF16;
        jsonReader.o();
        if (i2 != 0) {
            interpolator = a;
            t6 = t5;
        } else if (pointF12 != null && pointF13 != null) {
            interpolator = a(pointF12, pointF13);
        } else {
            if (pointF14 != null && pointF15 != null && pointF9 != null && pointF10 != null) {
                a3 = a(pointF14, pointF9);
                a4 = a(pointF15, pointF10);
                t2 = t6;
                interpolator = null;
                if (a3 != null || a4 == null) {
                    pointF = pointF23;
                    aVar = new com.airbnb.lottie.z.a<>(gVar, t5, t2, interpolator, f15, null);
                } else {
                    pointF = pointF23;
                    aVar = new com.airbnb.lottie.z.a<>(gVar, t5, t2, a3, a4, f15, null);
                }
                aVar.o = pointF;
                aVar.p = pointF22;
                return aVar;
            }
            interpolator = a;
        }
        t2 = t6;
        a3 = null;
        a4 = null;
        if (a3 != null) {
        }
        pointF = pointF23;
        aVar = new com.airbnb.lottie.z.a<>(gVar, t5, t2, interpolator, f15, null);
        aVar.o = pointF;
        aVar.p = pointF22;
        return aVar;
    }
}
