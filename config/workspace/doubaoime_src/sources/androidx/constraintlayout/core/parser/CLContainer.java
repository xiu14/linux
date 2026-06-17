package androidx.constraintlayout.core.parser;

import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CLContainer extends CLElement {
    ArrayList<CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.mElements.add(cLElement);
        if (CLParser.DEBUG) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public CLElement get(String str) throws CLParsingException {
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLKey cLKey = (CLKey) it2.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException(a.t("no element for key <", str, ">"), this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        StringBuilder U = a.U("no array found for key <", str, ">, found [");
        U.append(cLElement.getStrClass());
        U.append("] : ");
        U.append(cLElement);
        throw new CLParsingException(U.toString(), this);
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        StringBuilder U = a.U("no boolean found for key <", str, ">, found [");
        U.append(cLElement.getStrClass());
        U.append("] : ");
        U.append(cLElement);
        throw new CLParsingException(U.toString(), this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        StringBuilder U = a.U("no float found for key <", str, ">, found [");
        U.append(cLElement.getStrClass());
        U.append("] : ");
        U.append(cLElement);
        throw new CLParsingException(U.toString(), this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        StringBuilder U = a.U("no int found for key <", str, ">, found [");
        U.append(cLElement.getStrClass());
        U.append("] : ");
        U.append(cLElement);
        throw new CLParsingException(U.toString(), this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        StringBuilder U = a.U("no object found for key <", str, ">, found [");
        U.append(cLElement.getStrClass());
        U.append("] : ");
        U.append(cLElement);
        throw new CLParsingException(U.toString(), this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLKey cLKey = (CLKey) it2.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        StringBuilder W = a.W("no string found for key <", str, ">, found [", cLElement != null ? cLElement.getStrClass() : null, "] : ");
        W.append(cLElement);
        throw new CLParsingException(W.toString(), this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if ((next instanceof CLKey) && ((CLKey) next).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if (next instanceof CLKey) {
                arrayList.add(((CLKey) next).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLKey cLKey = (CLKey) it2.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f2) {
        put(str, new CLNumber(f2));
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if (((CLKey) next).content().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.mElements.remove((CLElement) it3.next());
        }
    }

    public int size() {
        return this.mElements.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<CLElement> it2 = this.mElements.iterator();
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public String getStringOrNull(int i) {
        CLElement orNull = getOrNull(i);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public float getFloat(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException(a.j("no float at index ", i), this);
    }

    public int getInt(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException(a.j("no int at index ", i), this);
    }

    public CLElement getOrNull(int i) {
        if (i < 0 || i >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i);
    }

    public CLElement get(int i) throws CLParsingException {
        if (i >= 0 && i < this.mElements.size()) {
            return this.mElements.get(i);
        }
        throw new CLParsingException(a.j("no element at index ", i), this);
    }

    public CLArray getArray(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException(a.j("no array at index ", i), this);
    }

    public boolean getBoolean(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException(a.j("no boolean at index ", i), this);
    }

    public CLObject getObject(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException(a.j("no object at index ", i), this);
    }

    public String getString(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException(a.j("no string at index ", i), this);
    }
}
