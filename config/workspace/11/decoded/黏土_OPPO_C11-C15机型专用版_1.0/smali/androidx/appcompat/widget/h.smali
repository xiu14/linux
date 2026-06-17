.class public final Landroidx/appcompat/widget/h;
.super Ll/w;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Landroidx/appcompat/widget/p;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/p;Landroid/content/Context;Ll/e0;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/widget/h;->l:I

    .line 9
    iput-object p1, p0, Landroidx/appcompat/widget/h;->m:Landroidx/appcompat/widget/p;

    .line 10
    sget v6, Lf/a;->actionOverflowMenuStyle:I

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 11
    invoke-direct/range {v1 .. v7}, Ll/w;-><init>(Landroid/content/Context;Ll/m;Landroid/view/View;ZII)V

    .line 12
    iget-object p2, v3, Ll/e0;->A:Ll/o;

    .line 13
    iget p2, p2, Ll/o;->x:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p1, Landroidx/appcompat/widget/p;->q:Landroidx/appcompat/widget/l;

    if-nez p2, :cond_1

    .line 15
    iget-object p2, p1, Landroidx/appcompat/widget/p;->o:Ll/a0;

    .line 16
    check-cast p2, Landroid/view/View;

    .line 17
    :cond_1
    iput-object p2, v1, Ll/w;->e:Landroid/view/View;

    .line 18
    :goto_0
    iget-object p1, p1, Landroidx/appcompat/widget/p;->E:Landroidx/appcompat/widget/m;

    .line 19
    iput-object p1, v1, Ll/w;->h:Ll/x;

    .line 20
    iget-object p2, v1, Ll/w;->i:Ll/u;

    if-eqz p2, :cond_2

    .line 21
    invoke-interface {p2, p1}, Ll/y;->f(Ll/x;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/p;Landroid/content/Context;Ll/m;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/widget/h;->l:I

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/h;->m:Landroidx/appcompat/widget/p;

    .line 2
    sget v6, Lf/a;->actionOverflowMenuStyle:I

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 3
    invoke-direct/range {v1 .. v7}, Ll/w;-><init>(Landroid/content/Context;Ll/m;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 4
    iput p2, v1, Ll/w;->f:I

    .line 5
    iget-object p1, p1, Landroidx/appcompat/widget/p;->E:Landroidx/appcompat/widget/m;

    .line 6
    iput-object p1, v1, Ll/w;->h:Ll/x;

    .line 7
    iget-object p2, v1, Ll/w;->i:Ll/u;

    if-eqz p2, :cond_0

    .line 8
    invoke-interface {p2, p1}, Ll/y;->f(Ll/x;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/h;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/h;->m:Landroidx/appcompat/widget/p;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/appcompat/widget/p;->j:Ll/m;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ll/m;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Landroidx/appcompat/widget/p;->A:Landroidx/appcompat/widget/h;

    .line 18
    .line 19
    invoke-super {p0}, Ll/w;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Landroidx/appcompat/widget/h;->m:Landroidx/appcompat/widget/p;

    .line 25
    .line 26
    iput-object v0, v1, Landroidx/appcompat/widget/p;->B:Landroidx/appcompat/widget/h;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, v1, Landroidx/appcompat/widget/p;->F:I

    .line 30
    .line 31
    invoke-super {p0}, Ll/w;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
