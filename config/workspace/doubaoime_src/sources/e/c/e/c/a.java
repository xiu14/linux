package e.c.e.c;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.q;
import e.c.e.c.b.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class a extends Drawable implements b {
    private static boolean A;
    private static boolean B;
    private static boolean C;
    private static boolean D;
    private static boolean E;

    /* renamed from: J, reason: collision with root package name */
    private static boolean f9790J;
    private static boolean K;
    private static boolean L;
    private static boolean M;
    private static boolean N;
    private static float O;
    private static final long w;
    private static int x;
    private static long y;
    private static long z;
    private String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9791c;

    /* renamed from: d, reason: collision with root package name */
    private int f9792d;

    /* renamed from: e, reason: collision with root package name */
    private q f9793e;

    /* renamed from: f, reason: collision with root package name */
    private long f9794f;
    private int h;
    private int i;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private String u;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, String> f9795g = new HashMap<>();
    private int j = 80;
    private final Paint k = new Paint(1);
    private final Matrix l = new Matrix();
    private final Rect m = new Rect();
    private final RectF n = new RectF();
    private int v = -1;

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        long j = displayMetrics.heightPixels * displayMetrics.widthPixels * 4;
        w = j;
        x = 2;
        y = 20971520L;
        z = j;
        A = true;
        B = true;
        C = true;
        D = true;
        E = true;
        f9790J = true;
        K = true;
        L = true;
        M = true;
        N = true;
        O = 1.0f;
    }

    public a() {
        d();
    }

    private void a(Canvas canvas, String str, String str2, int i) {
        String s = e.a.a.a.a.s(str, ": ");
        float measureText = this.k.measureText(s);
        float measureText2 = this.k.measureText(str2);
        this.k.setColor(1711276032);
        int i2 = this.r;
        int i3 = this.s;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, i3 + this.q + 8, this.k);
        this.k.setColor(-1);
        canvas.drawText(s, this.r, this.s, this.k);
        this.k.setColor(i);
        canvas.drawText(str2, this.r + measureText, this.s, this.k);
        this.s += this.q;
    }

    private static String b(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public void c(long j) {
        this.t = j;
        invalidateSelf();
    }

    public void d() {
        this.b = -1;
        this.f9791c = -1;
        this.f9792d = -1;
        this.f9794f = -1L;
        this.f9795g = new HashMap<>();
        this.h = -1;
        this.i = -1;
        this.a = "none";
        invalidateSelf();
        this.t = -1L;
        this.u = null;
        this.v = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(2.0f);
        this.k.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.k);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.k);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setStrokeWidth(0.0f);
        this.k.setColor(-1);
        this.r = this.o;
        this.s = this.p;
        if (L) {
            a(canvas, "ID", this.a, -1);
        }
        if (K) {
            a(canvas, "D", b("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())), -1);
        }
        int i2 = this.b;
        int i3 = this.f9791c;
        q qVar = this.f9793e;
        int width = getBounds().width();
        int height = getBounds().height();
        int i4 = SupportMenu.CATEGORY_MASK;
        if (width > 0 && height > 0 && i2 > 0 && i3 > 0) {
            if (qVar != null) {
                Rect rect = this.m;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.l.reset();
                ((p) qVar).a(this.l, this.m, i2, i3, 0.0f, 0.0f);
                RectF rectF = this.n;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i2;
                rectF.bottom = i3;
                this.l.mapRect(rectF);
                int width2 = (int) this.n.width();
                int height2 = (int) this.n.height();
                width = Math.min(width, width2);
                height = Math.min(height, height2);
            }
            float f2 = width;
            float f3 = f2 * 0.1f;
            float f4 = f2 * 0.5f;
            float f5 = height;
            float f6 = 0.1f * f5;
            float f7 = f5 * 0.5f;
            int abs = Math.abs(i2 - width);
            int abs2 = Math.abs(i3 - height);
            float f8 = abs;
            if (f8 < f3 && abs2 < f6) {
                i4 = -16711936;
            } else if (f8 < f4 && abs2 < f7) {
                i4 = InputDeviceCompat.SOURCE_ANY;
            }
        }
        int i5 = i4;
        if (f9790J) {
            i = 1;
            a(canvas, "I", b("%dx%d", Integer.valueOf(this.b), Integer.valueOf(this.f9791c)), i5);
        } else {
            i = 1;
        }
        if (D) {
            Object[] objArr = new Object[i];
            objArr[0] = Integer.valueOf(this.f9792d / 1024);
            a(canvas, "I", b("%d KiB", objArr), -1);
        }
        int i6 = this.h;
        if (i6 > 0 && N) {
            a(canvas, "anim", b("f %d, l %d", Integer.valueOf(i6), Integer.valueOf(this.i)), -1);
        }
        q qVar2 = this.f9793e;
        if (qVar2 != null && C) {
            a(canvas, "scale", String.valueOf(qVar2), -1);
        }
        long j = this.t;
        if (j >= 0 && B) {
            a(canvas, "t", b("%d ms", Long.valueOf(j)), -1);
        }
        String str = this.u;
        if (str != null && A) {
            a(canvas, "origin", str, this.v);
        }
        for (Map.Entry<String, String> entry : this.f9795g.entrySet()) {
            a(canvas, entry.getKey(), entry.getValue(), -1);
        }
    }

    public void e(String str) {
        if (str == null) {
            str = "none";
        }
        this.a = str;
        invalidateSelf();
    }

    public void f(int i, int i2) {
        this.b = i;
        this.f9791c = i2;
        invalidateSelf();
    }

    public void g(long j) {
        this.f9794f = j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i) {
        this.f9792d = i;
    }

    public void i(String str, int i) {
        this.u = str;
        this.v = i;
        invalidateSelf();
    }

    public void j(q qVar) {
        this.f9793e = qVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.k.setTextSize(Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9))) * O);
        int i = (int) ((r0 + 8) * O);
        this.q = i;
        int i2 = this.j;
        if (i2 == 80) {
            this.q = i * (-1);
        }
        this.o = rect.left + 10;
        this.p = i2 == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
