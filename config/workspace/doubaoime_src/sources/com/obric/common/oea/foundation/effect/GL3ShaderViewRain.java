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
public class GL3ShaderViewRain extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int b = 0;
    private a a;

    private static class a implements GLSurfaceView.Renderer {
        private int B;
        private int C;
        private int D;
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f7535c;

        /* renamed from: d, reason: collision with root package name */
        private int f7536d;

        /* renamed from: e, reason: collision with root package name */
        private int f7537e;

        /* renamed from: f, reason: collision with root package name */
        private int f7538f;

        /* renamed from: g, reason: collision with root package name */
        private int f7539g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private Context w;
        private final float[] x;
        private FloatBuffer y;
        private Bitmap z;
        private float m = -1.0f;
        private float n = -1.0f;
        private float o = -1.0f;
        private int p = 0;
        private int q = 0;
        private int r = 0;
        private int s = 0;
        private e.i.a.a.a.a.a.a t = new e.i.a.a.a.a.a.a(1.0f);
        private e.i.a.a.a.a.a.a u = new e.i.a.a.a.a.a.a(1.0f);
        private e.i.a.a.a.a.a.a v = new e.i.a.a.a.a.a.a(0.25f);
        private int A = 0;
        private int E = 0;
        private int F = 0;

        public a(Context context) {
            float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
            this.x = fArr;
            this.w = context;
            FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            this.y = put;
            put.position(0);
        }

        private void d(String str) {
            int glGetError = GLES30.glGetError();
            if (glGetError == 0) {
                return;
            }
            int i = GL3ShaderViewRain.b;
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
                    int i = GL3ShaderViewRain.b;
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
            int i2 = GL3ShaderViewRain.b;
            Log.e("GL2ShaderView", "Could not compile shader " + i + Constants.COLON_SEPARATOR);
            Log.e("GL2ShaderView", GLES30.glGetShaderInfoLog(glCreateShader));
            GLES30.glDeleteShader(glCreateShader);
            return 0;
        }

        public void g(Bitmap bitmap) {
            this.z = bitmap;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (this.p != this.q || this.r != this.s) {
                if (this.A == 0) {
                    int e2 = e("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision mediump float;\nuniform vec2 u_resolution;\nuniform sampler2D u_background;\nout vec4 fragColor;\nvec3 blendOverlay(in vec3 base, in vec3 blend) {\n    return mix(2.0 * base * blend, 1.0 - 2.0 * (1.0 - base) * (1.0 - blend), step(0.5, base));\n}\nvec3 dim(in vec3 baseColor) {\n    vec3 overlayColor = vec3(0.0);\n    vec3 overlayResult = blendOverlay(baseColor, overlayColor);\n    float overlayAlpha = 0.3;\n    return mix(baseColor, overlayResult, overlayAlpha);\n}\nvoid main() {\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    texUV.y = 1.0 - texUV.y;\n    vec4 baseColor = texture(u_background, texUV);\n    fragColor = vec4(dim(baseColor.rgb), baseColor.a);\n}\n");
                    this.A = e2;
                    this.B = GLES30.glGetAttribLocation(e2, "vPosition");
                    d("glGetAttribLocation");
                    this.C = GLES30.glGetUniformLocation(this.A, "u_background");
                    d("glGetAttribLocation");
                    this.D = GLES30.glGetUniformLocation(this.A, "u_resolution");
                    d("glGetUniformLocation");
                }
                GLES30.glUseProgram(this.A);
                if (this.E == 0) {
                    int[] iArr = new int[1];
                    GLES30.glGenFramebuffers(1, iArr, 0);
                    this.E = iArr[0];
                }
                GLES30.glBindFramebuffer(36160, this.E);
                if (this.F == 0) {
                    int[] iArr2 = new int[1];
                    GLES30.glGenTextures(1, iArr2, 0);
                    this.F = iArr2[0];
                }
                GLES30.glBindTexture(3553, this.F);
                GLES30.glTexImage2D(3553, 0, 6408, this.p, this.r, 0, 6408, 5121, null);
                GLES30.glTexParameteri(3553, 10241, 9987);
                GLES30.glTexParameteri(3553, 10240, 9729);
                GLES30.glTexParameteri(3553, 10242, 33071);
                GLES30.glTexParameteri(3553, 10243, 33071);
                GLES30.glFramebufferTexture2D(36160, 36064, 3553, this.F, 0);
                GLES30.glBindFramebuffer(36160, 0);
                GLES30.glUseProgram(0);
                GLES30.glBindFramebuffer(36160, this.E);
                GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES30.glClear(16384);
                GLES30.glUseProgram(this.A);
                GLES30.glUniform2f(this.D, this.p, this.r);
                GLES30.glActiveTexture(33984);
                GLES30.glBindTexture(3553, this.j);
                GLES30.glUniform1i(this.C, 0);
                GLES30.glEnableVertexAttribArray(this.B);
                GLES30.glVertexAttribPointer(this.B, 2, 5126, false, 0, (Buffer) this.y);
                GLES30.glDrawArrays(6, 0, 4);
                GLES30.glBindTexture(3553, this.F);
                GLES30.glGenerateMipmap(3553);
                GLES30.glBindTexture(3553, 0);
                GLES30.glBindFramebuffer(36160, 0);
            }
            long currentTimeMillis = System.currentTimeMillis();
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(this.a);
            GLES30.glUniform1f(this.f7538f, (currentTimeMillis % 1000000) / 1000.0f);
            int i = this.p;
            if (i != this.q || this.r != this.s) {
                this.q = i;
                int i2 = this.r;
                this.s = i2;
                GLES30.glUniform2f(this.f7537e, i, i2);
            }
            if (this.t.a() != this.m) {
                float a = this.t.a();
                this.m = a;
                GLES30.glUniform1f(this.f7539g, a);
            }
            if (this.u.a() != this.n) {
                float a2 = this.u.a();
                this.n = a2;
                GLES30.glUniform1f(this.h, a2);
            }
            if (this.v.a() != this.o) {
                float a3 = this.v.a();
                this.o = a3;
                GLES30.glUniform1f(this.i, a3);
            }
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(3553, this.j);
            GLES30.glUniform1i(this.f7535c, 0);
            GLES30.glActiveTexture(33985);
            GLES30.glBindTexture(3553, this.F);
            GLES30.glUniform1i(this.f7536d, 1);
            GLES30.glBindVertexArray(this.k);
            GLES30.glDrawArrays(6, 0, 4);
            GLES30.glBindVertexArray(0);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            this.p = i;
            this.r = i2;
            GLES30.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int e2 = e("#version 300 es\nin vec4 vPosition;\nvoid main() {\n  gl_Position = vPosition;\n}\n", "#version 300 es\nprecision highp float;\nuniform vec2 u_resolution;\nuniform float u_time;\nuniform sampler2D u_background;\nuniform sampler2D u_prepass;\nuniform float u_alpha;\nuniform float u_intensity;\nuniform float u_speed;\nconst float LOD = 9.0;\nconst float RAIN_AMOUNT = 0.5;\nconst float RAIN_TURBIDITY = 2.0;\nconst float RAIN_TRAIL = 1.5;\nconst float MASK_SIZE = 0.55;\nconst float MASK_BLUR = 0.4;\nconst float MASK_RATIO = 1.75;\nout vec4 fragColor;\nvec3 random3(float seed) {\n    vec3 p3 = fract(vec3(seed) * vec3(0.1031, 0.11369, 0.13787));\n    p3 += dot(p3, p3.yzx + 19.19);\n    return fract(vec3((p3.x + p3.y) * p3.z,\n            (p3.x + p3.z) * p3.y,\n            (p3.y + p3.z) * p3.x));\n}\nfloat random(float t) {\n    return fract(sin(t * 12345.564) * 7658.76);\n}\nfloat saw(float border, float t) {\n    return smoothstep(0.0, border, t) * smoothstep(1.0, border, t);\n}\nvec2 computeDropLayer(vec2 uv, float time) {\n    vec2 originalUV = uv;\n    uv.y += time * 0.75;\n    vec2 gridBase = vec2(6.0, 1.0);\n    vec2 gridSize = gridBase * 2.0;\n    vec2 cellID = floor(uv * gridSize);\n    float columnOffset = random(cellID.x);\n    uv.y += columnOffset;\n    cellID = floor(uv * gridSize);\n    vec3 cellNoise = random3(cellID.x * 35.2 + cellID.y * 2376.1);\n    vec2 cellPos = fract(uv * gridSize) - vec2(0.5, 0.0);\n    float dropCenterX = cellNoise.x - 0.5;\n    float yFactor = originalUV.y * 20.0;\n    float wiggle = sin(yFactor + sin(yFactor));\n    dropCenterX += wiggle * (0.5 - abs(dropCenterX)) * (cellNoise.z - 0.5);\n    dropCenterX *= 0.7;\n    float timeOffset = fract(time + cellNoise.z);\n    float dropCenterY = (saw(0.85, timeOffset) - 0.5) * 0.9 + 0.5;\n    vec2 dropCenter = vec2(dropCenterX, dropCenterY);\n    float distToDrop = length((cellPos - dropCenter) * vec2(1.0, 6.0));\n    float mainDrop = smoothstep(0.4, 0.0, distToDrop);\n    float rFactor = sqrt(smoothstep(1.0, dropCenterY, cellPos.y));\n    float deltaX = abs(cellPos.x - dropCenterX);\n    float trailIntensity = smoothstep(0.23 * rFactor, 0.15 * rFactor * rFactor, deltaX);\n    float frontTrail = smoothstep(-0.02, 0.02, cellPos.y - dropCenterY);\n    trailIntensity *= frontTrail * rFactor * rFactor;\n    float trail2 = smoothstep(0.2 * rFactor, 0.0, deltaX);\n    float droplets = max(0.0, (sin(originalUV.y * (1.0 - originalUV.y) * 120.0) - cellPos.y))\n            * trail2 * frontTrail * cellNoise.z;\n    float adjustedY = fract(originalUV.y * 10.0) + (cellPos.y - 0.5);\n    float dropletsDist = length(cellPos - vec2(dropCenterX, adjustedY));\n    droplets = smoothstep(0.3, 0.0, dropletsDist);\n    float dropValue = mainDrop + droplets * rFactor * frontTrail;\n    return vec2(dropValue, trailIntensity);\n}\nfloat computeStaticDrops(vec2 uv, float time) {\n    uv *= 40.0;\n    vec2 cellID = floor(uv);\n    uv = fract(uv) - 0.5;\n    vec3 cellNoise = random3(cellID.x * 107.45 + cellID.y * 3543.654);\n    vec2 targetPos = (cellNoise.xy - 0.5) * 0.7;\n    float distanceToTarget = length(uv - targetPos);\n    float fade = saw(0.025, fract(time + cellNoise.z));\n    float dropsVal = smoothstep(0.3, 0.0, distanceToTarget)\n            * fract(cellNoise.z * 10.0) * fade;\n    return dropsVal;\n}\nvec2 computeDrops(vec2 uv, float time, float staticLevel, float layerOneLevel, float layerTwoLevel) {\n    float dropsStatic = computeStaticDrops(uv, time) * staticLevel;\n    vec2 dropLayerA = computeDropLayer(uv, time) * layerOneLevel;\n    vec2 dropLayerB = computeDropLayer(uv * 1.85, time) * layerTwoLevel;\n    float combinedDrops = dropsStatic + dropLayerA.x + dropLayerB.x;\n    combinedDrops = smoothstep(0.3, 1.0, combinedDrops);\n    return vec2(combinedDrops, max(dropLayerA.y * staticLevel, dropLayerB.y * layerOneLevel));\n}\nvoid main() {\n    vec2 uv = (gl_FragCoord.xy - 0.5 * u_resolution) / u_resolution.y;\n    float t = u_time * u_speed;\n    // 计算各层级系数\n    float staticLevel = smoothstep(-0.5, 1.0, RAIN_AMOUNT * u_intensity) * 2.0;\n    float layerOneLevel = smoothstep(0.25, 0.75, RAIN_AMOUNT * u_intensity);\n    float layerTwoLevel = smoothstep(0.0, 0.5, RAIN_AMOUNT * u_intensity);\n    // 计算雨滴效果\n    vec2 dropEffect = computeDrops(uv, t, staticLevel, layerOneLevel, layerTwoLevel);\n    // 根据屏幕坐标生成遮罩（一般用于限定雨滴的区域）\n    vec2 maskUV = (gl_FragCoord.xy - 0.5 * u_resolution) / u_resolution.y;\n    maskUV.x *= MASK_RATIO;\n    float mask = 1.0 - smoothstep(MASK_SIZE - MASK_BLUR, MASK_SIZE, length(maskUV));\n    vec2 maskedDropEffect = dropEffect * mask;\n    // 计算法线用于扰动预处理贴图\n    vec2 offset = vec2(0.001, 0.0);\n    float dropRight = computeDrops(uv + offset, t, staticLevel, layerOneLevel, layerTwoLevel).x * mask;\n    float dropDown  = computeDrops(uv + offset.yx, t, staticLevel, layerOneLevel, layerTwoLevel).x * mask;\n    vec2 normal = vec2(dropRight - maskedDropEffect.x,\n            dropDown - maskedDropEffect.x);\n    // 焦点根据拖尾效果混合两个采样 LOD\n    float focus = mix(LOD - maskedDropEffect.y * RAIN_TRAIL, RAIN_TURBIDITY, smoothstep(0.1, 0.2, maskedDropEffect.x));\n    vec2 texUV = gl_FragCoord.xy / u_resolution;\n    vec3 baseColor = texture(u_background, texUV).rgb;\n    vec3 effectColor = textureLod(u_prepass, texUV + normal, focus).rgb;\n    vec3 finalColor = mix(baseColor, effectColor, u_alpha);\n    fragColor = vec4(finalColor, 1.0);\n}\n");
            this.a = e2;
            if (e2 == 0) {
                return;
            }
            this.b = GLES30.glGetAttribLocation(e2, "vPosition");
            d("glGetAttribLocation");
            this.f7535c = GLES30.glGetUniformLocation(this.a, "u_background");
            d("glGetAttribLocation");
            this.f7536d = GLES30.glGetUniformLocation(this.a, "u_prepass");
            d("glGetAttribLocation");
            this.f7537e = GLES30.glGetUniformLocation(this.a, "u_resolution");
            d("glGetUniformLocation");
            this.f7538f = GLES30.glGetUniformLocation(this.a, "u_time");
            d("glGetUniformLocation");
            this.f7539g = GLES30.glGetUniformLocation(this.a, "u_alpha");
            d("glGetUniformLocation");
            this.h = GLES30.glGetUniformLocation(this.a, "u_intensity");
            d("glGetUniformLocation");
            this.i = GLES30.glGetUniformLocation(this.a, "u_speed");
            d("glGetUniformLocation");
            GLES30.glUseProgram(this.a);
            Bitmap bitmap = this.z;
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
            this.j = iArr[0];
            int[] iArr2 = new int[1];
            GLES30.glGenVertexArrays(1, iArr2, 0);
            int i = iArr2[0];
            this.k = i;
            GLES30.glBindVertexArray(i);
            int[] iArr3 = new int[1];
            GLES30.glGenBuffers(1, iArr3, 0);
            int i2 = iArr3[0];
            this.l = i2;
            GLES30.glBindBuffer(34962, i2);
            GLES30.glBufferData(34962, this.x.length * 4, this.y, 35044);
            GLES30.glEnableVertexAttribArray(this.b);
            GLES30.glVertexAttribPointer(this.b, 2, 5126, false, 0, 0);
            GLES30.glBindBuffer(34962, 0);
            GLES30.glBindVertexArray(0);
            GLES30.glUseProgram(0);
        }
    }

    public GL3ShaderViewRain(Context context) {
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
        this.a.g(bitmap);
    }

    public void setShaderAlpha(float f2) {
        this.a.t.b(f2);
    }

    public void setShaderIntensity(float f2) {
        this.a.u.b(f2);
    }

    public void setShaderSpeed(float f2) {
        this.a.v.b(f2);
    }

    public GL3ShaderViewRain(Context context, AttributeSet attributeSet) {
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
