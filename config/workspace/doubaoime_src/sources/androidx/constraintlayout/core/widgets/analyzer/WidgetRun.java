package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {
    protected ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public int matchConstraintsType;
    RunGroup runGroup;
    ConstraintWidget widget;
    DimensionDependency dimension = new DimensionDependency(this);
    public int orientation = 0;
    boolean resolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected RunType mRunType = RunType.NONE;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            ConstraintAnchor.Type.values();
            int[] iArr = new int[9];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BASELINE;
                iArr4[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.widget = constraintWidget;
    }

    private void resolveDimension(int i, int i2) {
        int i3 = this.matchConstraintsType;
        if (i3 == 0) {
            this.dimension.resolve(getLimitedDimension(i2, i));
            return;
        }
        if (i3 == 1) {
            this.dimension.resolve(Math.min(getLimitedDimension(this.dimension.wrapValue, i), i2));
            return;
        }
        if (i3 == 2) {
            ConstraintWidget parent = this.widget.getParent();
            if (parent != null) {
                if ((i == 0 ? parent.horizontalRun : parent.verticalRun).dimension.resolved) {
                    ConstraintWidget constraintWidget = this.widget;
                    this.dimension.resolve(getLimitedDimension((int) ((r9.value * (i == 0 ? constraintWidget.mMatchConstraintPercentWidth : constraintWidget.mMatchConstraintPercentHeight)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        ConstraintWidget constraintWidget2 = this.widget;
        WidgetRun widgetRun = constraintWidget2.horizontalRun;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.dimensionBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
            VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
            if (verticalWidgetRun.dimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                return;
            }
        }
        if (i == 0) {
            widgetRun = constraintWidget2.verticalRun;
        }
        if (widgetRun.dimension.resolved) {
            float dimensionRatio = constraintWidget2.getDimensionRatio();
            this.dimension.resolve(i == 1 ? (int) ((widgetRun.dimension.value / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * widgetRun.dimension.value) + 0.5f));
        }
    }

    protected final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.margin = i;
        dependencyNode2.dependencies.add(dependencyNode);
    }

    abstract void apply();

    abstract void applyToWidget();

    abstract void clear();

    protected final int getLimitedDimension(int i, int i2) {
        int max;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.widget;
            int i3 = constraintWidget.mMatchConstraintMaxWidth;
            max = Math.max(constraintWidget.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.widget;
            int i4 = constraintWidget2.mMatchConstraintMaxHeight;
            max = Math.max(constraintWidget2.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    protected final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int ordinal = constraintAnchor2.mType.ordinal();
        if (ordinal == 1) {
            return constraintWidget.horizontalRun.start;
        }
        if (ordinal == 2) {
            return constraintWidget.verticalRun.start;
        }
        if (ordinal == 3) {
            return constraintWidget.horizontalRun.end;
        }
        if (ordinal == 4) {
            return constraintWidget.verticalRun.end;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.verticalRun.baseline;
    }

    public long getWrapDimension() {
        if (this.dimension.resolved) {
            return r0.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.targets.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.start.targets.get(i2).run != this) {
                i++;
            }
        }
        int size2 = this.end.targets.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.end.targets.get(i3).run != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public boolean isDimensionResolved() {
        return this.dimension.resolved;
    }

    public boolean isResolved() {
        return this.resolved;
    }

    abstract void reset();

    abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    protected void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = constraintAnchor.getMargin() + target.value;
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i, i2);
            }
            DimensionDependency dimensionDependency = this.dimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i2) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                ConstraintWidget constraintWidget = this.widget;
                float horizontalBiasPercent = i == 0 ? constraintWidget.getHorizontalBiasPercent() : constraintWidget.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) ((((margin2 - margin) - this.dimension.value) * horizontalBiasPercent) + margin + 0.5f));
                this.end.resolve(this.start.value + this.dimension.value);
            }
        }
    }

    protected void updateRunEnd(Dependency dependency) {
    }

    protected void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i) {
        int i2;
        DimensionDependency dimensionDependency = this.dimension;
        if (!dimensionDependency.resolved) {
            return 0L;
        }
        long j = dimensionDependency.value;
        if (isCenterConnection()) {
            i2 = this.start.margin - this.end.margin;
        } else {
            if (i != 0) {
                return j - this.end.margin;
            }
            i2 = this.start.margin;
        }
        return j + i2;
    }

    protected final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.targets.add(this.dimension);
        dependencyNode.marginFactor = i;
        dependencyNode.marginDependency = dimensionDependency;
        dependencyNode2.dependencies.add(dependencyNode);
        dimensionDependency.dependencies.add(dependencyNode);
    }

    protected final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int ordinal = constraintAnchor2.mType.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.start;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.end;
        }
        return null;
    }
}
