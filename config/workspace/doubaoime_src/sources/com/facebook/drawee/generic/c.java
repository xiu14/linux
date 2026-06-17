package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.q;
import com.facebook.infer.annotation.ReturnsOwnership;

/* loaded from: classes2.dex */
public class c {
    private static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    @ReturnsOwnership
    private static RoundingParams b(b bVar) {
        if (bVar.r() == null) {
            bVar.J(new RoundingParams());
        }
        return bVar.r();
    }

    private static q c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return q.a;
            case 1:
                return q.b;
            case 2:
                return q.f6388c;
            case 3:
                return q.f6389d;
            case 4:
                return q.f6390e;
            case 5:
                return q.f6391f;
            case 6:
                return q.f6392g;
            case 7:
                return q.h;
            case 8:
                return q.i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d0, code lost:
    
        if (r13 != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ec, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01ea, code lost:
    
        if (r14 != false) goto L134;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.drawee.generic.b d(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.c.d(android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.b");
    }
}
