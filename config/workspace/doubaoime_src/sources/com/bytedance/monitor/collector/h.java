package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class h {
    private static MessageQueue a;
    private static Field b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f5453c;

    public static MessageQueue a() {
        if (a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                a = Looper.myQueue();
            } else {
                a = mainLooper.getQueue();
            }
        }
        return a;
    }

    public static Message b(MessageQueue messageQueue) {
        Field field = b;
        if (field != null) {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            b = declaredField;
            declaredField.setAccessible(true);
            return (Message) b.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    protected static Message c(Message message) {
        Field field = f5453c;
        if (field != null) {
            try {
                return (Message) field.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            f5453c = declaredField;
            declaredField.setAccessible(true);
            return (Message) f5453c.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }
}
