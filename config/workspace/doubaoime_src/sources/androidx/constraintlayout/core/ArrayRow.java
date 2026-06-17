package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable variable = null;
    float constantValue = 0.0f;
    boolean used = false;
    ArrayList<SolverVariable> variablesToUpdate = new ArrayList<>();
    boolean isSimpleDefinition = false;

    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f2, boolean z);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f2);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i);

        float getVariableValue(int i);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f2);

        float remove(SolverVariable solverVariable, boolean z);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f2)) {
                    f2 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i) {
        this.variables.put(linearSystem.createErrorVariable(i, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i, "em"), -1.0f);
        return this;
    }

    ArrayRow addSingleError(SolverVariable solverVariable, int i) {
        this.variables.put(solverVariable, i);
        return this;
    }

    boolean chooseSubject(LinearSystem linearSystem) {
        boolean z;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z = true;
        } else {
            pivot(chooseSubjectInVariables);
            z = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
        }
        return z;
    }

    SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        boolean isNew;
        boolean isNew2;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        SolverVariable solverVariable2 = null;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            SolverVariable variable = this.variables.getVariable(i);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (f2 > variableValue) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (!z && isNew(variable, linearSystem)) {
                    f2 = variableValue;
                    solverVariable = variable;
                    z = true;
                }
                z = isNew2;
                f2 = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    isNew = isNew(variable, linearSystem);
                } else if (f3 > variableValue) {
                    isNew = isNew(variable, linearSystem);
                } else if (!z2 && isNew(variable, linearSystem)) {
                    f3 = variableValue;
                    solverVariable2 = variable;
                    z2 = true;
                }
                z2 = isNew;
                f3 = variableValue;
                solverVariable2 = variable;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.constantValue = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.constantValue = i;
        } else if (f2 >= 1.0f) {
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            this.constantValue = -i2;
        } else {
            float f3 = 1.0f - f2;
            this.variables.put(solverVariable, f3 * 1.0f);
            this.variables.put(solverVariable2, f3 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f2);
            this.variables.put(solverVariable4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                this.constantValue = (i2 * f2) + ((-i) * f3);
            }
        }
        return this;
    }

    ArrayRow createRowDefinition(SolverVariable solverVariable, int i) {
        this.variable = solverVariable;
        float f2 = i;
        solverVariable.computedValue = f2;
        this.constantValue = f2;
        this.isSimpleDefinition = true;
        return this;
    }

    ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f2) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f2);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f2);
        this.variables.put(solverVariable4, -f2);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f2, float f3, float f4, SolverVariable solverVariable, int i, SolverVariable solverVariable2, int i2, SolverVariable solverVariable3, int i3, SolverVariable solverVariable4, int i4) {
        if (f3 == 0.0f || f2 == f4) {
            this.constantValue = ((-i) - i2) + i3 + i4;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.constantValue = (i4 * f5) + (i3 * f5) + ((-i) - i2);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f5);
            this.variables.put(solverVariable3, -f5);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f2, float f3, float f4, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.constantValue = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f2 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f4 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f5);
            this.variables.put(solverVariable3, -f5);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.constantValue = i * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.constantValue = i;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (z) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (z) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f2;
        return this;
    }

    void ensurePositiveConstant() {
        float f2 = this.constantValue;
        if (f2 < 0.0f) {
            this.constantValue = f2 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.variable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    boolean hasKeyVariable() {
        SolverVariable solverVariable = this.variable;
        return solverVariable != null && (solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f);
    }

    boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            for (int i = 0; i < arrayRow.variables.getCurrentSize(); i++) {
                this.variables.add(arrayRow.variables.getVariable(i), arrayRow.variables.getVariableValue(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.variable == null && this.constantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable.definitionId = -1;
            this.variable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.constantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    int sizeInBytes() {
        return this.variables.sizeInBytes() + (this.variable != null ? 4 : 0) + 4 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String toReadableString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.variable
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r10.variable
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
            float r1 = r10.constantValue
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            float r1 = r10.constantValue
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r10.variables
            int r5 = r5.getCurrentSize()
        L3b:
            if (r3 >= r5) goto L9a
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r10.variables
            androidx.constraintlayout.core.SolverVariable r6 = r6.getVariable(r3)
            if (r6 != 0) goto L46
            goto L97
        L46:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r10.variables
            float r7 = r7.getVariableValue(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto L97
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L74
            java.lang.String r1 = "- "
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
            goto L73
        L64:
            if (r8 <= 0) goto L6d
            java.lang.String r1 = " + "
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
            goto L74
        L6d:
            java.lang.String r1 = " - "
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
        L73:
            float r7 = r7 * r9
        L74:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7f
            java.lang.String r0 = e.a.a.a.a.s(r0, r6)
            goto L96
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L96:
            r1 = r4
        L97:
            int r3 = r3 + 1
            goto L3b
        L9a:
            if (r1 != 0) goto La2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        float f2 = this.variables.get(solverVariable);
        this.constantValue = (solverVariable.computedValue * f2) + this.constantValue;
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        float use = this.variables.use(arrayRow, z);
        this.constantValue = (arrayRow.constantValue * use) + this.constantValue;
        if (z) {
            arrayRow.variable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isSynonym) {
            return;
        }
        float f2 = this.variables.get(solverVariable);
        this.constantValue = (solverVariable.synonymDelta * f2) + this.constantValue;
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.synonym], f2, z);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int currentSize = this.variables.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                SolverVariable variable = this.variables.getVariable(i);
                if (variable.definitionId != -1 || variable.isFinalValue || variable.isSynonym) {
                    this.variablesToUpdate.add(variable);
                }
            }
            int size = this.variablesToUpdate.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    SolverVariable solverVariable = this.variablesToUpdate.get(i2);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.isSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.definitionId], true);
                    }
                }
                this.variablesToUpdate.clear();
            } else {
                z = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i = solverVariable.strength;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f2);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        }
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i, SolverVariable solverVariable2) {
        this.constantValue = i;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
