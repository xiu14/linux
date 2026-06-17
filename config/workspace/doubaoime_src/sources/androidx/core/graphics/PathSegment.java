package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import e.a.a.a.a;

/* loaded from: classes.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF pointF, float f2, @NonNull PointF pointF2, float f3) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f2;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int hashCode = this.mStart.hashCode() * 31;
        float f2 = this.mStartFraction;
        int hashCode2 = (this.mEnd.hashCode() + ((hashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31)) * 31;
        float f3 = this.mEndFraction;
        return hashCode2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public String toString() {
        StringBuilder M = a.M("PathSegment{start=");
        M.append(this.mStart);
        M.append(", startFraction=");
        M.append(this.mStartFraction);
        M.append(", end=");
        M.append(this.mEnd);
        M.append(", endFraction=");
        M.append(this.mEndFraction);
        M.append('}');
        return M.toString();
    }
}
