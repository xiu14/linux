.class public final Lb/p;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lb/q;


# direct methods
.method public synthetic constructor <init>(Lb/q;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/p;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lb/p;->i:Lb/q;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lb/p;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb/e0;

    .line 7
    .line 8
    new-instance v1, Lb/d;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lb/p;->i:Lb/q;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2}, Lb/d;-><init>(Lb/q;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lb/e0;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v2, 0x21

    .line 22
    .line 23
    if-lt v1, v2, :cond_1

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Landroidx/appcompat/app/z;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-direct {v2, v4, v3, v0}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {v3, v0}, Lb/q;->access$addObserverForBackInvoker(Lb/q;Lb/e0;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    return-object v0

    .line 62
    :pswitch_0
    new-instance v0, Lb/s;

    .line 63
    .line 64
    iget-object v1, p0, Lb/p;->i:Lb/q;

    .line 65
    .line 66
    invoke-static {v1}, Lb/q;->access$getReportFullyDrawnExecutor$p(Lb/q;)Lb/l;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v3, Lb/p;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-direct {v3, v1, v4}, Lb/p;-><init>(Lb/q;I)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v2, v3}, Lb/s;-><init>(Lb/l;Lb/p;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_1
    iget-object v0, p0, Lb/p;->i:Lb/q;

    .line 81
    .line 82
    invoke-virtual {v0}, Lb/q;->reportFullyDrawn()V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_2
    new-instance v0, Landroidx/lifecycle/w0;

    .line 89
    .line 90
    iget-object v1, p0, Lb/p;->i:Lb/q;

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_2

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const/4 v3, 0x0

    .line 112
    :goto_1
    invoke-direct {v0, v2, v1, v3}, Landroidx/lifecycle/w0;-><init>(Landroid/app/Application;Lw1/h;Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
