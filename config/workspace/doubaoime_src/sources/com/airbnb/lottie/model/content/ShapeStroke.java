package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.v.b.r;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements b {
    private final String a;

    @Nullable
    private final com.airbnb.lottie.model.i.b b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.i.b> f1302c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.a f1303d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.d f1304e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1305f;

    /* renamed from: g, reason: collision with root package name */
    private final LineCapType f1306g;
    private final LineJoinType h;
    private final float i;
    private final boolean j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, @Nullable com.airbnb.lottie.model.i.b bVar, List<com.airbnb.lottie.model.i.b> list, com.airbnb.lottie.model.i.a aVar, com.airbnb.lottie.model.i.d dVar, com.airbnb.lottie.model.i.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f2, boolean z) {
        this.a = str;
        this.b = bVar;
        this.f1302c = list;
        this.f1303d = aVar;
        this.f1304e = dVar;
        this.f1305f = bVar2;
        this.f1306g = lineCapType;
        this.h = lineJoinType;
        this.i = f2;
        this.j = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new r(iVar, bVar, this);
    }

    public LineCapType b() {
        return this.f1306g;
    }

    public com.airbnb.lottie.model.i.a c() {
        return this.f1303d;
    }

    public com.airbnb.lottie.model.i.b d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<com.airbnb.lottie.model.i.b> f() {
        return this.f1302c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public com.airbnb.lottie.model.i.d i() {
        return this.f1304e;
    }

    public com.airbnb.lottie.model.i.b j() {
        return this.f1305f;
    }

    public boolean k() {
        return this.j;
    }
}
