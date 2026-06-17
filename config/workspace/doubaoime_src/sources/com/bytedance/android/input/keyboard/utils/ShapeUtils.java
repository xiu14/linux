package com.bytedance.android.input.keyboard.utils;

import android.content.res.Resources;
import android.graphics.Path;

/* loaded from: classes.dex */
public class ShapeUtils {

    private enum ConnectorStyle {
        ARC,
        BEND,
        LINE
    }

    private static final class b {
        final boolean a;
        final float b;

        /* renamed from: c, reason: collision with root package name */
        final float f2802c;

        /* renamed from: d, reason: collision with root package name */
        final float f2803d;

        b(boolean z, float f2, float f3, float f4, a aVar) {
            this.a = z;
            this.b = f2;
            this.f2802c = f3;
            this.f2803d = f4;
        }
    }

    private static final class c {
        final float a;
        final float b;

        /* renamed from: c, reason: collision with root package name */
        final float f2804c;

        c(float f2, float f3, float f4, a aVar) {
            this.a = f2;
            this.b = f3;
            this.f2804c = f4;
        }
    }

    private static void a(Path path, boolean z, float f2, float f3, float f4, float f5, float f6, float f7) {
        float c2 = c(f5);
        if (c2 <= 0.0f) {
            return;
        }
        float f8 = 2.0f * c2;
        float f9 = 8.0f * c2;
        float f10 = 13.0f * c2;
        float f11 = f4 >= f2 ? 1.0f : -1.0f;
        float f12 = (9.5f * c2 * f7 * f11) + f2;
        float f13 = f3 + f9;
        float f14 = (f11 * f6) + f12;
        float f15 = (15.036999f * c2 * f7 * f11) + f14;
        float f16 = f13 + f10;
        float f17 = f3 + f8;
        float f18 = (2.5f * c2 * f7 * f11) + f2;
        float f19 = (4.5f * c2 * f7 * f11) + f14;
        float f20 = (9.0f * c2 * f7 * f11) + f14;
        float f21 = (11.5f * c2 * f7 * f11) + f14;
        float f22 = f13 + f8;
        float f23 = (f11 * 13.979f * c2 * f7) + f14;
        float f24 = (3.9830017f * c2) + f13;
        float f25 = (c2 * 5.5f) + f13;
        if (z) {
            path.cubicTo(f15, f25, f23, f24, f21, f22);
            path.cubicTo(f20, f13, f19, f13, f14, f13);
            path.lineTo(f12, f13);
            path.cubicTo(f18, f13, f2, f17, f2, f3);
            return;
        }
        path.cubicTo(f2, f17, f18, f13, f12, f13);
        path.lineTo(f14, f13);
        path.cubicTo(f19, f13, f20, f13, f21, f22);
        path.cubicTo(f23, f24, f15, f25, f15, f16);
    }

    private static void b(Path path, boolean z, boolean z2, float f2, float f3, float f4) {
        float h = h(z, 0.0f);
        float h2 = h(z, 11.521f);
        float f5 = z2 ? h2 : h;
        float f6 = z2 ? 64.19f : 40.0f;
        if (z2) {
            path.cubicTo(e.a.a.a.a.a(h(z, 11.521f), f5, f4, f2), e.a.a.a.a.a(63.279f, f6, f4, f3), e.a.a.a.a.a(h(z, 11.521f), f5, f4, f2), e.a.a.a.a.a(62.491f, f6, f4, f3), e.a.a.a.a.a(h(z, 11.534f), f5, f4, f2), e.a.a.a.a.a(61.801f, f6, f4, f3));
            path.cubicTo(e.a.a.a.a.a(h(z, 11.502f), f5, f4, f2), e.a.a.a.a.a(53.463f, f6, f4, f3), e.a.a.a.a.a(h(z, 9.447f), f5, f4, f2), e.a.a.a.a.a(51.125f, f6, f4, f3), e.a.a.a.a.a(h(z, 4.99f), f5, f4, f2), e.a.a.a.a.a(48.0f, f6, f4, f3));
            path.cubicTo(e.a.a.a.a.a(h(z, 0.499f), f5, f4, f2), e.a.a.a.a.a(44.85f, f6, f4, f3), e.a.a.a.a.a(h(z, 0.0f), f5, f4, f2), e.a.a.a.a.a(41.0f, f6, f4, f3), e.a.a.a.a.a(h, f5, f4, f2), e.a.a.a.a.a(40.0f, f6, f4, f3));
        } else {
            path.cubicTo(e.a.a.a.a.a(h(z, 0.0f), f5, f4, f2), e.a.a.a.a.a(41.0f, f6, f4, f3), e.a.a.a.a.a(h(z, 0.499f), f5, f4, f2), e.a.a.a.a.a(44.85f, f6, f4, f3), e.a.a.a.a.a(h(z, 4.99f), f5, f4, f2), e.a.a.a.a.a(48.0f, f6, f4, f3));
            path.cubicTo(e.a.a.a.a.a(h(z, 9.447f), f5, f4, f2), e.a.a.a.a.a(51.125f, f6, f4, f3), e.a.a.a.a.a(h(z, 11.502f), f5, f4, f2), e.a.a.a.a.a(53.463f, f6, f4, f3), e.a.a.a.a.a(h(z, 11.534f), f5, f4, f2), e.a.a.a.a.a(61.801f, f6, f4, f3));
            path.cubicTo(e.a.a.a.a.a(h(z, 11.521f), f5, f4, f2), e.a.a.a.a.a(62.491f, f6, f4, f3), e.a.a.a.a.a(h(z, 11.521f), f5, f4, f2), e.a.a.a.a.a(63.279f, f6, f4, f3), e.a.a.a.a.a(h2, f5, f4, f2), e.a.a.a.a.a(64.19f, f6, f4, f3));
        }
    }

