package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;
import e.a.a.a.a;

/* loaded from: classes.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;

        static {
            AttributeType.values();
            int[] iArr = new int[8];
            $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType = iArr;
            try {
                AttributeType attributeType = AttributeType.REFERENCE_TYPE;
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType2 = AttributeType.BOOLEAN_TYPE;
                iArr2[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType3 = AttributeType.STRING_TYPE;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType4 = AttributeType.COLOR_TYPE;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType5 = AttributeType.COLOR_DRAWABLE_TYPE;
                iArr5[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType6 = AttributeType.INT_TYPE;
                iArr6[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType7 = AttributeType.FLOAT_TYPE;
                iArr7[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;
                AttributeType attributeType8 = AttributeType.DIMENSION_TYPE;
                iArr8[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f2, float f3, float f4) {
        float f5 = f2 * 6.0f;
        int i = (int) f5;
        float f6 = f5 - i;
        float f7 = f4 * 255.0f;
        int a = (int) a.a(1.0f, f3, f7, 0.5f);
        int i2 = (int) (((1.0f - (f6 * f3)) * f7) + 0.5f);
        int i3 = (int) (((1.0f - ((1.0f - f6) * f3)) * f7) + 0.5f);
        int i4 = (int) (f7 + 0.5f);
        if (i == 0) {
            return ((i4 << 16) + (i3 << 8) + a) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 1) {
            return ((i2 << 16) + (i4 << 8) + a) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 2) {
            return ((a << 16) + (i4 << 8) + i3) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 3) {
            return ((a << 16) + (i2 << 8) + i4) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 4) {
            return ((i3 << 16) + (a << 8) + i4) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i != 5) {
            return 0;
        }
        return ((i4 << 16) + (a << 8) + i2) | ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (attributeType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue == customAttribute.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                return this.mColorValue == customAttribute.mColorValue;
            case STRING_TYPE:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case BOOLEAN_TYPE:
                return this.mBooleanValue == customAttribute.mBooleanValue;
            case DIMENSION_TYPE:
                return this.mFloatValue == customAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i) {
        this.mColorValue = i;
    }

    public void setFloatValue(float f2) {
        this.mFloatValue = f2;
    }

    public void setIntValue(int i) {
        this.mIntegerValue = i;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.mFloatValue = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.mStringValue = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }
}
