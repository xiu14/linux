package com.bytedance.android.input.speech.wave;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.doubaoime.t;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.e;
import kotlin.o;
import kotlin.r.f;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.w.h;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.g;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import kotlinx.coroutines.r0;

/* loaded from: classes.dex */
public class AudioVisualizerOpt extends View {
    public static final /* synthetic */ int t = 0;
    private final int a;
    private final float b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3186c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3187d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3188e;

    /* renamed from: f, reason: collision with root package name */
    private final float f3189f;

    /* renamed from: g, reason: collision with root package name */
    private int f3190g;
    private float h;
    private LinkedList<Float> i;
    private long j;
    private final Map<Integer, a> k;
    private int l;
    private int m;
    private int n;
    private b o;
    private boolean p;
    private boolean q;
    private Paint r;
    private final e s;

    public static final class a {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private float f3191c;

        /* renamed from: d, reason: collision with root package name */
        private float f3192d;

        /* renamed from: e, reason: collision with root package name */
        private float f3193e;

        public a() {
            this(0, 0, 0.0f, 0.0f, 0.0f, 31);
        }

        public a(int i, int i2, float f2, float f3, float f4, int i3) {
            i = (i3 & 1) != 0 ? 2 : i;
            i2 = (i3 & 2) != 0 ? 2 : i2;
            f2 = (i3 & 4) != 0 ? 0.0f : f2;
            f3 = (i3 & 8) != 0 ? 0.0f : f3;
            f4 = (i3 & 16) != 0 ? 0.0f : f4;
            this.a = i;
            this.b = i2;
            this.f3191c = f2;
            this.f3192d = f3;
            this.f3193e = f4;
        }

        public final float a() {
            return this.f3191c;
        }

        public final int b() {
            return this.a;
        }

        public final float c() {
            return this.f3193e;
        }

        public final float d() {
            return this.f3192d;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Float.compare(this.f3191c, aVar.f3191c) == 0 && Float.compare(this.f3192d, aVar.f3192d) == 0 && Float.compare(this.f3193e, aVar.f3193e) == 0;
        }

        public final void f(float f2) {
            this.f3191c = f2;
        }

        public final void g(int i) {
            this.a = i;
        }

        public final void h(float f2) {
            this.f3193e = f2;
        }

