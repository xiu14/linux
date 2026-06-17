.class Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/EndCompoundLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EndIconDelegates"
.end annotation


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:Lcom/google/android/material/textfield/EndCompoundLayout;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/EndCompoundLayout;La1/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->a:Landroid/util/SparseArray;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->b:Lcom/google/android/material/textfield/EndCompoundLayout;

    .line 12
    .line 13
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_endIconDrawable:I

    .line 14
    .line 15
    iget-object p2, p2, La1/w;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Landroid/content/res/TypedArray;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->c:I

    .line 25
    .line 26
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_passwordToggleDrawable:I

    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->d:I

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
