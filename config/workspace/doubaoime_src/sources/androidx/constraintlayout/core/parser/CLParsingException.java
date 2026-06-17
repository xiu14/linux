package androidx.constraintlayout.core.parser;

import e.a.a.a.a;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            this.mLineNumber = cLElement.getLine();
        } else {
            this.mElementClass = "unknown";
            this.mLineNumber = 0;
        }
    }

    public String reason() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mReason);
        sb.append(" (");
        sb.append(this.mElementClass);
        sb.append(" at line ");
        return a.D(sb, this.mLineNumber, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder M = a.M("CLParsingException (");
        M.append(hashCode());
        M.append(") : ");
        M.append(reason());
        return M.toString();
    }
}
