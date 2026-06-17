package ms.bd.c;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.Window;
import androidx.appcompat.view.WindowCallbackWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x extends WindowCallbackWrapper {
    public x(Window.Callback callback) {
        super(callback);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final int deviceId = motionEvent.getDeviceId();
        final int x = (int) motionEvent.getX();
        final int y = (int) motionEvent.getY();
        final int pressure = (int) (motionEvent.getPressure() * 100.0f);
        final int touchMajor = (int) motionEvent.getTouchMajor();
        Handler handler = n.h;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ms.bd.c.C
                @Override // java.lang.Runnable
                public final void run() {
                    int i = action;
                    int i2 = deviceId;
                    int i3 = x;
                    int i4 = y;
                    int i5 = pressure;
                    int i6 = touchMajor;
                    int i7 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 3 : 1;
                    synchronized (b3.class) {
                        String[] strArr = b3.a;
                        u0 u0Var = new u0(i2, i3, i4, i7, i5, i6);
                        u0Var.h = b3.f10353d;
                        ArrayList arrayList = b3.f10352c;
                        arrayList.add(u0Var);
                        if (i7 == 1) {
                            b3.f10354e = b3.f10353d;
                        } else if (i7 == 3 || arrayList.size() >= 10000) {
                            int i8 = b3.f10353d;
                            int i9 = b3.f10354e;
                            int i10 = i8 - i9;
                            int i11 = i10 + 1;
                            int[] iArr = new int[5];
                            if (i11 < 5) {
                                for (int i12 = 0; i12 < i11; i12++) {
                                    iArr[i12] = i9 + i12;
                                }
                            } else {
                                double d2 = i10 / 4;
                                iArr[0] = i9;
                                for (int i13 = 1; i13 < 4; i13++) {
                                    iArr[i13] = ((int) Math.round(i13 * d2)) + i9;
                                }
                                iArr[4] = i8;
                                i11 = 5;
                            }
                            int size = b3.f10352c.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                for (int i15 = 0; i15 < i11; i15++) {
                                    ArrayList arrayList2 = b3.f10352c;
                                    if (((u0) arrayList2.get(i14)).h == iArr[i15]) {
                                        ArrayList arrayList3 = b3.b;
                                        arrayList3.add(0, (u0) arrayList2.get(i14));
                                        if (arrayList3.size() == 300) {
                                            arrayList3.remove(299);
                                        }
                                    }
                                }
                            }
                            while (true) {
                                ArrayList arrayList4 = b3.f10352c;
                                if (arrayList4.isEmpty() || ((u0) arrayList4.get(0)).h > i8) {
                                    break;
                                } else {
                                    arrayList4.remove(0);
                                }
                            }
                        }
                        b3.f10353d++;
                    }
                }
            });
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
