package com.ss.ugc.effectplatform.util;

import android.os.Build;
import com.heytap.mcssdk.constant.MessageConstant;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class c {
    private EGL10 a;
    private EGLDisplay b;

    /* renamed from: c, reason: collision with root package name */
    private EGLConfig f8530c;

    /* renamed from: d, reason: collision with root package name */
    private EGLSurface f8531d;

    /* renamed from: e, reason: collision with root package name */
    private EGLContext f8532e;

    /* renamed from: f, reason: collision with root package name */
    private GL10 f8533f;

    /* renamed from: g, reason: collision with root package name */
    private final EGLContext f8534g = EGL10.EGL_NO_CONTEXT;
    private final boolean h;

    public c() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            kotlin.s.c.l.b(str, "(this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        this.h = kotlin.s.c.l.a("mi play", str);
    }

    private final void a(EGL10 egl10) {
        int eglGetError = egl10.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder M = e.a.a.a.a.M("EGL error: 0x");
            M.append(Integer.toHexString(eglGetError));
            e(M.toString());
        }
    }

    private final void e(String str) {
        if (this.h) {
            throw new RuntimeException(str);
        }
        d.a.c.b.b.b("EGLUtils", "get gpu info error:" + str, null);
    }

    public final void b() {
        EGLSurface eGLSurface;
        EGL10 egl10 = this.a;
        if (egl10 != null) {
            if (!this.h) {
                EGLDisplay eGLDisplay = this.b;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.b, this.f8531d);
                egl10.eglDestroyContext(this.b, this.f8532e);
                egl10.eglTerminate(this.b);
                return;
            }
            EGLDisplay eGLDisplay2 = this.b;
            if (eGLDisplay2 != EGL10.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface3 = this.f8531d;
                if (eGLSurface3 != null && eGLSurface3 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                    egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl10.eglDestroySurface(this.b, this.f8531d);
                    this.f8531d = null;
                }
                EGLContext eGLContext = this.f8532e;
                if (eGLContext != null) {
                    egl10.eglDestroyContext(this.b, eGLContext);
                    this.f8532e = null;
                }
                EGLDisplay eGLDisplay3 = this.b;
                if (eGLDisplay3 != null) {
                    egl10.eglTerminate(eGLDisplay3);
                    this.b = null;
                }
            }
        }
    }

    public final void c(int i, int i2) {
        int[] iArr = {12352, 4, MessageConstant.CommandId.COMMAND_IS_SUPPORT_LIQUID, 8, MessageConstant.CommandId.COMMAND_LIQUID_QUERY_TASK, 8, MessageConstant.CommandId.COMMAND_LIQUID_REQUEST, 8, MessageConstant.CommandId.COMMAND_NOTIFICATION_ACTIVE, 8, MessageConstant.CommandId.COMMAND_LIQUID_REQUEST_BATCH, 0, MessageConstant.CommandId.COMMAND_IS_SUPPORT_LIQUID_BATCH, 0, 12344};
        Object egl = EGLContext.getEGL();
        if (!(egl instanceof EGL10)) {
            egl = null;
        }
        EGL10 egl10 = (EGL10) egl;
        if (egl10 != null) {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.b = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                e("unable to get EGL10 display");
            }
            a(egl10);
            if (!egl10.eglInitialize(this.b, new int[2])) {
                e("unable to initialize EGL10");
            }
            a(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.b, iArr, null, 0, iArr2)) {
                e("eglChooseConfig failed");
            }
            a(egl10);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
            if (!egl10.eglChooseConfig(this.b, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                e("eglChooseConfig#2 failed");
            }
            a(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f8530c = eGLConfig;
            if (eGLConfig == null) {
                e("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.b, this.f8530c, new int[]{12375, i, 12374, i2, 12344});
            this.f8531d = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || eglCreatePbufferSurface == null) {
                e("surface was null");
            }
            a(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.b, this.f8530c, this.f8534g, new int[]{12440, 2, 12344});
            this.f8532e = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || eglCreateContext == null) {
                e("context was null");
            }
            a(egl10);
            EGLDisplay eGLDisplay = this.b;
            EGLSurface eGLSurface = this.f8531d;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f8532e)) {
                e("eglMakeCurrent failed");
            }
            a(egl10);
            EGLContext eGLContext = this.f8532e;
            GL gl = eGLContext != null ? eGLContext.getGL() : null;
            this.f8533f = (GL10) (gl instanceof GL10 ? gl : null);
            this.a = egl10;
        }
    }

    public final GL10 d() {
        return this.f8533f;
    }
}
