package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e.a.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class CustomSupport {
    private static final String TAG = "CustomSupport";

    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            ConstraintAttribute.AttributeType.values();
            int[] iArr = new int[8];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                ConstraintAttribute.AttributeType attributeType = ConstraintAttribute.AttributeType.INT_TYPE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType2 = ConstraintAttribute.AttributeType.FLOAT_TYPE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType3 = ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType4 = ConstraintAttribute.AttributeType.COLOR_TYPE;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType5 = ConstraintAttribute.AttributeType.STRING_TYPE;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType6 = ConstraintAttribute.AttributeType.BOOLEAN_TYPE;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;
                ConstraintAttribute.AttributeType attributeType7 = ConstraintAttribute.AttributeType.DIMENSION_TYPE;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder M = a.M("set");
        M.append(constraintAttribute.getName());
        String sb = M.toString();
        try {
            boolean z = true;
            switch (constraintAttribute.getType()) {
                case INT_TYPE:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case FLOAT_TYPE:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case COLOR_TYPE:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case COLOR_DRAWABLE_TYPE:
                    Method method = cls.getMethod(sb, Drawable.class);
                    int clamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(clamp);
                    method.invoke(view, colorDrawable);
                    return;
                case STRING_TYPE:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.getName());
                case BOOLEAN_TYPE:
                    Method method2 = cls.getMethod(sb, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case DIMENSION_TYPE:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            StringBuilder U = a.U("cannot access method ", sb, " on View \"");
            U.append(Debug.getName(view));
            U.append("\"");
            Log.e(TAG, U.toString());
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            StringBuilder U2 = a.U("no method ", sb, " on View \"");
            U2.append(Debug.getName(view));
            U2.append("\"");
            Log.e(TAG, U2.toString());
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
