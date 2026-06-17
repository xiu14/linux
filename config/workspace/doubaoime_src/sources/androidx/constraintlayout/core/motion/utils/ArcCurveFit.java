package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i, double d2, double d3, double d4, double d5, double d6, double d7) {
            this.linear = false;
            this.mVertical = i == 1;
            this.mTime1 = d2;
            this.mTime2 = d3;
            this.mOneOverDeltaTime = 1.0d / (d3 - d2);
            if (3 == i) {
                this.linear = true;
            }
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            if (!this.linear && Math.abs(d8) >= EPSILON && Math.abs(d9) >= EPSILON) {
                this.mLut = new double[101];
                boolean z = this.mVertical;
                this.mEllipseA = d8 * (z ? -1 : 1);
                this.mEllipseB = d9 * (z ? 1 : -1);
                this.mEllipseCenterX = z ? d6 : d4;
                this.mEllipseCenterY = z ? d5 : d7;
                buildTable(d4, d5, d6, d7);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d4;
            this.mX2 = d6;
            this.mY1 = d5;
            this.mY2 = d7;
            double hypot = Math.hypot(d9, d8);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d10 = this.mTime2;
            double d11 = this.mTime1;
            this.mEllipseCenterX = d8 / (d10 - d11);
            this.mEllipseCenterY = d9 / (d10 - d11);
        }

        private void buildTable(double d2, double d3, double d4, double d5) {
            double d6;
            double d7 = d4 - d2;
            double d8 = d3 - d5;
            int i = 0;
            double d9 = 0.0d;
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (true) {
                if (i >= ourPercent.length) {
                    break;
                }
                double d12 = d9;
                double radians = Math.toRadians((i * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d7;
                double cos = Math.cos(radians) * d8;
                if (i > 0) {
                    d6 = Math.hypot(sin - d10, cos - d11) + d12;
                    ourPercent[i] = d6;
                } else {
                    d6 = d12;
                }
                i++;
                d11 = cos;
                d9 = d6;
                d10 = sin;
            }
            double d13 = d9;
            this.mArcDistance = d13;
            int i2 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.mLut.length) {
                    return;
                }
                double length = i3 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(ourPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i3] = binarySearch / (ourPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i3] = 0.0d;
                } else {
                    int i4 = -binarySearch;
                    int i5 = i4 - 2;
                    double[] dArr2 = ourPercent;
                    this.mLut[i3] = (((length - dArr2[i5]) / (dArr2[i4 - 1] - dArr2[i5])) + i5) / (dArr2.length - 1);
                }
                i3++;
            }
        }

        double getDX() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        double getDY() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, d3);
            return this.mVertical ? (-d3) * hypot : d3 * hypot;
        }

        public double getLinearDX(double d2) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d2) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return ((this.mX2 - d4) * d3) + d4;
        }

        public double getLinearY(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return ((this.mY2 - d4) * d3) + d4;
        }

        double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        double lookup(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d2 * (dArr.length - 1);
            int i = (int) length;
            return ((dArr[i + 1] - dArr[i]) * (length - i)) + dArr[i];
        }

        void setPoint(double d2) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d2 : d2 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r5 == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L53
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r8 = r27[r4]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r8 = r27[r23]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d2 < arcArr[0].mTime1) {
                double d3 = arcArr[0].mTime1;
                double d4 = d2 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    dArr[0] = (this.mArcs[0].getLinearDX(d3) * d4) + arcArr[0].getLinearX(d3);
                    dArr[1] = (d4 * this.mArcs[0].getLinearDY(d3)) + this.mArcs[0].getLinearY(d3);
                    return;
                }
                arcArr[0].setPoint(d3);
                dArr[0] = (this.mArcs[0].getDX() * d4) + this.mArcs[0].getX();
                dArr[1] = (d4 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
                return;
            }
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                double d5 = arcArr[arcArr.length - 1].mTime2;
                double d6 = d2 - d5;
                int length = arcArr.length - 1;
                if (arcArr[length].linear) {
                    dArr[0] = (this.mArcs[length].getLinearDX(d5) * d6) + arcArr[length].getLinearX(d5);
                    dArr[1] = (d6 * this.mArcs[length].getLinearDY(d5)) + this.mArcs[length].getLinearY(d5);
                    return;
                }
                arcArr[length].setPoint(d2);
                dArr[0] = (this.mArcs[length].getDX() * d6) + this.mArcs[length].getX();
                dArr[1] = (d6 * this.mArcs[length].getDY()) + this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d2 < arcArr2[0].mTime1) {
                d2 = arcArr2[0].mTime1;
            }
            if (d2 > arcArr2[arcArr2.length - 1].mTime2) {
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i].mTime2) {
                if (arcArr3[i].linear) {
                    dArr[0] = arcArr3[i].getLinearX(d2);
                    dArr[1] = this.mArcs[i].getLinearY(d2);
                    return;
                } else {
                    arcArr3[i].setPoint(d2);
                    dArr[0] = this.mArcs[i].getX();
                    dArr[1] = this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        if (d2 < arcArr[0].mTime1) {
            d2 = arcArr[0].mTime1;
        } else if (d2 > arcArr[arcArr.length - 1].mTime2) {
            d2 = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            if (d2 <= arcArr2[i].mTime2) {
                if (arcArr2[i].linear) {
                    dArr[0] = arcArr2[i].getLinearDX(d2);
                    dArr[1] = this.mArcs[i].getLinearDY(d2);
                    return;
                } else {
                    arcArr2[i].setPoint(d2);
                    dArr[0] = this.mArcs[i].getDX();
                    dArr[1] = this.mArcs[i].getDY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i) {
        Arc[] arcArr = this.mArcs;
        int i2 = 0;
        if (d2 < arcArr[0].mTime1) {
            d2 = arcArr[0].mTime1;
        }
        if (d2 > arcArr[arcArr.length - 1].mTime2) {
            d2 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr2[i2].mTime2) {
                if (arcArr2[i2].linear) {
                    if (i == 0) {
                        return arcArr2[i2].getLinearDX(d2);
                    }
                    return arcArr2[i2].getLinearDY(d2);
                }
                arcArr2[i2].setPoint(d2);
                if (i == 0) {
                    return this.mArcs[i2].getDX();
                }
                return this.mArcs[i2].getDY();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d2 < arcArr[0].mTime1) {
                double d3 = arcArr[0].mTime1;
                double d4 = d2 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    fArr[0] = (float) ((this.mArcs[0].getLinearDX(d3) * d4) + arcArr[0].getLinearX(d3));
                    fArr[1] = (float) ((d4 * this.mArcs[0].getLinearDY(d3)) + this.mArcs[0].getLinearY(d3));
                    return;
                }
                arcArr[0].setPoint(d3);
                fArr[0] = (float) ((this.mArcs[0].getDX() * d4) + this.mArcs[0].getX());
                fArr[1] = (float) ((d4 * this.mArcs[0].getDY()) + this.mArcs[0].getY());
                return;
            }
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                double d5 = arcArr[arcArr.length - 1].mTime2;
                double d6 = d2 - d5;
                int length = arcArr.length - 1;
                if (arcArr[length].linear) {
                    fArr[0] = (float) ((this.mArcs[length].getLinearDX(d5) * d6) + arcArr[length].getLinearX(d5));
                    fArr[1] = (float) ((d6 * this.mArcs[length].getLinearDY(d5)) + this.mArcs[length].getLinearY(d5));
                    return;
                }
                arcArr[length].setPoint(d2);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d2 < arcArr2[0].mTime1) {
                d2 = arcArr2[0].mTime1;
            } else if (d2 > arcArr2[arcArr2.length - 1].mTime2) {
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i].mTime2) {
                if (arcArr3[i].linear) {
                    fArr[0] = (float) arcArr3[i].getLinearX(d2);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d2);
                    return;
                } else {
                    arcArr3[i].setPoint(d2);
                    fArr[0] = (float) this.mArcs[i].getX();
                    fArr[1] = (float) this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i) {
        int i2 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d2 < arcArr[0].mTime1) {
                double d3 = arcArr[0].mTime1;
                double d4 = d2 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    if (i == 0) {
                        return (d4 * this.mArcs[0].getLinearDX(d3)) + arcArr[0].getLinearX(d3);
                    }
                    return (d4 * this.mArcs[0].getLinearDY(d3)) + arcArr[0].getLinearY(d3);
                }
                arcArr[0].setPoint(d3);
                if (i == 0) {
                    return (d4 * this.mArcs[0].getDX()) + this.mArcs[0].getX();
                }
                return (d4 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
            }
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                double d5 = arcArr[arcArr.length - 1].mTime2;
                double d6 = d2 - d5;
                int length = arcArr.length - 1;
                if (i == 0) {
                    return (d6 * this.mArcs[length].getLinearDX(d5)) + arcArr[length].getLinearX(d5);
                }
                return (d6 * this.mArcs[length].getLinearDY(d5)) + arcArr[length].getLinearY(d5);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d2 < arcArr2[0].mTime1) {
                d2 = arcArr2[0].mTime1;
            } else if (d2 > arcArr2[arcArr2.length - 1].mTime2) {
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr3[i2].mTime2) {
                if (arcArr3[i2].linear) {
                    if (i == 0) {
                        return arcArr3[i2].getLinearX(d2);
                    }
                    return arcArr3[i2].getLinearY(d2);
                }
                arcArr3[i2].setPoint(d2);
                if (i == 0) {
                    return this.mArcs[i2].getX();
                }
                return this.mArcs[i2].getY();
            }
            i2++;
        }
    }
}
