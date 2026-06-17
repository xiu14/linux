package com.bytedance.lighten.core;

/* loaded from: classes.dex */
public class CircleOptions {
    private float a;
    private RoundingMethod b;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static class b {
        private float a = 0.0f;
        private RoundingMethod b = RoundingMethod.BITMAP_ONLY;

        public CircleOptions c() {
            return new CircleOptions(this, null);
        }

        public b d(float f2) {
            this.a = f2;
            return this;
        }
    }

    CircleOptions(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public float a() {
        return this.a;
    }

    public RoundingMethod b() {
        return this.b;
    }
}
