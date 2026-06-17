package ms.bd.c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class b2 {
    public static volatile y1 a = null;
    public static boolean b = false;

    public static void a(Context context, Intent intent) {
        String charSequence;
        if (a == null) {
            synchronized (y1.class) {
                if (a == null) {
                    Bundle bundleExtra = intent.getBundleExtra((String) y2.a(16777217, 0, 0L, "6409ae", new byte[]{43, 63, 85, 72, 97, 102, 48, 6}));
                    if (bundleExtra != null) {
                        CharSequence charSequence2 = bundleExtra.getCharSequence((String) y2.a(16777217, 0, 0L, "8d3f41", new byte[]{40, 118, 80, 59, 47}));
                        if (!TextUtils.isEmpty(charSequence2)) {
                            charSequence = charSequence2.toString();
                            a = new y1(context, charSequence);
                        }
                    }
                    charSequence = null;
                    a = new y1(context, charSequence);
                }
            }
        }
    }
}
