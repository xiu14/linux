package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class BlendModeUtils {

    /* renamed from: androidx.core.graphics.BlendModeUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$core$graphics$BlendModeCompat;

        static {
            BlendModeCompat.values();
            int[] iArr = new int[29];
            $SwitchMap$androidx$core$graphics$BlendModeCompat = iArr;
            try {
                BlendModeCompat blendModeCompat = BlendModeCompat.CLEAR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat2 = BlendModeCompat.SRC;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat3 = BlendModeCompat.DST;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat4 = BlendModeCompat.SRC_OVER;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat5 = BlendModeCompat.DST_OVER;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat6 = BlendModeCompat.SRC_IN;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat7 = BlendModeCompat.DST_IN;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat8 = BlendModeCompat.SRC_OUT;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat9 = BlendModeCompat.DST_OUT;
                iArr9[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat10 = BlendModeCompat.SRC_ATOP;
                iArr10[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat11 = BlendModeCompat.DST_ATOP;
                iArr11[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat12 = BlendModeCompat.XOR;
                iArr12[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat13 = BlendModeCompat.PLUS;
                iArr13[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat14 = BlendModeCompat.MODULATE;
                iArr14[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat15 = BlendModeCompat.SCREEN;
                iArr15[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat16 = BlendModeCompat.OVERLAY;
                iArr16[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat17 = BlendModeCompat.DARKEN;
                iArr17[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                int[] iArr18 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat18 = BlendModeCompat.LIGHTEN;
                iArr18[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                int[] iArr19 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat19 = BlendModeCompat.COLOR_DODGE;
                iArr19[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr20 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat20 = BlendModeCompat.COLOR_BURN;
                iArr20[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr21 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat21 = BlendModeCompat.HARD_LIGHT;
                iArr21[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr22 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat22 = BlendModeCompat.SOFT_LIGHT;
                iArr22[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr23 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat23 = BlendModeCompat.DIFFERENCE;
                iArr23[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr24 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat24 = BlendModeCompat.EXCLUSION;
                iArr24[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr25 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat25 = BlendModeCompat.MULTIPLY;
                iArr25[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr26 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat26 = BlendModeCompat.HUE;
                iArr26[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr27 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat27 = BlendModeCompat.SATURATION;
                iArr27[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                int[] iArr28 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat28 = BlendModeCompat.COLOR;
                iArr28[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                int[] iArr29 = $SwitchMap$androidx$core$graphics$BlendModeCompat;
                BlendModeCompat blendModeCompat29 = BlendModeCompat.LUMINOSITY;
                iArr29[28] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
        }

        @Nullable
        @DoNotInline
        static Object obtainBlendModeFromCompat(@NonNull BlendModeCompat blendModeCompat) {
            switch (blendModeCompat) {
                case CLEAR:
                    return BlendMode.CLEAR;
                case SRC:
                    return BlendMode.SRC;
                case DST:
                    return BlendMode.DST;
                case SRC_OVER:
                    return BlendMode.SRC_OVER;
                case DST_OVER:
                    return BlendMode.DST_OVER;
                case SRC_IN:
                    return BlendMode.SRC_IN;
                case DST_IN:
                    return BlendMode.DST_IN;
                case SRC_OUT:
                    return BlendMode.SRC_OUT;
                case DST_OUT:
                    return BlendMode.DST_OUT;
                case SRC_ATOP:
                    return BlendMode.SRC_ATOP;
                case DST_ATOP:
                    return BlendMode.DST_ATOP;
                case XOR:
                    return BlendMode.XOR;
                case PLUS:
                    return BlendMode.PLUS;
                case MODULATE:
                    return BlendMode.MODULATE;
                case SCREEN:
                    return BlendMode.SCREEN;
                case OVERLAY:
                    return BlendMode.OVERLAY;
                case DARKEN:
                    return BlendMode.DARKEN;
                case LIGHTEN:
                    return BlendMode.LIGHTEN;
                case COLOR_DODGE:
                    return BlendMode.COLOR_DODGE;
                case COLOR_BURN:
                    return BlendMode.COLOR_BURN;
                case HARD_LIGHT:
                    return BlendMode.HARD_LIGHT;
                case SOFT_LIGHT:
                    return BlendMode.SOFT_LIGHT;
                case DIFFERENCE:
                    return BlendMode.DIFFERENCE;
                case EXCLUSION:
                    return BlendMode.EXCLUSION;
                case MULTIPLY:
                    return BlendMode.MULTIPLY;
                case HUE:
                    return BlendMode.HUE;
                case SATURATION:
                    return BlendMode.SATURATION;
                case COLOR:
                    return BlendMode.COLOR;
                case LUMINOSITY:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    private BlendModeUtils() {
    }

    @Nullable
    static PorterDuff.Mode obtainPorterDuffFromCompat(@Nullable BlendModeCompat blendModeCompat) {
        if (blendModeCompat == null) {
            return null;
        }
        switch (blendModeCompat) {
        }
        return null;
    }
}
