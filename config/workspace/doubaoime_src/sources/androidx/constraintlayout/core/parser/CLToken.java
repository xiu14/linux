package androidx.constraintlayout.core.parser;

import e.a.a.a.a;

/* loaded from: classes.dex */
public class CLToken extends CLElement {
    int index;
    char[] tokenFalse;
    char[] tokenNull;
    char[] tokenTrue;
    Type type;

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;

        static {
            Type.values();
            int[] iArr = new int[4];
            $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = iArr;
            try {
                Type type = Type.TRUE;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;
                Type type2 = Type.FALSE;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;
                Type type3 = Type.NULL;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;
                Type type4 = Type.UNKNOWN;
                iArr4[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.index = 0;
        this.type = Type.UNKNOWN;
        this.tokenTrue = "true".toCharArray();
        this.tokenFalse = "false".toCharArray();
        this.tokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.type;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        StringBuilder M = a.M("this token is not a boolean: <");
        M.append(content());
        M.append(">");
        throw new CLParsingException(M.toString(), this);
    }

    public Type getType() {
        return this.type;
    }

    public boolean isNull() throws CLParsingException {
        if (this.type == Type.NULL) {
            return true;
        }
        StringBuilder M = a.M("this token is not a null: <");
        M.append(content());
        M.append(">");
        throw new CLParsingException(M.toString(), this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (!CLParser.DEBUG) {
            return content();
        }
        StringBuilder M = a.M("<");
        M.append(content());
        M.append(">");
        return M.toString();
    }

    public boolean validate(char c2, long j) {
        int ordinal = this.type.ordinal();
        if (ordinal == 0) {
            char[] cArr = this.tokenTrue;
            int i = this.index;
            if (cArr[i] == c2) {
                this.type = Type.TRUE;
            } else if (this.tokenFalse[i] == c2) {
                this.type = Type.FALSE;
            } else if (this.tokenNull[i] == c2) {
                this.type = Type.NULL;
            }
            r1 = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.tokenTrue;
            int i2 = this.index;
            r1 = cArr2[i2] == c2;
            if (r1 && i2 + 1 == cArr2.length) {
                setEnd(j);
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.tokenFalse;
            int i3 = this.index;
            r1 = cArr3[i3] == c2;
            if (r1 && i3 + 1 == cArr3.length) {
                setEnd(j);
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.tokenNull;
            int i4 = this.index;
            r1 = cArr4[i4] == c2;
            if (r1 && i4 + 1 == cArr4.length) {
                setEnd(j);
            }
        }
        this.index++;
        return r1;
    }
}
