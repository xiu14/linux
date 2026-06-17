package com.obric.common.oea.foundation.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import com.xiaomi.mipush.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class GL3ShaderViewKawaseBlur extends GLSurfaceView implements Choreographer.FrameCallback {
    private a a;

    private class a implements GLSurfaceView.Renderer {
        private int A;
        private int B;
        private final float[] H;
        private FloatBuffer I;

        /* renamed from: J, reason: collision with root package name */
        private Bitmap f7529J;
        private Bitmap K;
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f7530c;

        /* renamed from: d, reason: collision with root package name */
        private int f7531d;

        /* renamed from: e, reason: collision with root package name */
        private int f7532e;

        /* renamed from: f, reason: collision with root package name */
        private int f7533f;

        /* renamed from: g, reason: collision with root package name */
        private int f7534g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;
        private int w;
        private int x;
        private int y;
        private int z;
        private int C = 0;
        private int D = 0;
        private int E = 0;
        private int F = 0;
        private int G = 0;
        private int L = 0;
        private int M = 0;
        private int N = 0;
        private int O = 0;
        private int P = 0;
        private int Q = 0;
        private int R = 0;
        private int S = 0;
        private float T = 600.0f;

        public a(GL3ShaderViewKawaseBlur gL3ShaderViewKawaseBlur) {
            float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
            this.H = fArr;
            FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            this.I = put;
            put.position(0);
        }

        private void a(String str) {
            int glGetError = GLES30.glGetError();
            if (glGetError == 0) {
                return;
            }
            Log.e("GL3BlurRenderer", str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }

        private int[] b(int i, int i2) {
            int[] iArr = new int[1];
            GLES30.glGenFramebuffers(1, iArr, 0);
            GLES30.glBindFramebuffer(36160, iArr[0]);
            int[] iArr2 = new int[1];
            GLES30.glGenTextures(1, iArr2, 0);
            GLES30.glBindTexture(3553, iArr2[0]);
            GLES30.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES30.glTexParameteri(3553, 10242, 33071);
            GLES30.glTexParameteri(3553, 10243, 33071);
            GLES30.glTexParameteri(3553, 10241, 9729);
            GLES30.glTexParameteri(3553, 10240, 9729);
            GLES30.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES30.glBindFramebuffer(36160, 0);
            return new int[]{iArr[0], iArr2[0]};
        }

        private int c(String str, String str2) {
            int d2;
            int d3 = d(35633, str);
            if (d3 == 0 || (d2 = d(35632, str2)) == 0) {
                return 0;
            }
            int glCreateProgram = GLES30.glCreateProgram();
            if (glCreateProgram != 0) {
                GLES30.glAttachShader(glCreateProgram, d3);
                a("glAttachShader");
                GLES30.glAttachShader(glCreateProgram, d2);
                a("glAttachShader");
                GLES30.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES30.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    Log.e("GL3BlurRenderer", "Could not link program: ");
                    Log.e("GL3BlurRenderer", GLES30.glGetProgramInfoLog(glCreateProgram));
                    GLES30.glDeleteProgram(glCreateProgram);
                    return 0;
                }
            }
            return glCreateProgram;
        }

        private int d(int i, String str) {
            int glCreateShader = GLES30.glCreateShader(i);
            if (glCreateShader == 0) {
                return glCreateShader;
            }
            GLES30.glShaderSource(glCreateShader, str);
            GLES30.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES30.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            Log.e("GL3BlurRenderer", "Could not compile shader " + i + Constants.COLON_SEPARATOR);
            Log.e("GL3BlurRenderer", GLES30.glGetShaderInfoLog(glCreateShader));
            GLES30.glDeleteShader(glCreateShader);
            return 0;
        }

        private int[] e(int i, int i2) {
            GLES30.glUseProgram(i);
            int[] iArr = new int[1];
            GLES30.glGenVertexArrays(1, iArr, 0);
            int i3 = iArr[0];
            GLES30.glBindVertexArray(i3);
            int[] iArr2 = new int[1];
            GLES30.glGenBuffers(1, iArr2, 0);
            int i4 = iArr2[0];
            GLES30.glBindBuffer(34962, i4);
            GLES30.glBufferData(34962, this.H.length * 4, this.I, 35044);
            GLES30.glEnableVertexAttribArray(i2);
            GLES30.glVertexAttribPointer(i2, 2, 5126, false, 0, 0);
            GLES30.glBindBuffer(34962, 0);
            GLES30.glBindVertexArray(0);
            GLES30.glUseProgram(0);
            return new int[]{i3, i4};
        }

        private void f(int i, int i2, float f2, float f3) {
            GLES30.glViewport(0, 0, this.D / 4, this.F / 4);
            GLES30.glBindFramebuffer(36160, i2);
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.f7534g);
            GLES30.glUniform2f(this.j, this.D / 4, this.F / 4);
            GLES30.glUniform1f(this.l, f3);
            GLES30.glUniform1f(this.k, f2);
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, i);
            GLES30.glUniform1i(this.i, 0);
            GLES30.glBindVertexArray(this.m);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
            if (i2 != 0) {
                GLES30.glBindFramebuffer(36160, 0);
            }
        }

        private void g(int i, int i2, float f2, float f3) {
            GLES30.glViewport(0, 0, this.D / 4, this.F / 4);
            GLES30.glBindFramebuffer(36160, i2);
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.n);
            GLES30.glUniform2f(this.q, this.D / 4, this.F / 4);
            GLES30.glUniform1f(this.r, f2);
            GLES30.glUniform1f(this.s, f3);
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, i);
            GLES30.glUniform1i(this.p, 0);
            GLES30.glBindVertexArray(this.t);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
            GLES30.glBindFramebuffer(36160, 0);
        }

        private void h(int i, int i2, int i3, float f2, boolean z) {
            if (i3 != 0) {
                GLES30.glViewport(0, 0, this.D / 4, this.F / 4);
                GLES30.glBindFramebuffer(36160, i3);
            } else {
                GLES30.glViewport(0, 0, this.D, this.F);
            }
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.u);
            if (i3 != 0) {
                GLES30.glUniform2f(this.y, this.D / 4, this.F / 4);
            } else {
                GLES30.glUniform2f(this.y, this.D, this.F);
            }
            GLES30.glUniform1i(this.z, z ? 1 : 0);
            GLES30.glUniform1f(this.A, f2);
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, i);
            GLES30.glUniform1i(this.w, 0);
            GLES30.glActiveTexture(33985);
            GLES30.glBindTexture(3553, i2);
            GLES30.glUniform1i(this.x, 1);
            GLES30.glBindVertexArray(this.B);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
            if (i3 != 0) {
                GLES30.glBindFramebuffer(36160, 0);
            }
        }

        private void i(int i, int i2) {
            if (i2 != 0) {
                GLES30.glViewport(0, 0, this.D / 4, this.F / 4);
                GLES30.glBindFramebuffer(36160, i2);
            } else {
                GLES30.glViewport(0, 0, this.D, this.F);
            }
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.a);
            if (i2 != 0) {
                GLES30.glUniform2f(this.f7531d, this.D / 4, this.F / 4);
                GLES30.glUniform1i(this.f7532e, 1);
            } else {
                GLES30.glUniform2f(this.f7531d, this.D, this.F);
                GLES30.glUniform1i(this.f7532e, 0);
            }
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, i);
            GLES30.glUniform1i(this.f7530c, 0);
            GLES30.glBindVertexArray(this.f7533f);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
            GLES30.glBindTexture(3553, 0);
            if (i2 != 0) {
                GLES30.glBindFramebuffer(36160, 0);
            }
        }

        public void j(Bitmap bitmap) {
            this.K = bitmap;
        }

        public void k(float f2) {
            this.T = f2;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            int i;
            int i2 = this.D;
            if (i2 == 0 || (i = this.F) == 0) {
                return;
            }
            boolean z = true;
            boolean z2 = (i2 == this.E && i == this.G) ? false : true;
            if (this.K != this.f7529J) {
                int i3 = this.C;
                if (i3 != 0) {
                    GLES30.glDeleteTextures(1, new int[]{i3}, 0);
                }
                Bitmap bitmap = this.K;
                int[] iArr = new int[1];
                GLES30.glGenTextures(1, iArr, 0);
                if (iArr[0] != 0) {
                    GLES30.glBindTexture(3553, iArr[0]);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    GLES30.glTexParameteri(3553, 10241, 9729);
                    GLES30.glTexParameteri(3553, 10240, 9729);
                    GLES30.glTexParameteri(3553, 10242, 33071);
                    GLES30.glTexParameteri(3553, 10243, 33071);
                    GLES30.glBindTexture(3553, 0);
                }
                this.C = iArr[0];
            } else {
                z = z2;
            }
            if (z) {
                i(this.C, this.L);
            }
            float f2 = this.T;
            if (f2 >= 240.0f) {
                float f3 = f2 / 120.0f;
                f(this.M, this.N, f3, 2.0f);
                f(this.O, this.P, f3, 2.0f);
                f(this.Q, this.N, f3, 2.0f);
                g(this.O, this.P, f3, 2.0f);
                g(this.Q, this.N, f3, 2.0f);
                g(this.O, this.P, f3, 2.0f);
                i(this.Q, 0);
            } else if (f2 >= 220.0f) {
                float f4 = f2 / 120.0f;
                f(this.M, this.N, f4, 2.0f);
                f(this.O, this.P, f4, 2.0f);
                f(this.Q, this.N, f4, 2.0f);
                g(this.O, this.P, f4, 2.0f);
                g(this.Q, this.N, f4, 2.0f);
                g(this.O, this.P, f4, 2.0f);
                float f5 = this.T / 60.0f;
                f(this.M, this.N, f5, 2.0f);
                f(this.O, this.R, f5, 2.0f);
                g(this.S, this.N, f5, 2.0f);
                g(this.O, this.R, f5, 2.0f);
                h(this.S, this.Q, 0, 1.0f - ((240.0f - this.T) / 20.0f), false);
            } else if (f2 >= 120.0f) {
                float f6 = f2 / 60.0f;
                f(this.M, this.N, f6, 2.0f);
                f(this.O, this.P, f6, 2.0f);
                g(this.Q, this.N, f6, 2.0f);
                g(this.O, this.P, f6, 2.0f);
                i(this.Q, 0);
            } else if (f2 >= 100.0f) {
                float f7 = f2 / 60.0f;
                f(this.M, this.N, f7, 2.0f);
                f(this.O, this.P, f7, 2.0f);
                g(this.Q, this.N, f7, 2.0f);
                g(this.O, this.P, f7, 2.0f);
                float f8 = this.T / 30.0f;
                f(this.M, this.N, f8, 2.0f);
                f(this.O, this.R, f8, 1.0f);
                g(this.S, this.N, f8, 2.0f);
                g(this.O, this.R, f8, 1.0f);
                h(this.S, this.Q, 0, 1.0f - ((120.0f - this.T) / 20.0f), false);
            } else if (f2 >= 50.0f) {
                float f9 = f2 / 30.0f;
                f(this.M, this.N, f9, 2.0f);
                f(this.O, this.P, f9, 1.0f);
                g(this.Q, this.N, f9, 2.0f);
                g(this.O, this.P, f9, 1.0f);
                i(this.Q, 0);
            } else if (f2 >= 30.0f) {
                float f10 = f2 / 30.0f;
                f(this.M, this.N, f10, 2.0f);
                f(this.O, this.P, f10, 1.0f);
                g(this.Q, this.N, f10, 2.0f);
                g(this.O, this.P, f10, 1.0f);
                float f11 = this.T / 15.0f;
                f(this.M, this.N, f11, 1.0f);
                f(this.O, this.R, f11, 1.0f);
                g(this.S, this.N, f11, 1.0f);
                g(this.O, this.R, f11, 1.0f);
                h(this.S, this.Q, 0, 1.0f - ((50.0f - this.T) / 20.0f), false);
            } else if (f2 >= 15.0f) {
                float f12 = f2 / 15.0f;
                f(this.M, this.N, f12, 1.0f);
                f(this.O, this.P, f12, 1.0f);
                g(this.Q, this.N, f12, 1.0f);
                g(this.O, this.P, f12, 1.0f);
                i(this.Q, 0);
            } else {
                f(this.M, this.N, 1.0f, 1.0f);
                f(this.O, this.P, 1.0f, 1.0f);
                g(this.Q, this.N, 1.0f, 1.0f);
                g(this.O, this.P, 1.0f, 1.0f);
                h(this.C, this.Q, 0, this.T / 15.0f, true);
            }
            this.E = this.D;
            this.G = this.F;
            this.f7529J = this.K;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            this.D = i;
            this.F = i2;
            if (i == 0 || i2 == 0) {
                return;
            }
            if (i == this.E && i2 == this.G) {
                return;
            }
            int i3 = this.L;
            if (i3 != 0) {
                GLES30.glDeleteFramebuffers(1, new int[]{i3}, 0);
            }
            int i4 = this.M;
            if (i4 != 0) {
                GLES30.glDeleteTextures(1, new int[]{i4}, 0);
            }
            int i5 = this.N;
            if (i5 != 0) {
                GLES30.glDeleteFramebuffers(1, new int[]{i5}, 0);
            }
            int i6 = this.O;
            if (i6 != 0) {
                GLES30.glDeleteTextures(1, new int[]{i6}, 0);
            }
            int i7 = this.P;
            if (i7 != 0) {
                GLES30.glDeleteFramebuffers(1, new int[]{i7}, 0);
            }
            int i8 = this.Q;
            if (i8 != 0) {
                GLES30.glDeleteTextures(1, new int[]{i8}, 0);
            }
            int i9 = this.R;
            if (i9 != 0) {
                GLES30.glDeleteFramebuffers(1, new int[]{i9}, 0);
            }
            int i10 = this.S;
            if (i10 != 0) {
                GLES30.glDeleteTextures(1, new int[]{i10}, 0);
            }
            int[] b = b(this.D / 4, this.F / 4);
            this.L = b[0];
            this.M = b[1];
            int[] b2 = b(this.D / 4, this.F / 4);
            this.N = b2[0];
            this.O = b2[1];
            int[] b3 = b(this.D / 4, this.F / 4);
            this.P = b3[0];
            this.Q = b3[1];
            int[] b4 = b(this.D / 4, this.F / 4);
            this.R = b4[0];
            this.S = b4[1];
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int c2 = c("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nuniform int u_revert;\nout vec4 fragColor;\nvoid main() {\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    texUV.y = u_revert > 0 ? 1.0 - texUV.y : texUV.y;\n    fragColor = texture(u_background, texUV);\n}\n");
            this.a = c2;
            this.b = GLES30.glGetAttribLocation(c2, "vPosition");
            a("glGetAttribLocation");
            this.f7530c = GLES30.glGetUniformLocation(this.a, "u_background");
            a("glGetAttribLocation");
            this.f7531d = GLES30.glGetUniformLocation(this.a, "u_resolution");
            a("glGetUniformLocation");
            this.f7532e = GLES30.glGetUniformLocation(this.a, "u_revert");
            a("glGetUniformLocation");
            int[] e2 = e(this.a, this.b);
            this.f7533f = e2[0];
            int i = e2[1];
            int c3 = c("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nuniform float u_blurOffset;\nuniform float u_divider;\nout vec4 fragColor;\nvoid main() {\n    vec2 uv = (gl_FragCoord.xy * u_divider) / u_resolution;\n    if (uv.x > 1.2 || uv.y > 1.2) {\n         fragColor = vec4(0.0, 0.0, 0.0, 0.0);\n         return;\n    }\n    vec2 halfPixel = 0.5 * u_divider/ u_resolution;\n    fragColor = texture(u_background, uv) * 0.5;\n    fragColor += texture(u_background, uv - halfPixel * u_blurOffset) * 0.125;\n    fragColor += texture(u_background, uv + halfPixel * u_blurOffset) * 0.125;\n    fragColor += texture(u_background, uv + vec2(halfPixel.x, -halfPixel.y) * u_blurOffset) * 0.125;\n    fragColor += texture(u_background, uv - vec2(halfPixel.x, -halfPixel.y) * u_blurOffset) * 0.125;\n}\n");
            this.f7534g = c3;
            this.h = GLES30.glGetAttribLocation(c3, "vPosition");
            a("glGetAttribLocation");
            this.i = GLES30.glGetUniformLocation(this.f7534g, "u_background");
            a("glGetAttribLocation");
            this.j = GLES30.glGetUniformLocation(this.f7534g, "u_resolution");
            a("glGetUniformLocation");
            a("glGetUniformLocation");
            this.k = GLES30.glGetUniformLocation(this.f7534g, "u_blurOffset");
            a("glGetUniformLocation");
            this.l = GLES30.glGetUniformLocation(this.f7534g, "u_divider");
            a("glGetUniformLocation");
            int[] e3 = e(this.f7534g, this.h);
            this.m = e3[0];
            int i2 = e3[1];
            int c4 = c("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nuniform float u_blurOffset;\nuniform float u_divider;\nout vec4 fragColor;\nvoid main() {\n    vec2 uv = gl_FragCoord.xy / (u_resolution * u_divider);\n    if (uv.x > 1.2 || uv.y > 1.2) {\n         fragColor = vec4(0.0, 0.0, 0.0, 0.0);\n         return;\n    }\n    vec2 halfPixel = 0.5 / (u_resolution * u_divider);\n    fragColor =  texture(u_background, uv + vec2(-halfPixel.x * 2.0, 0.0) * u_blurOffset);\n    fragColor += texture(u_background, uv + vec2(-halfPixel.x, halfPixel.y) * u_blurOffset) * 2.0;\n    fragColor += texture(u_background, uv + vec2(0.0, halfPixel.y * 2.0) * u_blurOffset);\n    fragColor += texture(u_background, uv + vec2(halfPixel.x, halfPixel.y) * u_blurOffset) * 2.0;\n    fragColor += texture(u_background, uv + vec2(halfPixel.x * 2.0, 0.0) * u_blurOffset);\n    fragColor += texture(u_background, uv + vec2(halfPixel.x, -halfPixel.y) * u_blurOffset) * 2.0;\n    fragColor += texture(u_background, uv + vec2(0.0, -halfPixel.y * 2.0) * u_blurOffset);\n    fragColor += texture(u_background, uv + vec2(-halfPixel.x, -halfPixel.y) * u_blurOffset) * 2.0;\n    fragColor /=  12.0;\n}\n");
            this.n = c4;
            this.o = GLES30.glGetAttribLocation(c4, "vPosition");
            a("glGetAttribLocation");
            this.p = GLES30.glGetUniformLocation(this.n, "u_background");
            a("glGetAttribLocation");
            this.q = GLES30.glGetUniformLocation(this.n, "u_resolution");
            a("glGetUniformLocation");
            this.r = GLES30.glGetUniformLocation(this.n, "u_blurOffset");
            a("glGetUniformLocation");
            this.s = GLES30.glGetUniformLocation(this.n, "u_divider");
            a("glGetUniformLocation");
            int[] e4 = e(this.n, this.o);
            this.t = e4[0];
            int i3 = e4[1];
            int c5 = c("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nuniform sampler2D u_foreground;\nuniform int u_revert;\nuniform float u_alpha;\nout vec4 fragColor;\nvoid main() {\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    vec4 colorB = texture(u_foreground, texUV);\n    texUV.y = u_revert > 0 ? 1.0 - texUV.y : texUV.y;\n    vec4 colorA = texture(u_background, texUV);\n    fragColor = mix(colorA, colorB, u_alpha);\n}\n");
            this.u = c5;
            this.v = GLES30.glGetAttribLocation(c5, "vPosition");
            a("glGetAttribLocation");
            this.w = GLES30.glGetUniformLocation(this.u, "u_background");
            a("glGetAttribLocation");
            this.x = GLES30.glGetUniformLocation(this.u, "u_foreground");
            a("glGetAttribLocation");
            this.y = GLES30.glGetUniformLocation(this.u, "u_resolution");
            a("glGetUniformLocation");
            this.z = GLES30.glGetUniformLocation(this.u, "u_revert");
            a("glGetUniformLocation");
            this.A = GLES30.glGetUniformLocation(this.u, "u_alpha");
            a("glGetUniformLocation");
            int[] e5 = e(this.u, this.v);
            this.B = e5[0];
            int i4 = e5[1];
        }
    }

    public GL3ShaderViewKawaseBlur(Context context) {
        super(context, null);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        requestRender();
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        Choreographer.getInstance().removeFrameCallback(this);
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public void setBackgroundImage(Bitmap bitmap) {
        this.a.j(bitmap);
    }

    public void setBlurRadius(float f2) {
        this.a.k(f2);
    }

    public GL3ShaderViewKawaseBlur(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().setFormat(1);
        setZOrderOnTop(true);
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 0, 0, 0);
        a aVar = new a(this);
        this.a = aVar;
        setRenderer(aVar);
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
    }
}
