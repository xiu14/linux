.class public final synthetic Landroidx/appcompat/app/w;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/app/w;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/app/w;->i:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Landroidx/appcompat/app/w;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lo1/d;->a:Lk6/f;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Landroidx/appcompat/app/w;->i:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v3, v0, v1, v2}, Lo1/d;->t(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo1/c;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 26
    .line 27
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x1

    .line 32
    const-wide/16 v7, 0x0

    .line 33
    .line 34
    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Landroidx/appcompat/app/w;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    iget-object v2, p0, Landroidx/appcompat/app/w;->i:Landroid/content/Context;

    .line 41
    .line 42
    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/w;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    iget-object v0, p0, Landroidx/appcompat/app/w;->i:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {v0}, Landroidx/appcompat/app/b0;->r(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    const/16 v2, 0x21

    .line 59
    .line 60
    if-lt v0, v2, :cond_3

    .line 61
    .line 62
    new-instance v3, Landroid/content/ComponentName;

    .line 63
    .line 64
    const-string v4, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 65
    .line 66
    iget-object v5, p0, Landroidx/appcompat/app/w;->i:Landroid/content/Context;

    .line 67
    .line 68
    invoke-direct {v3, v5, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4, v3}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eq v4, v1, :cond_3

    .line 80
    .line 81
    if-lt v0, v2, :cond_0

    .line 82
    .line 83
    invoke-static {}, Landroidx/appcompat/app/b0;->c()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v2, Li0/j;

    .line 94
    .line 95
    new-instance v4, Li0/n;

    .line 96
    .line 97
    invoke-direct {v4, v0}, Li0/n;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v2, v4}, Li0/j;-><init>(Li0/l;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object v2, Landroidx/appcompat/app/b0;->j:Li0/j;

    .line 105
    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    sget-object v2, Li0/j;->b:Li0/j;

    .line 110
    .line 111
    :goto_0
    iget-object v0, v2, Li0/j;->a:Li0/l;

    .line 112
    .line 113
    invoke-interface {v0}, Li0/l;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-static {v5}, Lb0/m;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v2, "locale"

    .line 124
    .line 125
    invoke-virtual {v5, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    invoke-static {v0}, Landroidx/appcompat/app/x;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v2, v0}, Landroidx/appcompat/app/y;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0, v3, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 143
    .line 144
    .line 145
    :cond_3
    sput-boolean v1, Landroidx/appcompat/app/b0;->m:Z

    .line 146
    .line 147
    return-void

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
