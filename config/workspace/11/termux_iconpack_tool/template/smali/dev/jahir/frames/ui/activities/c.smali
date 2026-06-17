.class public final synthetic Ldev/jahir/frames/ui/activities/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/l;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldev/jahir/frames/ui/activities/c;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/activities/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt4/f;

    .line 7
    .line 8
    instance-of v0, p1, Ln5/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Ln5/r;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return-object p1

    .line 17
    :pswitch_0
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_1
    const-string v0, "it"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lg5/d;->h:Lg5/c;

    .line 33
    .line 34
    invoke-virtual {p1}, Lg5/c;->a()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/high16 v0, 0x10000

    .line 39
    .line 40
    add-int/2addr p1, v0

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_2
    check-cast p1, Ldev/jahir/kuper/data/models/Component;

    .line 47
    .line 48
    invoke-static {p1}, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;->b(Ldev/jahir/kuper/data/models/Component;)Lp4/k;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_3
    check-cast p1, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 54
    .line 55
    invoke-static {p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->p(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_4
    check-cast p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-static {p1}, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;->a(Ljava/util/ArrayList;)Lp4/k;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :pswitch_5
    check-cast p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {p1}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->a(Ljava/util/ArrayList;)Lp4/k;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->p(Ljava/lang/String;)Lp4/k;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->q(Ljava/lang/String;)Lp4/k;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_8
    check-cast p1, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 89
    .line 90
    invoke-static {p1}, Ldev/jahir/frames/ui/fragments/viewer/IndeterminateProgressDialog;->h(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_9
    check-cast p1, Landroid/content/DialogInterface;

    .line 96
    .line 97
    invoke-static {p1}, Ldev/jahir/frames/ui/fragments/ChangelogKt;->c(Landroid/content/DialogInterface;)Lp4/k;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :pswitch_a
    check-cast p1, Landroid/content/DialogInterface;

    .line 103
    .line 104
    invoke-static {p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->x(Landroid/content/DialogInterface;)Lp4/k;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_b
    check-cast p1, Landroid/content/DialogInterface;

    .line 110
    .line 111
    invoke-static {p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->v(Landroid/content/DialogInterface;)Lp4/k;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :pswitch_c
    check-cast p1, Lp4/f;

    .line 117
    .line 118
    invoke-static {p1}, Ldev/jahir/frames/ui/activities/MuzeiSettingsActivity;->i(Lp4/f;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
