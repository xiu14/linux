.class public final Ll/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La1/q;Ll/f;Ll/o;Ll/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/e;->h:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/e;->l:Ljava/lang/Object;

    iput-object p2, p0, Ll/e;->i:Ljava/lang/Object;

    iput-object p3, p0, Ll/e;->j:Ljava/lang/Object;

    iput-object p4, p0, Ll/e;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lm0/o1;Lu2/e;Landroid/animation/ValueAnimator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/e;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/e;->i:Ljava/lang/Object;

    iput-object p2, p0, Ll/e;->j:Ljava/lang/Object;

    iput-object p3, p0, Ll/e;->k:Ljava/lang/Object;

    iput-object p4, p0, Ll/e;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ll/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll/e;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Ll/e;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lm0/o1;

    .line 13
    .line 14
    iget-object v2, p0, Ll/e;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lu2/e;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lm0/k1;->h(Landroid/view/View;Lm0/o1;Lu2/e;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Ll/e;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, Ll/e;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La1/q;

    .line 32
    .line 33
    iget-object v0, v0, La1/q;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ll/g;

    .line 36
    .line 37
    iget-object v1, p0, Ll/e;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ll/o;

    .line 40
    .line 41
    iget-object v2, p0, Ll/e;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Ll/f;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    iput-boolean v3, v0, Ll/g;->G:Z

    .line 49
    .line 50
    iget-object v2, v2, Ll/f;->b:Ll/m;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v2, v3}, Ll/m;->c(Z)V

    .line 54
    .line 55
    .line 56
    iput-boolean v3, v0, Ll/g;->G:Z

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v1}, Ll/o;->isEnabled()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Ll/o;->hasSubMenu()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v0, p0, Ll/e;->k:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ll/m;

    .line 73
    .line 74
    const/4 v2, 0x4

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-virtual {v0, v1, v3, v2}, Ll/m;->q(Landroid/view/MenuItem;Ll/y;I)Z

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
