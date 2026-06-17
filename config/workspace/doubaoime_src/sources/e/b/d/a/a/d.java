package e.b.d.a.a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class d extends TouchDelegate {
    private static final Rect b = new Rect();
    private final kotlin.e a;

    static final class a extends m implements kotlin.s.b.a<HashMap<Object, TouchDelegate>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public HashMap<Object, TouchDelegate> invoke() {
            return new HashMap<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(b, view);
        l.f(view, "view");
        this.a = kotlin.a.c(a.a);
    }

    public final void a(Object obj, TouchDelegate touchDelegate) {
        l.f(obj, "targetView");
        ((HashMap) this.a.getValue()).put(obj, touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            boolean z = false;
            for (Map.Entry entry : ((HashMap) this.a.getValue()).entrySet()) {
                Object key = entry.getKey();
                l.d(key, "null cannot be cast to non-null type android.view.View");
                if (((View) key).getVisibility() == 0) {
                    Object value = entry.getValue();
                    l.e(value, "entry.value");
                    motionEvent.setLocation(x, y);
                    if (((TouchDelegate) value).onTouchEvent(motionEvent) || z) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }
}