    private static float c(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f2 / 8.0f;
    }

    private static float d(float f2, float f3, float f4) {
        float max = Math.max(0.0f, Math.min(f3, f4) / 2.0f);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return Math.min(f2, max);
    }

    private static float e(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f2 + f6;
        float min = Math.min(f3 - f6, (f4 - f5) - (f7 * 21.0f));
        return min < f8 ? f8 : min;
    }

    private static b f(ConnectorStyle connectorStyle, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f5 - f3;
        float abs = Math.abs(f8 - f9);
        c cVar = connectorStyle == ConnectorStyle.ARC ? new c(Math.abs(35.537f), Math.abs(21.0f), 0.53333336f, null) : new c(Math.abs(11.521f), Math.abs(24.190002f), 0.49477738f, null);
        float f11 = cVar.a;
        float f12 = f11 == 0.0f ? 0.0f : abs / f11;
        float f13 = cVar.b * f12;
        float f14 = f3 - (f2 + f4);
        float f15 = (f6 - f7) - f5;
        if (f10 <= 0.0f || f13 <= f10 || f13 > f10 + f14 + f15) {
            return new b(false, f3, f5, f12, null);
        }
        float f16 = f13 - f10;
        float f17 = cVar.f2804c * f16;
        float f18 = f16 - f17;
        if (f17 > f14) {
            f18 = f16 - f14;
            f17 = f14;
        }
        if (f18 > f15) {
            f17 = f16 - f15;
            f18 = f15;
        }
        return (f17 < 0.0f || f17 > f14 || f18 < 0.0f || f18 > f15) ? new b(false, f3, f5, f12, null) : new b(true, f3 - f17, f5 + f18, f12, null);
    }

