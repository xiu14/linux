package ms.bd.c;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.heytap.mcssdk.constant.MessageConstant;

/* loaded from: classes2.dex */
public final class x0 {
    public EGLDisplay a;
    public EGLContext b;

    public x0() {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.a = eGLDisplay;
        this.b = EGL14.EGL_NO_CONTEXT;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException((String) y2.a(16777217, 0, 0L, "7655c2", new byte[]{3, 19, 106, 1, 93, 41, 38, 18, 101, 97, 63, 116, 85, 68, 72, 101, 33, 7}));
        }
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException((String) y2.a(16777217, 0, 0L, "89b6a6", new byte[]{60, 53, 16, 64, 82, 36, 123, 12, 60, 38, 46, 62, 5, 2, 123, 6, 23, 73, 103, 38, 45, 50, 2, 82, 82, 32, 34}));
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.a = null;
            throw new RuntimeException((String) y2.a(16777217, 0, 0L, "f559ee", new byte[]{98, 57, 71, 79, 86, 119, 37, 0, 107, 41, 126, 57, 79, 89, 83, 115, 105, 29, 126, 108, 55, 18, 97, 97, 11, 38}));
        }
        EGLConfig a = a(3);
        if (a != null) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.a, a, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.b = eglCreateContext;
            }
        }
        if (this.b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig a2 = a(2);
            if (a2 == null) {
                throw new RuntimeException((String) y2.a(16777217, 0, 0L, "d9dfdb", new byte[]{64, 53, 22, 16, 87, 112, 39, 12, 58, 118, 115, 50, 25, 22, 27, 116, 39, 11, 32, 63, 97, 58, 21, 30, 94, 53, 66, 63, 25, 21, 122, 53, 17, 27, 92}));
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.a, a2, eGLContext, new int[]{12440, 2, 12344}, 0);
            String str = (String) y2.a(16777217, 0, 0L, "f52926", new byte[]{114, 48, 77, 110, 31, 36, 100, 0, 102, 74, 120, 57, 85, 72, 21, 53});
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                StringBuilder M = e.a.a.a.a.M(str);
                M.append((String) y2.a(16777217, 0, 0L, "d1d740", new byte[]{47, 115, 50, 100, 39, 103, 98, 2, 39, 104, 103, 105, 87, 19, 19}));
                M.append(Integer.toHexString(eglGetError));
                throw new RuntimeException(M.toString());
            }
            this.b = eglCreateContext2;
        }
        EGL14.eglQueryContext(this.a, this.b, 12440, new int[1], 0);
    }

    public final EGLConfig a(int i) {
        int[] iArr = {MessageConstant.CommandId.COMMAND_IS_SUPPORT_LIQUID, 8, MessageConstant.CommandId.COMMAND_LIQUID_QUERY_TASK, 8, MessageConstant.CommandId.COMMAND_LIQUID_REQUEST, 8, MessageConstant.CommandId.COMMAND_NOTIFICATION_ACTIVE, 8, 12352, i >= 3 ? 68 : 4, 12344, 0, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final void b() {
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroyContext(eGLDisplay, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
    }

    public final void c(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.a, eGLSurface, eGLSurface, this.b)) {
            throw new RuntimeException((String) y2.a(16777217, 0, 0L, "16ce21", new byte[]{37, 51, 28, 60, 12, 45, 55, 52, 39, 39, 50, 49, 30, 5, 77, 32, 51, 30, 62, 48, 36}));
        }
    }

    public final void finalize() {
        try {
            if (this.a != EGL14.EGL_NO_DISPLAY) {
                b();
            }
        } finally {
            super.finalize();
        }
    }
}
