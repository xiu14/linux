.class public abstract Landroidx/preference/DialogPreference;
.super Landroidx/preference/Preference;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final U:Ljava/lang/CharSequence;

.field public final V:Ljava/lang/String;

.field public final W:Landroid/graphics/drawable/Drawable;

.field public final X:Ljava/lang/String;

.field public final Y:Ljava/lang/String;

.field public final Z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 30
    sget v0, Landroidx/preference/e0;->dialogPreferenceStyle:I

    const v1, 0x1010091

    invoke-static {p1, v0, v1}, Ld0/b;->b(Landroid/content/Context;II)I

    move-result v0

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    const/4 p4, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    sget-object v0, Landroidx/preference/k0;->DialogPreference:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    sget p2, Landroidx/preference/k0;->DialogPreference_dialogTitle:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_dialogTitle:I

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    .line 5
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    :cond_0
    iput-object p2, p0, Landroidx/preference/DialogPreference;->U:Ljava/lang/CharSequence;

    if-nez p2, :cond_1

    .line 7
    iget-object p2, p0, Landroidx/preference/Preference;->o:Ljava/lang/CharSequence;

    .line 8
    iput-object p2, p0, Landroidx/preference/DialogPreference;->U:Ljava/lang/CharSequence;

    .line 9
    :cond_1
    sget p2, Landroidx/preference/k0;->DialogPreference_dialogMessage:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_dialogMessage:I

    .line 10
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    .line 11
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 12
    :cond_2
    iput-object p2, p0, Landroidx/preference/DialogPreference;->V:Ljava/lang/String;

    .line 13
    sget p2, Landroidx/preference/k0;->DialogPreference_dialogIcon:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_dialogIcon:I

    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-nez p2, :cond_3

    .line 15
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 16
    :cond_3
    iput-object p2, p0, Landroidx/preference/DialogPreference;->W:Landroid/graphics/drawable/Drawable;

    .line 17
    sget p2, Landroidx/preference/k0;->DialogPreference_positiveButtonText:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_positiveButtonText:I

    .line 18
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    .line 19
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 20
    :cond_4
    iput-object p2, p0, Landroidx/preference/DialogPreference;->X:Ljava/lang/String;

    .line 21
    sget p2, Landroidx/preference/k0;->DialogPreference_negativeButtonText:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_negativeButtonText:I

    .line 22
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    .line 23
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 24
    :cond_5
    iput-object p2, p0, Landroidx/preference/DialogPreference;->Y:Ljava/lang/String;

    .line 25
    sget p2, Landroidx/preference/k0;->DialogPreference_dialogLayout:I

    sget p3, Landroidx/preference/k0;->DialogPreference_android_dialogLayout:I

    .line 26
    invoke-virtual {p1, p3, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    .line 27
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 28
    iput p2, p0, Landroidx/preference/DialogPreference;->Z:I

    .line 29
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/preference/a0;->i:Landroidx/preference/v;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroidx/preference/v;->onDisplayPreferenceDialog(Landroidx/preference/Preference;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
