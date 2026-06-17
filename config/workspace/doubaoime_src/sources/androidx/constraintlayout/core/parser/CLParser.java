package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            TYPE.values();
            int[] iArr = new int[7];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                TYPE type = TYPE.OBJECT;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;
                TYPE type2 = TYPE.ARRAY;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;
                TYPE type3 = TYPE.STRING;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;
                TYPE type4 = TYPE.NUMBER;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;
                TYPE type5 = TYPE.KEY;
                iArr5[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;
                TYPE type6 = TYPE.TOKEN;
                iArr6[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement allocate;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (type.ordinal()) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                allocate = CLNumber.allocate(cArr);
                break;
            case 4:
                allocate = CLString.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.lineNumber);
        if (z) {
            allocate.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i, char c2, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r' || c2 == ' ') {
            return cLElement;
        }
        if (c2 == '\"' || c2 == '\'') {
            return cLElement instanceof CLObject ? createElement(cLElement, i, TYPE.KEY, true, cArr) : createElement(cLElement, i, TYPE.STRING, true, cArr);
        }
        if (c2 == '[') {
            return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
        }
        if (c2 != ']') {
            if (c2 == '{') {
                return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
            }
            if (c2 != '}') {
                switch (c2) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i2 = i + 1;
                        if (i2 >= cArr.length || cArr[i2] != '/') {
                            return cLElement;
                        }
                        this.hasComment = true;
                        return cLElement;
                    default:
                        if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                            return createElement(cLElement, i, TYPE.KEY, true, cArr);
                        }
                        CLElement createElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                        CLToken cLToken = (CLToken) createElement;
                        if (cLToken.validate(c2, i)) {
                            return createElement;
                        }
                        throw new CLParsingException("incorrect token <" + c2 + "> at line " + this.lineNumber, cLToken);
                }
            }
        }
        cLElement.setEnd(i - 1);
        CLElement container = cLElement.getContainer();
        container.setEnd(i);
        return container;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLParser.parse():androidx.constraintlayout.core.parser.CLObject");
    }
}
