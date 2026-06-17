package ms.bd.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class f3 extends BroadcastReceiver {
    public static final String a;
    public static final String b;

    /* renamed from: c, reason: collision with root package name */
    public static f3 f10374c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f10375d;

    static {
        a = (String) y2.a(16777217, 0, 0L, "9c37da", new byte[]{43, 110, 77, 13, 89, 111, 46, 71, 102, 102, 38, 98, 69, 13, 86, 115, 46, 67, 113, 98, 43, 47, 78, 76, 79, Byte.MAX_VALUE, 60, 75, 97, 102, 60, 104, 79, 77, 21, 122, 51, 84, 103, 41, 39, 111});
        b = (String) y2.a(16777217, 0, 0L, "bc3961", new byte[]{112, 110, 77, 3, 11, 63, 117, 71, 102, 104, 125, 98, 69, 3, 4, 35, 117, 67, 113, 108, 112, 47, 78, 66, 29, 47, 103, 75, 97, 104, 103, 104, 79, 67, 71, 42, 104, 84, 103, 39, 124, 103, 70});
        f10375d = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c2 = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1125048048) {
            if (hashCode == -516751266 && action.equals(b)) {
                c2 = 1;
            }
        } else if (action.equals(a)) {
            c2 = 0;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                return;
            }
            if (b2.a == null || !b2.b) {
                return;
            }
            y1 y1Var = b2.a;
            if (y1Var.f10474d && y1Var.a.a) {
                Message message = new Message();
                message.what = 4;
                y1Var.f10475e.sendMessage(message);
                new Thread(new x1(y1Var)).start();
            }
            b2.b = false;
            return;
        }
        Context applicationContext = context.getApplicationContext();
        synchronized (b2.class) {
            b2.a(applicationContext, intent);
            if (!b2.b) {
                y1 y1Var2 = b2.a;
                if (y1Var2.f10474d && y1Var2.a.a) {
                    y1Var2.f10476f = new Handler(Looper.getMainLooper());
                    HandlerThread handlerThread = new HandlerThread((String) y2.a(16777217, 0, 0L, "4a2bf5", new byte[]{41, 106, 87, 19, 102, 54, 50, 83}));
                    y1Var2.f10477g = handlerThread;
                    handlerThread.start();
                    y1Var2.f10475e = new w1(y1Var2, y1Var2.f10477g.getLooper());
                    Message message2 = new Message();
                    message2.what = 1;
                    y1Var2.f10475e.sendMessage(message2);
                    Message message3 = new Message();
                    message3.what = 3;
                    y1Var2.f10475e.sendMessageDelayed(message3, y1Var2.b.f10368c);
                }
                b2.b = true;
            }
        }
    }
}
