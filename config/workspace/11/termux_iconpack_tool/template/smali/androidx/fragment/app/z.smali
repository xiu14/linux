.class public final synthetic Landroidx/fragment/app/z;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/fragment/app/z;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/j1;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/j1;->n:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/lang/ClassCastException;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroidx/fragment/app/p;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-static {v1}, Landroidx/fragment/app/j1;->K(I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const-string v1, "FragmentManager"

    .line 48
    .line 49
    const-string v2, "Transition for all operations has completed"

    .line 50
    .line 51
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    :goto_0
    if-ge v3, v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    check-cast v4, Landroidx/fragment/app/q;

    .line 70
    .line 71
    iget-object v4, v4, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Landroidx/fragment/app/h2;->c(Landroidx/fragment/app/g2;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-void

    .line 78
    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    invoke-static {v1, v0}, Landroidx/fragment/app/v1;->a(ILjava/util/ArrayList;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_2
    iget-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lkotlin/jvm/internal/o;

    .line 90
    .line 91
    const-string v1, "$seekCancelLambda"

    .line 92
    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ld5/a;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-interface {v0}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void

    .line 106
    :pswitch_3
    iget-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroidx/fragment/app/l0;

    .line 109
    .line 110
    iget-object v1, v0, Landroidx/fragment/app/l0;->mViewLifecycleOwner:Landroidx/fragment/app/d2;

    .line 111
    .line 112
    iget-object v2, v0, Landroidx/fragment/app/l0;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 113
    .line 114
    iget-object v1, v1, Landroidx/fragment/app/d2;->m:Lw1/g;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lw1/g;->a(Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    iput-object v1, v0, Landroidx/fragment/app/l0;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
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
