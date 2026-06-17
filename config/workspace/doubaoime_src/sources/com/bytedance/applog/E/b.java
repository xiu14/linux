package com.bytedance.applog.E;

import androidx.annotation.NonNull;
import com.bytedance.applog.w.k;
import java.lang.reflect.Array;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {
    protected static final long[][] j = {new long[]{com.heytap.mcssdk.constant.a.f6886d, 0, 12}, new long[]{120000, 5, 1}, new long[]{com.heytap.mcssdk.constant.a.j, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};
    private String a;
    private com.bytedance.applog.x.b b;

    /* renamed from: c, reason: collision with root package name */
    private int f3765c;

    /* renamed from: d, reason: collision with root package name */
    private int f3766d;

    /* renamed from: e, reason: collision with root package name */
    private int f3767e;

    /* renamed from: f, reason: collision with root package name */
    private long f3768f;

    /* renamed from: g, reason: collision with root package name */
    private long f3769g;
    private long[][] h;
    private com.bytedance.applog.y.b i;

    public b(String str, com.bytedance.applog.x.b bVar, com.bytedance.applog.y.b bVar2) {
        this.b = bVar;
        this.a = str;
        this.i = bVar2;
        this.f3765c = 0;
        if (System.currentTimeMillis() - bVar.z().getLong(e.a.a.a.a.J(new StringBuilder(), this.a, "downgrade_time"), 0L) < 10800000) {
            this.f3765c = this.b.z().getInt(this.a + "downgrade_index", 0);
        } else {
            this.b.z().edit().remove(this.a + "downgrade_time").remove(this.a + "downgrade_index").apply();
        }
        long[][] jArr = j;
        this.h = (long[][]) Array.newInstance((Class<?>) long.class, jArr.length, jArr[0].length);
        int i = 0;
        while (true) {
            long[][] jArr2 = j;
            if (i >= jArr2.length) {
                break;
            }
            System.arraycopy(jArr2[i], 0, this.h[i], 0, jArr2[i].length);
            i++;
        }
        com.bytedance.applog.y.b bVar3 = this.i;
        if (bVar3 == null) {
            return;
        }
        int e2 = bVar3.e();
        if (e2 == 0) {
            this.h[0][2] = 2147483647L;
        } else if (-1 != e2) {
            this.h[0][2] = 60;
        }
        long c2 = this.i.c();
        if (c2 <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            long[][] jArr3 = this.h;
            if (i2 >= jArr3.length) {
                return;
            }
            if (i2 == 1) {
                jArr3[i2][0] = 2 * c2;
            } else {
                jArr3[i2][0] = jArr3[i2 - 1][0] * 2;
            }
            i2++;
        }
    }

    private boolean a() {
        Objects.requireNonNull(this.b.r());
        return true;
    }

    public void b() {
        a();
        if (this.f3765c >= this.h.length - 1) {
            this.f3767e = 0;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f3765c++;
        this.f3766d = 1;
        this.f3767e = 0;
        this.f3768f = currentTimeMillis;
        this.f3769g = currentTimeMillis;
        this.b.z().edit().putLong(e.a.a.a.a.J(new StringBuilder(), this.a, "downgrade_time"), currentTimeMillis).putInt(e.a.a.a.a.J(new StringBuilder(), this.a, "downgrade_index"), this.f3765c).apply();
    }

    public void c() {
        a();
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f3767e;
        long j2 = i;
        long[][] jArr = this.h;
        int i2 = this.f3765c;
        if (j2 < jArr[i2][1] && currentTimeMillis - this.f3769g <= 1800000) {
            this.f3767e = i + 1;
            return;
        }
        if (i2 > 0) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.f3765c--;
            this.f3766d = 1;
            this.f3767e = 1;
            this.f3768f = currentTimeMillis2;
            this.f3769g = currentTimeMillis2;
            this.b.z().edit().putLong(e.a.a.a.a.J(new StringBuilder(), this.a, "downgrade_time"), currentTimeMillis2).putInt(e.a.a.a.a.J(new StringBuilder(), this.a, "downgrade_index"), this.f3765c).apply();
        }
    }

    public boolean d() {
        a();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f3768f;
        long[][] jArr = this.h;
        int i = this.f3765c;
        if (j2 >= jArr[i][0]) {
            this.f3766d = 1;
            this.f3768f = currentTimeMillis;
        } else {
            int i2 = this.f3766d;
            if (i2 >= jArr[i][2]) {
                k.z().b("Congestion forbidden send by mTableIndex={}, mLastSendTime={}, mHasSendCount={}", Integer.valueOf(this.f3765c), Long.valueOf(this.f3768f), Integer.valueOf(this.f3766d));
                return false;
            }
            this.f3766d = i2 + 1;
        }
        return true;
    }

    public void e(int i) {
        this.h[0][2] = i;
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("mPrefix=");
        M.append(this.a);
        M.append(", mTableIndex=");
        M.append(this.f3765c);
        M.append(", mHasSendCount=");
        M.append(this.f3766d);
        M.append(", mContinueSuccSendCount=");
        M.append(this.f3767e);
        M.append(", mLastSendTime=");
        M.append(this.f3768f);
        return M.toString();
    }
}
