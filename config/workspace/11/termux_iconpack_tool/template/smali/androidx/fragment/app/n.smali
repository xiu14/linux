.class public final Landroidx/fragment/app/n;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroidx/fragment/app/p;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/p;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/n;->h:I

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/n;->i:Landroidx/fragment/app/p;

    iput-object p2, p0, Landroidx/fragment/app/n;->k:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/n;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/p;Ljava/lang/Object;Landroid/view/ViewGroup;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/n;->h:I

    .line 2
    iput-object p1, p0, Landroidx/fragment/app/n;->i:Landroidx/fragment/app/p;

    iput-object p2, p0, Landroidx/fragment/app/n;->j:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/n;->k:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Landroidx/fragment/app/n;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/n;->i:Landroidx/fragment/app/p;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, v0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const-string v4, "FragmentManager"

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    :cond_1
    if-ge v7, v3, :cond_3

    .line 29
    .line 30
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    add-int/lit8 v7, v7, 0x1

    .line 35
    .line 36
    check-cast v8, Landroidx/fragment/app/q;

    .line 37
    .line 38
    iget-object v8, v8, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 39
    .line 40
    iget-boolean v8, v8, Landroidx/fragment/app/h2;->g:Z

    .line 41
    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    invoke-static {v5}, Landroidx/fragment/app/j1;->K(I)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    const-string v3, "Completing animating immediately"

    .line 51
    .line 52
    invoke-static {v4, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_2
    new-instance v3, Li0/e;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroidx/fragment/app/q;

    .line 65
    .line 66
    iget-object v1, v1, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 67
    .line 68
    iget-object v1, v1, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 69
    .line 70
    new-instance v4, Landroidx/fragment/app/z;

    .line 71
    .line 72
    const/4 v5, 0x3

    .line 73
    invoke-direct {v4, v5, v0}, Landroidx/fragment/app/z;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Landroidx/fragment/app/n;->j:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v2, v1, v0, v3, v4}, Landroidx/fragment/app/c2;->u(Landroidx/fragment/app/l0;Ljava/lang/Object;Li0/e;Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Li0/e;->a()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    :goto_0
    invoke-static {v5}, Landroidx/fragment/app/j1;->K(I)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    const-string v1, "Animating to start"

    .line 92
    .line 93
    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_4
    iget-object v1, v0, Landroidx/fragment/app/p;->q:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v3, Landroidx/fragment/app/m;

    .line 102
    .line 103
    iget-object v4, p0, Landroidx/fragment/app/n;->k:Landroid/view/ViewGroup;

    .line 104
    .line 105
    invoke-direct {v3, v0, v4}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/p;Landroid/view/ViewGroup;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v1, v3}, Landroidx/fragment/app/c2;->d(Ljava/lang/Object;Landroidx/fragment/app/m;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/n;->i:Landroidx/fragment/app/p;

    .line 115
    .line 116
    iget-object v0, v0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 117
    .line 118
    iget-object v1, p0, Landroidx/fragment/app/n;->k:Landroid/view/ViewGroup;

    .line 119
    .line 120
    iget-object v2, p0, Landroidx/fragment/app/n;->j:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/c2;->e(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 126
    .line 127
    return-object v0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