        public int hashCode() {
            return Float.hashCode(this.f3193e) + e.a.a.a.a.x(this.f3192d, e.a.a.a.a.x(this.f3191c, e.a.a.a.a.I(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final void i(float f2) {
            this.f3192d = f2;
        }

        public final void j(int i) {
            this.b = i;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("BarParam(barType=");
            M.append(this.a);
            M.append(", groupType=");
            M.append(this.b);
            M.append(", barHeight=");
            M.append(this.f3191c);
            M.append(", curBarHeight=");
            M.append(this.f3192d);
            M.append(", change=");
            M.append(this.f3193e);
            M.append(')');
            return M.toString();
        }
    }

    static final class c extends m implements kotlin.s.b.a<G> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            f a2 = C0795d.a(null, 1);
            int i = S.f10199c;
            return new g(r.d0((r0) a2, q.f10173c));
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.wave.AudioVisualizerOpt$setAudioData$1", f = "AudioVisualizerOpt.kt", l = {366}, m = "invokeSuspend")
    static final class d extends i implements p<G, kotlin.r.d<? super o>, Object> {
        int a;
        final /* synthetic */ byte[] b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AudioVisualizerOpt f3194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(byte[] bArr, AudioVisualizerOpt audioVisualizerOpt, kotlin.r.d<? super d> dVar) {
            super(2, dVar);
            this.b = bArr;
            this.f3194c = audioVisualizerOpt;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new d(this.b, this.f3194c, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return new d(this.b, this.f3194c, dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            Double d2 = null;
            if (i == 0) {
                r.k0(obj);
                byte[] bArr = this.b;
                int i2 = this.f3194c.a;
                this.a = 1;
                obj = C0795d.s(S.b(), new com.bytedance.android.input.speech.wave.a(bArr, 16, i2, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
            }
            Iterator it2 = ((ArrayList) obj).iterator();
            if (it2.hasNext()) {
                double abs = Math.abs(((Number) it2.next()).doubleValue());
                while (it2.hasNext()) {
                    abs = Math.max(abs, Math.abs(((Number) it2.next()).doubleValue()));
                }
                d2 = new Double(abs);
            }
            double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            AudioVisualizerOpt audioVisualizerOpt = this.f3194c;
            int i3 = AudioVisualizerOpt.t;
            Objects.requireNonNull(audioVisualizerOpt);
            AudioVisualizerOpt.b(audioVisualizerOpt, h.c(((float) (doubleValue > 0.5d ? 1.0d : Math.sin(doubleValue * 3.141592653589793d))) * 2.5f, 1.0f));
            return o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioVisualizerOpt(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public static final void b(AudioVisualizerOpt audioVisualizerOpt, float f2) {
        audioVisualizerOpt.i.offer(Float.valueOf(f2));
        if (audioVisualizerOpt.i.size() > 10) {
            audioVisualizerOpt.i.poll();
        }
    }

    private final void c(int i) {
        float f2;
        if (this.p) {
            this.r.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, new int[]{-7829368, -7829368}, (float[]) null, Shader.TileMode.CLAMP));
            return;
        }
        float f3 = i;
        float f4 = this.h;
        float f5 = (f3 - f4) / 2;
        float f6 = f4 + f5;
        if (this.o.a() == 1) {
            f5 = 0.0f;
            f3 = this.h + 0.0f;
        } else {
            if (this.o.a() != 2) {
                f2 = f6;
                this.r.setShader(new LinearGradient(f5, 0.0f, f2, 0.0f, new int[]{Color.argb(255, 19, 191, 204), Color.argb(255, 70, 126, 255)}, (float[]) null, Shader.TileMode.CLAMP));
            }
            f5 = (f3 - this.h) - this.b;
        }
        f2 = f3;
        this.r.setShader(new LinearGradient(f5, 0.0f, f2, 0.0f, new int[]{Color.argb(255, 19, 191, 204), Color.argb(255, 70, 126, 255)}, (float[]) null, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0271, code lost:
    
        if (r2.b() != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0233, code lost:
    
        if (r2.b() != 1) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0274  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.wave.AudioVisualizerOpt.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c(i);
    }

    public final void setAudioData(byte[] bArr) {
        l.f(bArr, RemoteMessageConst.DATA);
        G g2 = (G) this.s.getValue();
        int i = S.f10199c;
        C0795d.l(g2, q.f10173c, null, new d(bArr, this, null), 2, null);
    }

    public final void setGradient(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        this.m = i;
        if (i2 < 0) {
            i2 = 0;
        }
        this.n = i2;
    }

    public final void setNotDraw(boolean z) {
        this.q = z;
    }

    public final void setUseGray(boolean z) {
        this.p = z;
        c(getWidth());
    }

    public final void setWaveGroupNumber(int i) {
        this.f3190g = i;
        float f2 = this.b;
        float f3 = this.f3186c;
        this.h = (((f2 + f3) * 5) * i) - f3;
        int i2 = i * 5;
        this.l = i2;
        if (this.k.get(Integer.valueOf(i2)) != null) {
            return;
        }
        this.k.clear();
        int i3 = 1;
        if (1 > i2) {
            return;
        }
        while (true) {
            this.k.put(Integer.valueOf(i3), new a(0, 0, 0.0f, 0.0f, 0.0f, 31));
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void setWaveTintList(ColorStateList colorStateList) {
        l.f(colorStateList, "tint");
        this.r.setColor(colorStateList.getDefaultColor());
    }

    public void setWaveTintMode(PorterDuff.Mode mode) {
    }

    public static final class b {
        private final int a;

        public b() {
            this.a = 0;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return e.a.a.a.a.C(e.a.a.a.a.M("WaveOrientation(value="), this.a, ')');
        }

        public b(int i) {
            this.a = i;
        }

        public b(int i, int i2) {
            this.a = (i2 & 1) != 0 ? 0 : i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioVisualizerOpt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioVisualizerOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = 45;
        k kVar = k.a;
        float L = k.L(3);
        this.b = L;
        float L2 = k.L(3);
        this.f3186c = L2;
        k.L(64);
        this.f3187d = k.L(3);
        this.f3188e = k.L(48);
        this.f3189f = k.L(4);
        this.f3190g = 4;
        this.h = (((L + L2) * 5) * 4) - L2;
        this.i = new LinkedList<>();
        this.k = new LinkedHashMap();
        this.l = this.f3190g * 5;
        this.o = new b(0, 1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(L);
        paint.setColor(-1);
        this.r = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.a);
        this.f3190g = obtainStyledAttributes.getInteger(0, 4);
        this.o = new b(obtainStyledAttributes.getInteger(1, 0));
        setWaveGroupNumber(this.f3190g);
        setClickable(false);
        this.s = kotlin.a.c(c.a);
    }
}
