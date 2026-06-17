package androidx.core.content;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(kotlin.g<String, ? extends Object>... gVarArr) {
        kotlin.s.c.l.f(gVarArr, "pairs");
        ContentValues contentValues = new ContentValues(gVarArr.length);
        for (kotlin.g<String, ? extends Object> gVar : gVarArr) {
            String a = gVar.a();
            Object b = gVar.b();
            if (b == null) {
                contentValues.putNull(a);
            } else if (b instanceof String) {
                contentValues.put(a, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(a, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(a, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(a, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(a, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(a, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(a, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(a, (Byte) b);
            } else {
                if (!(b instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
                }
                contentValues.put(a, (Short) b);
            }
        }
        return contentValues;
    }
}
