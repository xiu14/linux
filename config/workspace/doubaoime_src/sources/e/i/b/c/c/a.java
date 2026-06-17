package e.i.b.c.c;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {
    public a(float f2, float f3) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setAlpha(0.5f);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        view.setAlpha(1.0f);
        return false;
    }
}
