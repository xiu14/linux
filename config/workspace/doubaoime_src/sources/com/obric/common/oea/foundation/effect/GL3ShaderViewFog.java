package com.obric.common.oea.foundation.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
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
public class GL3ShaderViewFog extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int b = 0;
    private a a;

    private static class a implements GLSurfaceView.Renderer {
        private final float[] A;
        private FloatBuffer B;
        private Bitmap C;
        private int E;
        private int F;
        private int G;
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f7524c;

        /* renamed from: d, reason: collision with root package name */
        private int f7525d;

        /* renamed from: e, reason: collision with root package name */
        private int f7526e;

        /* renamed from: f, reason: collision with root package name */
        private int f7527f;

        /* renamed from: g, reason: collision with root package name */
        private int f7528g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private Context z;
        private float n = -1.0f;
        private float o = -1.0f;
        private float p = -1.0f;
        private int q = 0;
        private int r = 0;
        private int s = 0;
        private int t = 0;
        private int u = 0;
        private e.i.a.a.a.a.a.a v = new e.i.a.a.a.a.a.a(1.0f);
        private e.i.a.a.a.a.a.a w = new e.i.a.a.a.a.a.a(0.8f);
        private e.i.a.a.a.a.a.a x = new e.i.a.a.a.a.a.a(0.5f);
        private int y = -3618616;
        private int D = 0;
        private int H = 0;
        private int I = 0;

        public a(Context context) {
            float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
            this.A = fArr;
            this.z = context;
            FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            this.B = put;
            put.position(0);
        }

        private void e(String str) {
            int glGetError = GLES30.glGetError();
            if (glGetError == 0) {
                return;
            }
            int i = GL3ShaderViewFog.b;
            Log.e("GL2ShaderView", str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }

        private int f(String str, String str2) {
            int g2;
            int g3 = g(35633, str);
            if (g3 == 0 || (g2 = g(35632, str2)) == 0) {
                return 0;
            }
            int glCreateProgram = GLES30.glCreateProgram();
            if (glCreateProgram != 0) {
                GLES30.glAttachShader(glCreateProgram, g3);
                e("glAttachShader");
                GLES30.glAttachShader(glCreateProgram, g2);
                e("glAttachShader");
                GLES30.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES30.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    int i = GL3ShaderViewFog.b;
                    Log.e("GL2ShaderView", "Could not link program: ");
                    Log.e("GL2ShaderView", GLES30.glGetProgramInfoLog(glCreateProgram));
                    GLES30.glDeleteProgram(glCreateProgram);
                    return 0;
                }
            }
            return glCreateProgram;
        }

        private int g(int i, String str) {
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
            int i2 = GL3ShaderViewFog.b;
            Log.e("GL2ShaderView", "Could not compile shader " + i + Constants.COLON_SEPARATOR);
            Log.e("GL2ShaderView", GLES30.glGetShaderInfoLog(glCreateShader));
            GLES30.glDeleteShader(glCreateShader);
            return 0;
        }

        public void h(Bitmap bitmap) {
            this.C = bitmap;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (this.r != this.s || this.t != this.u) {
                if (this.D == 0) {
                    int f2 = f("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nout vec4 fragColor;\nvec3 blendOverlay(in vec3 base, in vec3 blend) {\n    return mix(2.0 * base * blend, 1.0 - 2.0 * (1.0 - base) * (1.0 - blend), step(0.5, base));\n}\nvec3 dim(in vec3 baseColor) {\n    vec3 overlayColor = vec3(0.0);\n    vec3 overlayResult = blendOverlay(baseColor, overlayColor);\n    float overlayAlpha = 0.3;\n    return mix(baseColor, overlayResult, overlayAlpha);\n}\nvoid main() {\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    texUV.y = 1.0 - texUV.y;\n    vec4 baseColor = texture(u_background, texUV);\n    fragColor = vec4(dim(baseColor.rgb), baseColor.a);\n}\n");
                    this.D = f2;
                    this.E = GLES30.glGetAttribLocation(f2, "vPosition");
                    e("glGetAttribLocation");
                    this.F = GLES30.glGetUniformLocation(this.D, "u_background");
                    e("glGetAttribLocation");
                    this.G = GLES30.glGetUniformLocation(this.D, "u_resolution");
                    e("glGetUniformLocation");
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
                GLES30.glVertexAttribPointer(this.E, 2, 5126, false, 0, (Buffer) this.B);
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
            GLES30.glUniform1f(this.f7528g, (currentTimeMillis % 1000000) / 1000.0f);
            int i = this.r;
            if (i != this.s || this.t != this.u) {
                this.s = i;
                int i2 = this.t;
                this.u = i2;
                GLES30.glUniform2f(this.f7526e, i, i2);
            }
            if (this.v.a() != this.n) {
                float a = this.v.a();
                this.n = a;
                GLES30.glUniform1f(this.h, a);
            }
            if (this.w.a() != this.o) {
                float a2 = this.w.a();
                this.o = a2;
                GLES30.glUniform1f(this.i, a2);
            }
            if (this.x.a() != this.p) {
                float a3 = this.x.a();
                this.p = a3;
                GLES30.glUniform1f(this.j, a3);
            }
            int i3 = this.y;
            if (i3 != this.q) {
                this.q = i3;
                GLES30.glUniform3f(this.f7527f, Color.red(i3) / 255.0f, Color.green(this.q) / 255.0f, Color.blue(this.q) / 255.0f);
            }
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, this.k);
            GLES30.glUniform1i(this.f7524c, 0);
            GLES30.glActiveTexture(33985);
            GLES30.glBindTexture(3553, this.I);
            GLES30.glUniform1i(this.f7525d, 1);
            GLES30.glBindVertexArray(this.l);
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
            int f2 = f("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision highp float;\n#define PI 3.141592653589793\nuniform vec2 u_resolution;\nuniform float u_time;\nuniform sampler2D u_background;\nuniform sampler2D u_prepass;\nuniform float u_alpha;\nuniform float u_intensity;\nuniform float u_speed;\nuniform vec3 u_color;\nconst float LOD             = 9.0;\nconst int FBM_OCTAVES       = 4;\nconst float DUST_GRID_SIZE  = 80.0;\nconst float DUST_SIZE       = 2.0;\nconst vec2 SHIFT            = vec2(0.07, -0.03);\nout vec4 fragColor;\nfloat random(in vec2 uv) {\n    return fract(sin(dot(uv, vec2(12.9898, 78.233))) * 43758.5453123);\n}\nvec2 hash(in vec2 p) {\n    return fract(sin(vec2(dot(p, vec2(127.1, 311.7)),\n            dot(p, vec2(269.5, 183.3))))\n            * 43758.5453123);\n}\nfloat noise(in vec2 uv) {\n    vec2 i = floor(uv);\n    vec2 f = fract(uv);\n    float a = random(i);\n    float b = random(i + vec2(1.0, 0.0));\n    float c = random(i + vec2(0.0, 1.0));\n    float d = random(i + vec2(1.0, 1.0));\n    vec2 u = f * f * (3.0 - 2.0 * f);\n    return mix(a, b, u.x) +\n            (c - a) * u.y * (1.0 - u.x) +\n            (d - b) * u.x * u.y;\n}\nfloat fbm(in vec2 uv) {\n    float value = 0.0;\n    float amplitude = 0.5;\n    vec2 shiftUV = vec2(100.0);\n    mat2 rot = mat2(cos(0.5), sin(0.5),\n            -sin(0.5), cos(0.5));\n    for (int i = 0; i < FBM_OCTAVES; i++) {\n        value += amplitude * noise(uv);\n        uv = uv * rot * 2.0 + shiftUV;\n        amplitude *= 0.5;\n    }\n    return value;\n}\nfloat computeFog(in vec2 uv, in float t) {\n    uv += t * SHIFT;\n    vec2 q;\n    q.x = fbm(uv + 0.1 * t);\n    q.y = fbm(uv + 1.0);\n    vec2 r;\n    r.x = fbm(uv + q + vec2(1.7, 9.2) + 0.15 * t);\n    r.y = fbm(uv + q + vec2(8.3, 2.8) + 0.126 * t);\n    float f = fbm(uv + r) * u_intensity;\n    float end = mix(1.0, 0.5, u_intensity);\n    return smoothstep(0.0, end, f);\n}\nfloat computeDust(in float t) {\n    vec2 coord = gl_FragCoord.xy + u_resolution.y * t * SHIFT * 4.0;\n    float gridSize = mix(DUST_GRID_SIZE * 2.0, DUST_GRID_SIZE, u_intensity);\n    vec2 cellPos = floor(coord / gridSize);\n    vec2 randOffset = hash(cellPos);\n    vec2 drift = vec2(sin(t + randOffset.x * 6.28318),\n            cos(t + randOffset.y * 6.28318)) * gridSize;\n    vec2 dustCenter = (cellPos + randOffset) * gridSize + drift;\n    float d = length(coord - dustCenter);\n    float particle = 1.0 - smoothstep(0.0, DUST_SIZE, d);\n    float brightness = mix(0.5, 1.0, randOffset.y);\n    return particle * brightness;\n}\nvoid main() {\n    vec2 uv = (gl_FragCoord.xy - 0.5 * u_resolution) / u_resolution.y;\n    float t = u_time * u_speed;\n    // 计算雾效果与尘埃\n    float fogEffect  = computeFog(uv, t);\n    float dustEffect = computeDust(t);\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    vec3 baseColor = texture(u_background, texUV).rgb;\n    vec3 prepassColor = textureLod(u_prepass, texUV, LOD).rgb;\n    // 将雾与尘埃和指定颜色混合\n    vec3 effectColor = mix(prepassColor, (fogEffect + dustEffect) * u_color, fogEffect);\n    vec3 finalColor  = mix(baseColor, effectColor, u_alpha);\n    fragColor = vec4(finalColor, 1.0);\n}\n");
            this.a = f2;
            if (f2 == 0) {
                return;
            }
            this.b = GLES30.glGetAttribLocation(f2, "vPosition");
            e("glGetAttribLocation");
            this.f7524c = GLES30.glGetUniformLocation(this.a, "u_background");
            e("glGetAttribLocation");
            this.f7525d = GLES30.glGetUniformLocation(this.a, "u_prepass");
            e("glGetAttribLocation");
            this.f7526e = GLES30.glGetUniformLocation(this.a, "u_resolution");
            e("glGetUniformLocation");
            this.f7527f = GLES30.glGetUniformLocation(this.a, "u_color");
            e("glGetUniformLocation");
            this.f7528g = GLES30.glGetUniformLocation(this.a, "u_time");
            e("glGetUniformLocation");
            this.h = GLES30.glGetUniformLocation(this.a, "u_alpha");
            e("glGetUniformLocation");
            this.i = GLES30.glGetUniformLocation(this.a, "u_intensity");
            e("glGetUniformLocation");
            this.j = GLES30.glGetUniformLocation(this.a, "u_speed");
            e("glGetUniformLocation");
            GLES30.glUseProgram(this.a);
            Bitmap bitmap = this.C;
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
            this.k = iArr[0];
            int[] iArr2 = new int[1];
            GLES30.glGenVertexArrays(1, iArr2, 0);
            int i = iArr2[0];
            this.l = i;
            GLES30.glBindVertexArray(i);
            int[] iArr3 = new int[1];
            GLES30.glGenBuffers(1, iArr3, 0);
            int i2 = iArr3[0];
            this.m = i2;
            GLES30.glBindBuffer(34962, i2);
            GLES30.glBufferData(34962, this.A.length * 4, this.B, 35044);
            GLES30.glEnableVertexAttribArray(this.b);
            GLES30.glVertexAttribPointer(this.b, 2, 5126, false, 0, 0);
            GLES30.glBindBuffer(34962, 0);
            GLES30.glBindVertexArray(0);
            GLES30.glUseProgram(0);
        }
    }

    public GL3ShaderViewFog(Context context) {
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

    public void setShaderAlpha(float f2) {
        this.a.v.b(f2);
    }

    public void setShaderColor(int i) {
        this.a.y = i;
    }

    public void setShaderIntensity(float f2) {
        this.a.w.b(f2);
    }

    public void setShaderSpeed(float f2) {
        this.a.x.b(f2);
    }

    public GL3ShaderViewFog(Context context, AttributeSet attributeSet) {
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
