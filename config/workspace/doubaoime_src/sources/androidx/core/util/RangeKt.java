package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        l.f(range, "<this>");
        l.f(range2, "other");
        Range<T> intersect = range.intersect(range2);
        l.e(intersect, "intersect(other)");
        return intersect;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        l.f(range, "<this>");
        l.f(t, PushLog.KEY_VALUE);
        Range<T> extend = range.extend((Range<T>) t);
        l.e(extend, "extend(value)");
        return extend;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        l.f(t, "<this>");
        l.f(t2, "that");
        return new Range<>(t, t2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> kotlin.w.a<T> toClosedRange(final Range<T> range) {
        l.f(range, "<this>");
        return (kotlin.w.a<T>) new kotlin.w.a<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                l.f(comparable, PushLog.KEY_VALUE);
                return comparable.compareTo(getStart()) >= 0 && comparable.compareTo(getEndInclusive()) <= 0;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.w.a
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.w.a
            public Comparable getStart() {
                return range.getLower();
            }

            public boolean isEmpty() {
                return getStart().compareTo(getEndInclusive()) > 0;
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(kotlin.w.a<T> aVar) {
        l.f(aVar, "<this>");
        return new Range<>(aVar.getStart(), aVar.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        l.f(range, "<this>");
        l.f(range2, "other");
        Range<T> extend = range.extend(range2);
        l.e(extend, "extend(other)");
        return extend;
    }
}
