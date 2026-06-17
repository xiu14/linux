.class public Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;
.super Landroidx/appcompat/app/t0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment$BottomSheetDismissCallback;
    }
.end annotation


# instance fields
.field private waitingForDismissAllowingStateLoss:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/t0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public static access$100(Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->waitingForDismissAllowingStateLoss:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/y;->dismiss()V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->e()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    iget-boolean v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:Z

    .line 21
    .line 22
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/y;->dismiss()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public dismissAllowingStateLoss()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->e()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    iget-boolean v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:Z

    .line 21
    .line 22
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    new-instance p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getTheme()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Landroid/util/TypedValue;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget v4, Lcom/google/android/material/R$attr;->bottomSheetDialogTheme:I

    .line 24
    .line 25
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget v1, Lcom/google/android/material/R$style;->Theme_Design_Light_BottomSheetDialog:I

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/s0;-><init>(Landroid/content/Context;I)V

    .line 37
    .line 38
    .line 39
    iput-boolean v2, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->q:Z

    .line 40
    .line 41
    iput-boolean v2, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->r:Z

    .line 42
    .line 43
    new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$5;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$5;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->w:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/appcompat/app/s0;->c()Landroidx/appcompat/app/b0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b0;->k(I)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget v1, Lcom/google/android/material/R$attr;->enableEdgeToEdge:I

    .line 66
    .line 67
    filled-new-array {v1}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->u:Z

    .line 81
    .line 82
    return-object p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