    public static Path g(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        ConnectorStyle connectorStyle;
        float f12;
        float f13;
        ConnectorStyle connectorStyle2;
        Path path;
        float f14;
        Path path2;
        float f15;
        float f16;
        ConnectorStyle connectorStyle3;
        float f17;
        float f18;
        Path path3 = new Path();
        float f19 = f10 - f8;
        float d2 = d(f2, f6 - f4, f7 - f5);
        float d3 = d(f3, f19, f11 - f9);
        float min = Math.min(f19 * 0.7f, Resources.getSystem().getDisplayMetrics().density * 20.0f);
        float f20 = Resources.getSystem().getDisplayMetrics().density * 5.0f;
        ConnectorStyle i = i(f6 - f10, min, f20);
        ConnectorStyle i2 = i(f8 - f4, min, f20);
        float f21 = f9 - f7;
        float f22 = f4 + d2;
        path3.moveTo(f22, f5);
        path3.lineTo(f6 - d2, f5);
        float f23 = f5 + d2;
        path3.quadTo(f6, f5, f6, f23);
        ConnectorStyle connectorStyle4 = ConnectorStyle.LINE;
        float f24 = 1.0f;
        if (i == connectorStyle4 || f21 <= 0.0f) {
            connectorStyle = connectorStyle4;
            f12 = f23;
            f13 = f22;
            connectorStyle2 = i2;
            path = path3;
            f14 = f11;
            path.lineTo(f6, f7);
            path.lineTo(f10, f9);
        } else if (i == ConnectorStyle.ARC) {
            float c2 = c(d2);
            f12 = f23;
            f13 = f22;
            float e2 = e(f5, f7, f11, d3, d2, c2);
            float f25 = (c2 * 21.0f) + e2;
            if (c2 > 0.0f) {
                float abs = Math.abs(f10 - f6);
                float f26 = c2 * 24.536999f;
                float f27 = abs - f26;
                if (f26 <= 0.0f || f27 >= 0.0f) {
                    f17 = f27;
                    f18 = 1.0f;
                } else {
                    f18 = abs / f26;
                    f17 = 0.0f;
                }
                float f28 = f18 < 0.0f ? 0.0f : f18;
                path3.lineTo(f6, e2);
                path = path3;
                a(path3, false, f6, e2, f10, d2, f17, f28);
                if (f25 < f9) {
                    path.lineTo(f10, f9);
                }
                connectorStyle3 = i2;
            } else {
                path = path3;
                connectorStyle3 = i2;
                path.lineTo(f6, f7);
                path.lineTo(f10, f9);
            }
            connectorStyle2 = connectorStyle3;
            connectorStyle = connectorStyle4;
            f14 = f11;
        } else {
            f12 = f23;
            f13 = f22;
            path = path3;
            connectorStyle = connectorStyle4;
            connectorStyle2 = i2;
            f14 = f11;
            b f29 = f(i, f5, f7, d2, f9, f11, d3, f6, f10);
            path.lineTo(f6, f29.b);
            if (f29.a) {
                b(path, true, false, f6, f29.b, f29.f2803d);
            } else {
                path.lineTo(f6, f7);
                path.lineTo(f10, f9);
            }
        }
        float f30 = f14 - d3;
        path.lineTo(f10, f30);
        path.quadTo(f10, f14, f10 - d3, f14);
        path.lineTo(f8 + d3, f14);
        path.quadTo(f8, f14, f8, f30);
        ConnectorStyle connectorStyle5 = connectorStyle2;
        if (connectorStyle5 == connectorStyle || f21 <= 0.0f) {
            path2 = path;
            f15 = f4;
            path2.lineTo(f8, f9);
            path2.lineTo(f15, f7);
        } else if (connectorStyle5 == ConnectorStyle.ARC) {
            float c3 = c(d2);
            float e3 = e(f5, f7, f11, d3, d2, c3);
            float f31 = (21.0f * c3) + e3;
            if (c3 > 0.0f) {
                path2 = path;
                f15 = f4;
                float abs2 = Math.abs(f15 - f8);
                float f32 = c3 * 24.536999f;
                float f33 = abs2 - f32;
                if (f32 <= 0.0f || f33 >= 0.0f) {
                    f16 = f33;
                } else {
                    f24 = abs2 / f32;
                    f16 = 0.0f;
                }
                float f34 = f24 < 0.0f ? 0.0f : f24;
                path2.lineTo(f8, f31);
                a(path2, true, f4, e3, f8, d2, f16, f34);
            } else {
                path2 = path;
                f15 = f4;
                path2.lineTo(f8, f9);
                path2.lineTo(f15, f7);
            }
        } else {
            path2 = path;
            f15 = f4;
            b f35 = f(connectorStyle5, f5, f7, d2, f9, f11, d3, f8, f4);
            path2.lineTo(f8, f35.f2802c);
            if (f35.a) {
                b(path2, false, true, f8, f35.f2802c, f35.f2803d);
            } else {
                path2.lineTo(f8, f9);
                path2.lineTo(f15, f7);
            }
        }
        path2.lineTo(f15, f12);
        path2.quadTo(f15, f5, f13, f5);
        path2.close();
        return path2;
    }

    private static float h(boolean z, float f2) {
        return z ? 78.0f - f2 : f2;
    }

    private static ConnectorStyle i(float f2, float f3, float f4) {
        float max = Math.max(0.0f, f2);
        return max > f3 ? ConnectorStyle.ARC : max > f4 ? ConnectorStyle.BEND : ConnectorStyle.LINE;
    }
}
