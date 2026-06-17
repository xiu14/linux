.class public abstract Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/frames/data/listeners/BillingProcessesListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ldev/jahir/frames/data/Preferences;",
        ">",
        "Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity<",
        "TP;>;",
        "Ldev/jahir/frames/data/listeners/BillingProcessesListener;"
    }
.end annotation


# instance fields
.field private final billingEnabled:Z

.field private final billingLoadingDialog$delegate:Lp4/c;

.field private final billingViewModel$delegate:Lp4/c;

.field private purchasesDialog:Landroidx/appcompat/app/r;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$1;-><init>(Lb/q;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/a1;

    .line 10
    .line 11
    const-class v2, Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$2;-><init>(Lb/q;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyViewModel$$inlined$viewModels$default$3;-><init>(Ld5/a;Lb/q;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingViewModel$delegate:Lp4/c;

    .line 32
    .line 33
    new-instance v0, La2/c;

    .line 34
    .line 35
    const/16 v1, 0x11

    .line 36
    .line 37
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingLoadingDialog$delegate:Lp4/c;

    .line 45
    .line 46
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static synthetic G(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onProductPurchaseError$lambda$6(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
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

.method public static synthetic H(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Ljava/util/List;Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->showDonationsDialog$lambda$4$lambda$3(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Ljava/util/List;Landroid/content/DialogInterface;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic I(Ljava/util/ArrayList;Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->showDonationsDialog$lambda$4(Ljava/util/List;Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic J(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onProductPurchaseSuccess$lambda$5(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
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

.method public static synthetic K()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingLoadingDialog_delegate$lambda$0()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private static final billingLoadingDialog_delegate$lambda$0()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;->Companion:Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog$Companion;->create()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private final dismissDialogs()V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingLoadingDialog()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :try_start_1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->purchasesDialog:Landroidx/appcompat/app/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 13
    .line 14
    .line 15
    :catch_1
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->purchasesDialog:Landroidx/appcompat/app/r;

    .line 17
    .line 18
    return-void
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

.method private final getBillingLoadingDialog()Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingLoadingDialog$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;

    .line 8
    .line 9
    return-object v0
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

.method private static final onProductPurchaseError$lambda$6(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 3

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/frames/R$string;->error:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/frames/R$string;->unexpected_error_occurred:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {p0, v0, v1, v2, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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

.method private static final onProductPurchaseSuccess$lambda$5(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/frames/R$string;->donate_success_title:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/frames/R$string;->donate_success_content:I

    .line 12
    .line 13
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    new-array v2, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v1, v2, v3

    .line 22
    .line 23
    invoke-static {p0, v0, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    const/4 v0, 0x2

    .line 32
    const v1, 0x104000a

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v1, p0, v0, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton$default(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;ILjava/lang/Object;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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

.method private static final showDonationsDialog$lambda$4(Ljava/util/List;Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 7

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/frames/R$string;->donate:I

    .line 7
    .line 8
    invoke-static {p2, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v2, p0

    .line 16
    move-object v1, p2

    .line 17
    invoke-static/range {v1 .. v6}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->singleChoiceItems$default(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/util/List;ILd5/p;ILjava/lang/Object;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    const/4 p2, 0x2

    .line 22
    const/high16 v0, 0x1040000

    .line 23
    .line 24
    invoke-static {v1, v0, p0, p2, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->negativeButton$default(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;ILjava/lang/Object;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 25
    .line 26
    .line 27
    sget p0, Ldev/jahir/frames/R$string;->donate:I

    .line 28
    .line 29
    new-instance p2, Ldev/jahir/blueprint/ui/activities/b;

    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    invoke-direct {p2, v0, p1, v2}, Ldev/jahir/blueprint/ui/activities/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p0, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final showDonationsDialog$lambda$4$lambda$3(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;Ljava/util/List;Landroid/content/DialogInterface;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Landroidx/appcompat/app/r;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p2

    .line 12
    check-cast v0, Landroidx/appcompat/app/r;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/appcompat/app/r;->m:Landroidx/appcompat/app/q;

    .line 19
    .line 20
    iget-object v1, v0, Landroidx/appcompat/app/q;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    :goto_1
    if-lez v0, :cond_4

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    const/4 v0, -0x1

    .line 40
    :goto_2
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ldev/jahir/frames/data/models/CleanProductDetails;

    .line 49
    .line 50
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/CleanProductDetails;->getOriginalDetails()Lp3/l;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v1, p0, p1}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->launchBillingFlow(Landroidx/fragment/app/q0;Lp3/l;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 61
    .line 62
    return-object p0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public getBillingEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingEnabled:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public final getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->billingViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 8
    .line 9
    return-object v0
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

.method public getDonationItemsIds()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget v0, Ldev/jahir/frames/R$array;->donation_items:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v0, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_1

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    invoke-static {v4}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-object v1

    .line 33
    :catch_0
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 34
    .line 35
    return-object v0
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public getInAppPurchasesItemsIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public getSubscriptionsItemsIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public final isBillingClientReady()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
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

.method public onBillingClientDisconnected()V
    .locals 0

    .line 1
    invoke-static {p0}, Lj4/b;->a(Ldev/jahir/frames/data/listeners/BillingProcessesListener;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->invalidateOptionsMenu()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public onBillingClientReady()V
    .locals 2

    .line 1
    invoke-static {p0}, Lj4/b;->b(Ldev/jahir/frames/data/listeners/BillingProcessesListener;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->invalidateOptionsMenu()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getDonationItemsIds()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getInAppPurchasesItemsIds()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->queryInAppProductDetailsList(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getSubscriptionsItemsIds()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->querySubscriptionsProductDetailsList(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingEnabled()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->setBillingProcessesListener(Ldev/jahir/frames/data/listeners/BillingProcessesListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->observe(Landroidx/lifecycle/w;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->initialize()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget v1, Ldev/jahir/frames/R$id;->donate:I

    .line 11
    .line 12
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->isBillingClientReady()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getDonationItemsIds()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 38
    .line 39
    .line 40
    :cond_1
    return v0
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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

.method public onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->dismissDialogs()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, p0, v3, v1, v2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->destroy$default(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Landroidx/lifecycle/w;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public onInAppProductDetailsListUpdated(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "productDetailsList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/b;->c(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->invalidateOptionsMenu()V

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

.method public onInAppPurchasesHistoryUpdated(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lj4/b;->d(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInAppSkuDetailsListUpdated(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lj4/b;->e(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onProductPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->dismissDialogs()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ldev/jahir/frames/ui/activities/base/a;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p1, p0, v0}, Ldev/jahir/frames/ui/activities/base/a;-><init>(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->purchasesDialog:Landroidx/appcompat/app/r;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public onProductPurchaseSuccess(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->dismissDialogs()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ldev/jahir/frames/ui/activities/base/a;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, Ldev/jahir/frames/ui/activities/base/a;-><init>(Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->purchasesDialog:Landroidx/appcompat/app/r;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->getPreferences()Ldev/jahir/frames/data/Preferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ldev/jahir/frames/data/Preferences;->isFirstRun()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getFirstInstallTime(Landroid/content/Context;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const-wide/16 v2, 0x2710

    .line 19
    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-lez v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->getPreferences()Ldev/jahir/frames/data/Preferences;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/Preferences;->setFirstRun(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
    .line 33
.end method

.method public onSkuPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/b;->f(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSkuPurchaseSuccess(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/b;->g(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSubscriptionsProductDetailsListUpdated(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "productDetailsList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/b;->h(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->invalidateOptionsMenu()V

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

.method public onSubscriptionsPurchasesHistoryUpdated(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lj4/b;->i(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSubscriptionsSkuDetailsListUpdated(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lj4/b;->j(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ljava/util/List;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final showDonationsDialog()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->isBillingClientReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, v2, v1, v2}, Lj4/b;->u(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ldev/jahir/frames/data/models/DetailedPurchaseRecord;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getBillingViewModel()Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetails()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v0}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lp3/l;

    .line 45
    .line 46
    new-instance v5, Ldev/jahir/frames/data/models/CleanProductDetails;

    .line 47
    .line 48
    invoke-direct {v5, v4}, Ldev/jahir/frames/data/models/CleanProductDetails;-><init>(Lp3/l;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/4 v5, 0x0

    .line 65
    :cond_2
    :goto_1
    if-ge v5, v4, :cond_3

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    add-int/lit8 v5, v5, 0x1

    .line 72
    .line 73
    move-object v7, v6

    .line 74
    check-cast v7, Ldev/jahir/frames/data/models/CleanProductDetails;

    .line 75
    .line 76
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->getDonationItemsIds()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v7}, Ldev/jahir/frames/data/models/CleanProductDetails;->getOriginalDetails()Lp3/l;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    iget-object v7, v7, Lp3/l;->c:Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v8, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    invoke-static {p0, v2, v1, v2}, Lj4/b;->u(Ldev/jahir/frames/data/listeners/BillingProcessesListener;Ldev/jahir/frames/data/models/DetailedPurchaseRecord;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->dismissDialogs()V

    .line 107
    .line 108
    .line 109
    new-instance v1, Ldev/jahir/blueprint/ui/activities/b;

    .line 110
    .line 111
    const/4 v2, 0x4

    .line 112
    invoke-direct {v1, v2, v0, p0}, Ldev/jahir/blueprint/ui/activities/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, v1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->purchasesDialog:Landroidx/appcompat/app/r;

    .line 120
    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 124
    .line 125
    .line 126
    :cond_5
    return-void
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
