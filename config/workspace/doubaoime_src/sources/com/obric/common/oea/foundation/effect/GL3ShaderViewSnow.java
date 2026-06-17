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
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class GL3ShaderViewSnow extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int b = 0;
    private a a;

    private static class a implements GLSurfaceView.Renderer {
        private FloatBuffer A;
        private Bitmap B;
        private Bitmap C;
        private int E;
        private int F;
        private int G;
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f7540c;

        /* renamed from: d, reason: collision with root package name */
        private int f7541d;

        /* renamed from: e, reason: collision with root package name */
        private int f7542e;

        /* renamed from: f, reason: collision with root package name */
        private int f7543f;

        /* renamed from: g, reason: collision with root package name */
        private int f7544g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private Context y;
        private final float[] z;
        private float o = -1.0f;
        private float p = -1.0f;
        private float q = -1.0f;
        private int r = 0;
        private int s = 0;
        private int t = 0;
        private int u = 0;
        private e.i.a.a.a.a.a.a v = new e.i.a.a.a.a.a.a(1.0f);
        private e.i.a.a.a.a.a.a w = new e.i.a.a.a.a.a.a(0.5f);
        private e.i.a.a.a.a.a.a x = new e.i.a.a.a.a.a.a(1.0f);
        private int D = 0;
        private int H = 0;
        private int I = 0;

        public a(Context context) {
            float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
            this.z = fArr;
            this.y = context;
            FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            this.A = put;
            put.position(0);
        }

        private void d(String str) {
            int glGetError = GLES30.glGetError();
            if (glGetError == 0) {
                return;
            }
            int i = GL3ShaderViewSnow.b;
            Log.e("GL2ShaderView", str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }

        private int e(String str, String str2) {
            int f2;
            int f3 = f(35633, str);
            if (f3 == 0 || (f2 = f(35632, str2)) == 0) {
                return 0;
            }
            int glCreateProgram = GLES30.glCreateProgram();
            if (glCreateProgram != 0) {
                GLES30.glAttachShader(glCreateProgram, f3);
                d("glAttachShader");
                GLES30.glAttachShader(glCreateProgram, f2);
                d("glAttachShader");
                GLES30.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES30.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    int i = GL3ShaderViewSnow.b;
                    Log.e("GL2ShaderView", "Could not link program: ");
                    Log.e("GL2ShaderView", GLES30.glGetProgramInfoLog(glCreateProgram));
                    GLES30.glDeleteProgram(glCreateProgram);
                    return 0;
                }
            }
            return glCreateProgram;
        }

        private int f(int i, String str) {
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
            int i2 = GL3ShaderViewSnow.b;
            Log.e("GL2ShaderView", "Could not compile shader " + i + Constants.COLON_SEPARATOR);
            Log.e("GL2ShaderView", GLES30.glGetShaderInfoLog(glCreateShader));
            GLES30.glDeleteShader(glCreateShader);
            return 0;
        }

        private static int g(Bitmap bitmap) {
            int[] iArr = new int[1];
            GLES30.glGenTextures(1, iArr, 0);
            if (iArr[0] != 0) {
                GLES30.glBindTexture(3553, iArr[0]);
                GLES30.glTexParameteri(3553, 10242, 33071);
                GLES30.glTexParameteri(3553, 10243, 33071);
                GLES30.glTexParameteri(3553, 10241, 9729);
                GLES30.glTexParameteri(3553, 10240, 9729);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GLES30.glBindTexture(3553, 0);
                bitmap.recycle();
            }
            return iArr[0];
        }

        public void h(Bitmap bitmap) {
            this.B = bitmap;
        }

        public void i(Bitmap bitmap) {
            this.C = bitmap;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (this.r != this.s || this.t != this.u) {
                if (this.D == 0) {
                    int e2 = e("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nout vec4 fragColor;\nvec3 blendOverlay(in vec3 base, in vec3 blend) {\n    return mix(2.0 * base * blend, 1.0 - 2.0 * (1.0 - base) * (1.0 - blend), step(0.5, base));\n}\nvec3 dim(in vec3 baseColor) {\n    vec3 overlayColor = vec3(0.0);\n    vec3 overlayResult = blendOverlay(baseColor, overlayColor);\n    float overlayAlpha = 0.3;\n    return mix(baseColor, overlayResult, overlayAlpha);\n}\nvoid main() {\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    texUV.y = 1.0 - texUV.y;\n    vec4 baseColor = texture(u_background, texUV);\n    fragColor = vec4(dim(baseColor.rgb), baseColor.a);\n}\n");
                    this.D = e2;
                    this.E = GLES30.glGetAttribLocation(e2, "vPosition");
                    d("glGetAttribLocation");
                    this.F = GLES30.glGetUniformLocation(this.D, "u_background");
                    d("glGetAttribLocation");
                    this.G = GLES30.glGetUniformLocation(this.D, "u_resolution");
                    d("glGetUniformLocation");
                }
                GLES30.glUseProgram(this.D);
                if (this.H == 0) {
                    int[] iArr = new int[1];
                    GLES30.glGenFramebuffers(1, iArr, 0);
                    this.H = iArr[0];
                }
                GLES30.glBindFramebuffer(36160, this.H);
                if (this.I == 0) {
                    int[] iArr2 = new int[1];
                    GLES30.glGenTextures(1, iArr2, 0);
                    this.I = iArr2[0];
                }
                GLES30.glBindTexture(3553, this.I);
                GLES30.glTexImage2D(3553, 0, 6408, this.r, this.t, 0, 6408, 5121, null);
                GLES30.glTexParameteri(3553, 10241, 9987);
                GLES30.glTexParameteri(3553, 10240, 9729);
                GLES30.glTexParameteri(3553, 10242, 33071);
                GLES30.glTexParameteri(3553, 10243, 33071);
                GLES30.glFramebufferTexture2D(36160, 36064, 3553, this.I, 0);
                GLES30.glBindFramebuffer(36160, 0);
                GLES30.glUseProgram(0);
                GLES30.glBindFramebuffer(36160, this.H);
                GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES30.glClear(16384);
                GLES30.glUseProgram(this.D);
                GLES30.glUniform2f(this.G, this.r, this.t);
                GLES30.glActiveTexture(33984);
                GLES30.glBindTexture(3553, this.k);
                GLES30.glUniform1i(this.F, 0);
                GLES30.glEnableVertexAttribArray(this.E);
                GLES30.glVertexAttribPointer(this.E, 2, 5126, false, 0, (Buffer) this.A);
                GLES30.glDrawArrays(6, 0, 4);
                GLES30.glBindTexture(3553, this.I);
                GLES30.glGenerateMipmap(3553);
                GLES30.glBindTexture(3553, 0);
                GLES30.glBindFramebuffer(36160, 0);
            }
            long currentTimeMillis = System.currentTimeMillis();
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.a);
            GLES30.glUniform1f(this.f7544g, (currentTimeMillis % 1000000) / 1000.0f);
            int i = this.r;
            if (i != this.s || this.t != this.u) {
                this.s = i;
                int i2 = this.t;
                this.u = i2;
                GLES30.glUniform2f(this.f7543f, i, i2);
            }
            if (this.v.a() != this.o) {
                float a = this.v.a();
                this.o = a;
                GLES30.glUniform1f(this.h, a);
            }
            if (this.w.a() != this.p) {
                float a2 = this.w.a();
                this.p = a2;
                GLES30.glUniform1f(this.i, a2);
            }
            if (this.x.a() != this.q) {
                float a3 = this.x.a();
                this.q = a3;
                GLES30.glUniform1f(this.j, a3);
            }
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, this.k);
            GLES30.glUniform1i(this.f7540c, 0);
            GLES30.glActiveTexture(33985);
            GLES30.glBindTexture(3553, this.I);
            GLES30.glUniform1i(this.f7541d, 1);
            GLES30.glActiveTexture(33986);
            GLES30.glBindTexture(3553, this.l);
            GLES30.glUniform1i(this.f7542e, 2);
            GLES30.glBindVertexArray(this.m);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            this.r = i;
            this.t = i2;
            GLES30.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int e2 = e("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision highp float;\n#define clamp01(x) clamp(x, 0.0, 1.0)\nuniform vec2 u_resolution;\nuniform float u_time;\nuniform sampler2D u_background;\nuniform sampler2D u_prepass;\nuniform sampler2D u_frostTex;\nuniform float u_alpha;\nuniform float u_intensity;\nuniform float u_speed;\nconst float LOD         = 9.0;\nconst float SNOW_LAYERS = 30.0;\nconst float SNOW_DEPTH  = 0.5;\nconst float SNOW_WIDTH  = 0.5;\nconst vec3 FROST_COLOR  = vec3(0.82, 0.89, 0.96);\nconst vec2 SHIFT        = vec2(0.07, -0.03);\nout vec4 fragColor;\nvec3 blendNormal(in vec3 baseColor, in vec3 blendColor, in float opacity) {\n    return mix(baseColor, blendColor, opacity);\n}\nfloat random(in vec2 uv) {\n    return fract(sin(dot(uv, vec2(12.9898, 78.233))) * 43758.5453123);\n}\nconst mat3 randomMat = mat3(13.323122, 23.5112, 21.71123,\n        21.1212, 28.7312, 11.9312,\n        21.8112, 14.7212, 61.3934);\nfloat generateSnowLayer(in vec2 uv, in float t, float layer, float width) {\n    float depth = layer * SNOW_DEPTH;\n    vec2 q = uv * (1.0 + depth);\n    q += vec2(q.y * width * (fract(layer * 7.238917) - 0.5),\n            t / (1.0 + depth * 0.03));\n    vec3 n = vec3(floor(q), 31.189 + layer);\n    vec3 m = floor(n) / 1e5 + fract(n);\n    vec3 mp = (31415.9 + m) / fract(randomMat * m);\n    vec3 r = fract(mp);\n    vec2 s = abs(fract(q) - 0.5 + 0.9 * r.xy - 0.45) +\n            0.01 * abs(2.0 * fract(10.0 * q.yx) - 1.0);\n    float d = 0.6 * (s.x + s.y) + max(s.x, s.y) - 0.01;\n    float edge = 0.005 + 0.05 * min(0.5 * abs(layer - 5.0), 1.0);\n    return smoothstep(edge, -edge, d) * r.x / (1.0 + 0.02 * depth);\n}\nfloat computeSnow(in vec2 uv, in float t) {\n    uv += t * SHIFT;\n    float snow = 0.0;\n    float layers = mix(0.0, SNOW_LAYERS, u_intensity);\n    float width  = mix(0.0, SNOW_WIDTH, u_intensity);\n    for (float i = 0.0; i < layers; i++) {\n        snow += generateSnowLayer(uv, t, i, width);\n    }\n    return clamp01(snow);\n}\nvec2 frostEffect(in vec2 uv) {\n    vec4 frostTex = texture(u_frostTex, uv);\n    vec2 offset = vec2(random(uv + frostTex.r * 0.05),\n            random(uv + frostTex.b * 0.05));\n    float distToCenter = distance(uv, vec2(0.5));\n    float frostiness   = mix(1.0, 0.5, u_intensity);\n    float vignette     = pow(1.0 - smoothstep(frostiness, 0.0, distToCenter), 2.0);\n    offset *= 0.025 * vignette + frostTex.rg * vignette * u_intensity * 4.0;\n    return clamp(offset, vec2(0.0), vec2(1.0));\n}\nvoid main() {\n    vec2 uv = (gl_FragCoord.xy - 0.5 * u_resolution) / u_resolution.y;\n    float t = u_time * u_speed;\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    vec3 baseColor    = texture(u_background, texUV).rgb;\n    vec3 prepassColor = textureLod(u_prepass, texUV, LOD).rgb;\n    vec2 frostOffset  = frostEffect(texUV);\n    float snowEffect  = computeSnow(uv + frostOffset * 0.3, t);\n    vec3 effectColor = prepassColor + snowEffect;\n    effectColor = blendNormal(effectColor, FROST_COLOR, frostOffset.x);\n    vec3 finalColor = mix(baseColor, effectColor, u_alpha);\n    fragColor = vec4(finalColor, 1.0);\n}\n");
            this.a = e2;
            if (e2 == 0) {
                return;
            }
            this.b = GLES30.glGetAttribLocation(e2, "vPosition");
            d("glGetAttribLocation");
            this.f7540c = GLES30.glGetUniformLocation(this.a, "u_background");
            d("glGetAttribLocation");
            this.f7541d = GLES30.glGetUniformLocation(this.a, "u_prepass");
            d("glGetAttribLocation");
            this.f7542e = GLES30.glGetUniformLocation(this.a, "u_frostTex");
            d("glGetAttribLocation");
            this.f7543f = GLES30.glGetUniformLocation(this.a, "u_resolution");
            d("glGetUniformLocation");
            this.f7544g = GLES30.glGetUniformLocation(this.a, "u_time");
            d("glGetUniformLocation");
            this.h = GLES30.glGetUniformLocation(this.a, "u_alpha");
            d("glGetUniformLocation");
            this.i = GLES30.glGetUniformLocation(this.a, "u_intensity");
            d("glGetUniformLocation");
            this.j = GLES30.glGetUniformLocation(this.a, "u_speed");
            d("glGetUniformLocation");
            GLES30.glUseProgram(this.a);
            this.k = g(this.B);
            this.l = g(this.C);
            int[] iArr = new int[1];
            GLES30.glGenVertexArrays(1, iArr, 0);
            int i = iArr[0];
            this.m = i;
            GLES30.glBindVertexArray(i);
            int[] iArr2 = new int[1];
            GLES30.glGenBuffers(1, iArr2, 0);
            int i2 = iArr2[0];
            this.n = i2;
            GLES30.glBindBuffer(34962, i2);
            GLES30.glBufferData(34962, this.z.length * 4, this.A, 35044);
            GLES30.glEnableVertexAttribArray(this.b);
            GLES30.glVertexAttribPointer(this.b, 2, 5126, false, 0, 0);
            GLES30.glBindBuffer(34962, 0);
            GLES30.glBindVertexArray(0);
            GLES30.glUseProgram(0);
        }
    }

    public GL3ShaderViewSnow(Context context) {
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
        this.a.h(bitmap);
    }

    public void setFrostImage(Bitmap bitmap) {
        this.a.i(bitmap);
    }

    public void setShaderAlpha(float f2) {
        this.a.v.b(f2);
    }

    public void setShaderIntensity(float f2) {
        this.a.w.b(f2);
    }

    public void setShaderSpeed(float f2) {
        this.a.x.b(f2);
    }

    public GL3ShaderViewSnow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().setFormat(1);
        setZOrderOnTop(true);
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 0, 0, 0);
        a aVar = new a(getContext());
        this.a = aVar;
        setRenderer(aVar);
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
    }
}
