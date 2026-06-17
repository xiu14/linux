package ms.bd.c;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class z1 extends View {
    public final /* synthetic */ a2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, Context context) {
        super(context);
        this.a = a2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        long eventTime = motionEvent.getEventTime();
        d2 d2Var = this.a.f10350g;
        long j = d2Var.f10363d;
        d2Var.f10362c = j != 0 ? eventTime - j : 0L;
        d2Var.f10363d = eventTime;
        d2Var.f10364e.a = motionEvent.getX();
        this.a.f10350g.f10364e.b = motionEvent.getY();
        this.a.f10350g.b++;
        return true;
    }
}
