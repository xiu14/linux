package com.bytedance.android.input.speech.wave;

import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.e;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlinx.coroutines.G;

@e(c = "com.bytedance.android.input.speech.wave.AudioUtils$getAudioWave$2", f = "AudioUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class a extends i implements p<G, d<? super ArrayList<Double>>, Object> {
    final /* synthetic */ byte[] a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f3195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(byte[] bArr, int i, int i2, d<? super a> dVar) {
        super(2, dVar);
        this.a = bArr;
        this.b = i;
        this.f3195c = i2;
    }

    @Override // kotlin.r.h.a.a
    public final d<o> create(Object obj, d<?> dVar) {
        return new a(this.a, this.b, this.f3195c, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, d<? super ArrayList<Double>> dVar) {
        return new a(this.a, this.b, this.f3195c, dVar).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = this.f3195c;
        ArrayList arrayList = new ArrayList();
        int length = bArr.length / (i == 12 ? 4 : 2);
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 % 2 == 0) {
                arrayList.add(new BigDecimal(bArr[i3] | (bArr[i3 + 1] << 8)).divide(new BigDecimal(32768), 3, RoundingMode.HALF_UP));
                if (i == 12) {
                    arrayList.add(new BigDecimal((bArr[i3 + 2] << 16) | (bArr[i3 + 3] << 24)).divide(new BigDecimal(32768), 6, RoundingMode.HALF_UP));
                }
            }
        }
        BigDecimal bigDecimal = new BigDecimal(0.0d);
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(arrayList.size() / i2, 2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i4 = 0;
            while (it2.hasNext()) {
                BigDecimal bigDecimal2 = (BigDecimal) it2.next();
                if (i4 < max - 1) {
                    bigDecimal = bigDecimal.add(bigDecimal2.abs());
                    l.e(bigDecimal, "sum.add(sample.abs())");
                    i4++;
                } else {
                    double doubleValue = bigDecimal.doubleValue();
                    try {
                        BigDecimal bigDecimal3 = new BigDecimal(i4);
                        if (bigDecimal3.compareTo(BigDecimal.ZERO) != 0) {
                            doubleValue = bigDecimal.divide(bigDecimal3, 6, RoundingMode.HALF_UP).doubleValue();
                        }
                    } catch (ArithmeticException e2) {
                        j.j("WAVE-AudioUtils", e2.toString());
                    }
                    arrayList2.add(Double.valueOf(doubleValue));
                    bigDecimal = new BigDecimal(0.0d);
                    arrayList2.size();
                }
            }
            break;
        }
        while (arrayList2.size() < i2) {
            arrayList2.add(Double.valueOf(0.0d));
        }
        return arrayList2;
    }
}
